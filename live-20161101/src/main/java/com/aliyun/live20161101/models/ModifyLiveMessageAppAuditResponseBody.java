// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppAuditResponseBody extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The signature of the interactive messaging application. This information is required by the interactive messaging service SDK.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AppSign")
    public String appSign;

    /**
     * <p>Indicates whether call authentication is enabled. If custom security audit is used, this parameter is set to true by default to enable call authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuditNeedAuthentication")
    public Boolean auditNeedAuthentication;

    /**
     * <p>The security audit method.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>The security audit URL provided when AuditType is set to 2.</p>
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
