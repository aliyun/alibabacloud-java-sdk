// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelDomainVerificationRequest extends TeaModel {
    /**
     * <p>The action type. Valid values:</p>
     * <ul>
     * <li><strong>DOMAINAUDIT</strong>: review a domain name review.</li>
     * <li><strong>AUDITCONTACT</strong>: review a contact.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUDITCONTACT</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>Thee instance ID of the domain name. You can call the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S2019270W570xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the error message to return if the request fails. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IP address of the client. Set the value to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CancelDomainVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDomainVerificationRequest self = new CancelDomainVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CancelDomainVerificationRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public CancelDomainVerificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelDomainVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CancelDomainVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
