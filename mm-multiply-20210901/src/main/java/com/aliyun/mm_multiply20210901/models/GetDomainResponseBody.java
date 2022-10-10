// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDomainResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("CustomDomainStatus")
    public String customDomainStatus;

    @NameInMap("DnsCname")
    public String dnsCname;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("HasTls")
    public Boolean hasTls;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TemporaryDomainStatus")
    public String temporaryDomainStatus;

    @NameInMap("TlsExpire")
    public Long tlsExpire;

    public static GetDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainResponseBody self = new GetDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDomainResponseBody setCustomDomainStatus(String customDomainStatus) {
        this.customDomainStatus = customDomainStatus;
        return this;
    }
    public String getCustomDomainStatus() {
        return this.customDomainStatus;
    }

    public GetDomainResponseBody setDnsCname(String dnsCname) {
        this.dnsCname = dnsCname;
        return this;
    }
    public String getDnsCname() {
        return this.dnsCname;
    }

    public GetDomainResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetDomainResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetDomainResponseBody setHasTls(Boolean hasTls) {
        this.hasTls = hasTls;
        return this;
    }
    public Boolean getHasTls() {
        return this.hasTls;
    }

    public GetDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDomainResponseBody setTemporaryDomainStatus(String temporaryDomainStatus) {
        this.temporaryDomainStatus = temporaryDomainStatus;
        return this;
    }
    public String getTemporaryDomainStatus() {
        return this.temporaryDomainStatus;
    }

    public GetDomainResponseBody setTlsExpire(Long tlsExpire) {
        this.tlsExpire = tlsExpire;
        return this;
    }
    public Long getTlsExpire() {
        return this.tlsExpire;
    }

}
