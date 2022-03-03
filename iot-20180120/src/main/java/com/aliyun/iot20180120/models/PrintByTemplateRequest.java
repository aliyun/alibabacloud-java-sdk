// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PrintByTemplateRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("HistoryPrintTopic")
    public Boolean historyPrintTopic;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ParamsJsonString")
    public String paramsJsonString;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TemplateBizCode")
    public String templateBizCode;

    public static PrintByTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PrintByTemplateRequest self = new PrintByTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PrintByTemplateRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public PrintByTemplateRequest setHistoryPrintTopic(Boolean historyPrintTopic) {
        this.historyPrintTopic = historyPrintTopic;
        return this;
    }
    public Boolean getHistoryPrintTopic() {
        return this.historyPrintTopic;
    }

    public PrintByTemplateRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public PrintByTemplateRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PrintByTemplateRequest setParamsJsonString(String paramsJsonString) {
        this.paramsJsonString = paramsJsonString;
        return this;
    }
    public String getParamsJsonString() {
        return this.paramsJsonString;
    }

    public PrintByTemplateRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PrintByTemplateRequest setTemplateBizCode(String templateBizCode) {
        this.templateBizCode = templateBizCode;
        return this;
    }
    public String getTemplateBizCode() {
        return this.templateBizCode;
    }

}
