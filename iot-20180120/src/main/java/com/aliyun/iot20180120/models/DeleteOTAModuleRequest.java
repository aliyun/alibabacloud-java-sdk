// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteOTAModuleRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the OTA module.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>barcodeScanner</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the OTA module belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1uctKe****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteOTAModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOTAModuleRequest self = new DeleteOTAModuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOTAModuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteOTAModuleRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public DeleteOTAModuleRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
