// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PrintByTemplateRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("HistoryPrintTopic")
    public Boolean historyPrintTopic;

    /**
     * <p>The device ID.</p>
     * <br>
     * <p>> If you specify this parameter, you do not need to specify the **ProductKey** and **DeviceName** parameters. **IotId** specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of **ProductKey** and **DeviceName**. If you specify the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>You do not need to specify this parameter.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The template parameters. You can obtain the template of receipts in the Letter Sending Service console, and configure parameters in the template to create a custom receipt that you want to print.</p>
     */
    @NameInMap("ParamsJsonString")
    public String paramsJsonString;

    /**
     * <p>The unique identifier of the product to which the device belongs.</p>
     * <br>
     * <p>> If you specify the **ProductKey** parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The template identifier. You can obtain the template identifier in the Letter Sending Service console.</p>
     */
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
