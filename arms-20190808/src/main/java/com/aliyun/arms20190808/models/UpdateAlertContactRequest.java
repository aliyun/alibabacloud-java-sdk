// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact to be updated. You can call the SearchAlertContact operation to query the contact ID. For more information, see <a href="https://help.aliyun.com/document_detail/130703.html">SearchAlertContact</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The new name of the alert contact.</p>
     * 
     * <strong>example:</strong>
     * <p>John Doe</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The new webhook URL of the DingTalk chatbot. For more information, see <a href="https://help.aliyun.com/document_detail/106247.html">Configure a DingTalk chatbot to send alert notifications</a>. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the original parameter value is deleted. If you specify this parameter, the original parameter value is updated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=91f2f6">https://oapi.dingtalk.com/robot/send?access_token=91f2f6</a>****</p>
     */
    @NameInMap("DingRobotWebhookUrl")
    public String dingRobotWebhookUrl;

    /**
     * <p>The new email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the original parameter value is deleted. If you specify this parameter, the original parameter value is updated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The new mobile phone number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the original parameter value is deleted. If you specify this parameter, the original parameter value is updated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1381111****</p>
     */
    @NameInMap("PhoneNum")
    public String phoneNum;

    /**
     * <p>The ID of the region. Set the value to <code>cn-hangzhou</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether the alert contact receives system notifications. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The alert contact receives system notifications.</li>
     * <li><code>false</code>: The alert contact does not receive system notifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SystemNoc")
    public Boolean systemNoc;

    public static UpdateAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactRequest self = new UpdateAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public UpdateAlertContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public UpdateAlertContactRequest setDingRobotWebhookUrl(String dingRobotWebhookUrl) {
        this.dingRobotWebhookUrl = dingRobotWebhookUrl;
        return this;
    }
    public String getDingRobotWebhookUrl() {
        return this.dingRobotWebhookUrl;
    }

    public UpdateAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateAlertContactRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public UpdateAlertContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAlertContactRequest setSystemNoc(Boolean systemNoc) {
        this.systemNoc = systemNoc;
        return this;
    }
    public Boolean getSystemNoc() {
        return this.systemNoc;
    }

}
