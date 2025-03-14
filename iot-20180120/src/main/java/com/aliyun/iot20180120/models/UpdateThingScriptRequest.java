// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingScriptRequest extends TeaModel {
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
     * <p>The <strong>ProductKey</strong> of the product.</p>
     * <p>You can view the <strong>ProductKey</strong> on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Q5XoY****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The content of the script. You must specify this parameter.</p>
     * <p>For more information about script examples, see <a href="https://help.aliyun.com/document_detail/68702.html">What is data parsing</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;function protocolToRawData(jsonObj) {return rawdata; }function rawDataToProtocol(rawData) {return jsonObj; }&quot;</p>
     */
    @NameInMap("ScriptContent")
    public String scriptContent;

    /**
     * <p>The type of the script. Valid values:</p>
     * <ul>
     * <li>JavaScript</li>
     * <li>Python_27: Python 2.7</li>
     * <li>PHP_72: PHP 7.2</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JavaScript</p>
     */
    @NameInMap("ScriptType")
    public String scriptType;

    public static UpdateThingScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingScriptRequest self = new UpdateThingScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingScriptRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateThingScriptRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateThingScriptRequest setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public String getScriptContent() {
        return this.scriptContent;
    }

    public UpdateThingScriptRequest setScriptType(String scriptType) {
        this.scriptType = scriptType;
        return this;
    }
    public String getScriptType() {
        return this.scriptType;
    }

}
