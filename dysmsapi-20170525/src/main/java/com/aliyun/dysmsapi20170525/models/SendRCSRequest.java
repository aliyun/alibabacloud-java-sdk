// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendRCSRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TemplateParam")
    public String templateParam;

    public static SendRCSRequest build(java.util.Map<String, ?> map) throws Exception {
        SendRCSRequest self = new SendRCSRequest();
        return TeaModel.build(map, self);
    }

    public SendRCSRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendRCSRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendRCSRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendRCSRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendRCSRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

}
