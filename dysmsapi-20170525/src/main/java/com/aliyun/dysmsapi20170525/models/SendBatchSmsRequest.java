// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchSmsRequest extends TeaModel {
    /**
     * <p>The extension field of the external record. The value is a string that contains no more than 256 characters.</p>
     * <blockquote>
     * <p>The parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abcdefg</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The mobile number of the recipient. Format:</p>
     * <ul>
     * <li>Message delivery to the Chinese mainland: +/+86/0086/86 or an 11-digit mobile number without a prefix. Example: 1590000\<em>\</em>\<em>\</em>.</li>
     * <li>Message delivery to countries or regions outside the Chinese mainland: Dialing code + Mobile number. Example: 852000012\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <blockquote>
     * <p>We recommend that you call the SendSms operation to send verification codes.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1590000****&quot;,&quot;1350000****&quot;]</p>
     */
    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature.</p>
     * <p>Log on to the Alibaba Cloud SMS console. In the left-side navigation pane, click <strong>Go Globe</strong> or <strong>Go China</strong>. You can view the signature in the <strong>Signature</strong> column on the <strong>Signatures</strong> tab.</p>
     * <blockquote>
     * <p>The signatures must be approved and correspond to the mobile numbers in sequence.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Aliyun&quot;,&quot;Alibaba&quot;]</p>
     */
    @NameInMap("SignNameJson")
    public String signNameJson;

    /**
     * <p>The extension code of the MO message. Format: JSON array.</p>
     * <blockquote>
     * <p>The parameter is optional.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;90999&quot;,&quot;90998&quot;]</p>
     */
    @NameInMap("SmsUpExtendCodeJson")
    public String smsUpExtendCodeJson;

    /**
     * <p>The code of the message template.</p>
     * <p>Log on to the Alibaba Cloud SMS console. In the left-side navigation pane, click <strong>Go Globe</strong> or <strong>Go China</strong>. You can view the message template in the <strong>Template Code</strong> column on the <strong>Message Templates</strong> tab.</p>
     * <blockquote>
     * <p>The message templates must be created on the Go Globe page and approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS_15255****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The value of the variable in the message template.</p>
     * <blockquote>
     * <p>If you need to add line breaks to the JSON template, make sure that the format is valid. In addition, the sequence of variable values must be the same as that of the mobile numbers and signatures.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;TemplateParamJson&quot;},{&quot;name&quot;:&quot;TemplateParamJson&quot;}]</p>
     */
    @NameInMap("TemplateParamJson")
    public String templateParamJson;

    public static SendBatchSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBatchSmsRequest self = new SendBatchSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendBatchSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendBatchSmsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendBatchSmsRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public SendBatchSmsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendBatchSmsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendBatchSmsRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public SendBatchSmsRequest setSmsUpExtendCodeJson(String smsUpExtendCodeJson) {
        this.smsUpExtendCodeJson = smsUpExtendCodeJson;
        return this;
    }
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

    public SendBatchSmsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendBatchSmsRequest setTemplateParamJson(String templateParamJson) {
        this.templateParamJson = templateParamJson;
        return this;
    }
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

}
