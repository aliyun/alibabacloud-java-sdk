// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductCertInfoRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify the ID for this parameter. If you do not specify the instance ID, the call fails. If no Overview page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2YwD23****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryProductCertInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductCertInfoRequest self = new QueryProductCertInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductCertInfoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryProductCertInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
