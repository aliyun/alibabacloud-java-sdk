// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PrintByTemplateRequest extends TeaModel {
    @NameInMap("ParamsJsonString")
    public String paramsJsonString;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProjectCode")
    @Validation(required = true)
    public String projectCode;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TemplateBizCode")
    @Validation(required = true)
    public String templateBizCode;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public String deviceName;

    public static PrintByTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PrintByTemplateRequest self = new PrintByTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PrintByTemplateRequest setParamsJsonString(String paramsJsonString) {
        this.paramsJsonString = paramsJsonString;
        return this;
    }
    public String getParamsJsonString() {
        return this.paramsJsonString;
    }

    public PrintByTemplateRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public PrintByTemplateRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public PrintByTemplateRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PrintByTemplateRequest setTemplateBizCode(String templateBizCode) {
        this.templateBizCode = templateBizCode;
        return this;
    }
    public String getTemplateBizCode() {
        return this.templateBizCode;
    }

    public PrintByTemplateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PrintByTemplateRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
