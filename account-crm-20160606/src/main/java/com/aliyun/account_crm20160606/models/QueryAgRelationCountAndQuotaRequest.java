// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAgRelationCountAndQuotaRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("CallerBid")
    public Long callerBid;

    @NameInMap("CallerParentId")
    public Long callerParentId;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("CallerUid")
    public Long callerUid;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("NullObject")
    public Boolean nullObject;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StsTokenCallerBid")
    public Long stsTokenCallerBid;

    @NameInMap("StsTokenCallerUid")
    public Long stsTokenCallerUid;

    @NameInMap("StsTokenRoleId")
    public Long stsTokenRoleId;

    @NameInMap("Version")
    public String version;

    public static QueryAgRelationCountAndQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgRelationCountAndQuotaRequest self = new QueryAgRelationCountAndQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgRelationCountAndQuotaRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAgRelationCountAndQuotaRequest setCallerBid(Long callerBid) {
        this.callerBid = callerBid;
        return this;
    }
    public Long getCallerBid() {
        return this.callerBid;
    }

    public QueryAgRelationCountAndQuotaRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public QueryAgRelationCountAndQuotaRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public QueryAgRelationCountAndQuotaRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public QueryAgRelationCountAndQuotaRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public QueryAgRelationCountAndQuotaRequest setNullObject(Boolean nullObject) {
        this.nullObject = nullObject;
        return this;
    }
    public Boolean getNullObject() {
        return this.nullObject;
    }

    public QueryAgRelationCountAndQuotaRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAgRelationCountAndQuotaRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public QueryAgRelationCountAndQuotaRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public QueryAgRelationCountAndQuotaRequest setStsTokenCallerBid(Long stsTokenCallerBid) {
        this.stsTokenCallerBid = stsTokenCallerBid;
        return this;
    }
    public Long getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    public QueryAgRelationCountAndQuotaRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    public QueryAgRelationCountAndQuotaRequest setStsTokenRoleId(Long stsTokenRoleId) {
        this.stsTokenRoleId = stsTokenRoleId;
        return this;
    }
    public Long getStsTokenRoleId() {
        return this.stsTokenRoleId;
    }

    public QueryAgRelationCountAndQuotaRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
