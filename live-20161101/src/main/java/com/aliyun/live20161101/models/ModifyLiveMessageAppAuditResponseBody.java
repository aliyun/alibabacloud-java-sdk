// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppAuditResponseBody extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppSign")
    public String appSign;

    /**
     * <p>Indicates whether authentication is enabled. If custom content moderation is used, the value of this parameter is true by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuditNeedAuthentication")
    public Boolean auditNeedAuthentication;

    /**
     * <p>The content moderation method.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>The URL for content moderation. This parameter is returned when the value of AuditType is 2.</p>
     * 
     * <strong>example:</strong>
     * <p>http: //example.aliyundoc.com/exampleaudit</p>
     */
    @NameInMap("AuditUrl")
    public String auditUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C4E8440-3838-1831-9BDE-AFC15803****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLiveMessageAppAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppAuditResponseBody self = new ModifyLiveMessageAppAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppAuditResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLiveMessageAppAuditResponseBody setAppSign(String appSign) {
        this.appSign = appSign;
        return this;
    }
    public String getAppSign() {
        return this.appSign;
    }

    public ModifyLiveMessageAppAuditResponseBody setAuditNeedAuthentication(Boolean auditNeedAuthentication) {
        this.auditNeedAuthentication = auditNeedAuthentication;
        return this;
    }
    public Boolean getAuditNeedAuthentication() {
        return this.auditNeedAuthentication;
    }

    public ModifyLiveMessageAppAuditResponseBody setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public ModifyLiveMessageAppAuditResponseBody setAuditUrl(String auditUrl) {
        this.auditUrl = auditUrl;
        return this;
    }
    public String getAuditUrl() {
        return this.auditUrl;
    }

    public ModifyLiveMessageAppAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
