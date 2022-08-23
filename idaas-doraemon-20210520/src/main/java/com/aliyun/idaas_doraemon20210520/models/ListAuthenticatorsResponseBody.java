// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticatorsResponseBody extends TeaModel {
    @NameInMap("Authenticator")
    public java.util.List<ListAuthenticatorsResponseBodyAuthenticator> authenticator;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthenticatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatorsResponseBody self = new ListAuthenticatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatorsResponseBody setAuthenticator(java.util.List<ListAuthenticatorsResponseBodyAuthenticator> authenticator) {
        this.authenticator = authenticator;
        return this;
    }
    public java.util.List<ListAuthenticatorsResponseBodyAuthenticator> getAuthenticator() {
        return this.authenticator;
    }

    public ListAuthenticatorsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthenticatorsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthenticatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthenticatorsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthenticatorsResponseBodyAuthenticator extends TeaModel {
        @NameInMap("ApplicationExternalId")
        public String applicationExternalId;

        @NameInMap("AuthenticatorName")
        public String authenticatorName;

        @NameInMap("AuthenticatorUuid")
        public String authenticatorUuid;

        @NameInMap("CredentialId")
        public String credentialId;

        @NameInMap("LastVerifyTime")
        public Long lastVerifyTime;

        @NameInMap("RegisterTime")
        public Long registerTime;

        @NameInMap("Type")
        public String type;

        public static ListAuthenticatorsResponseBodyAuthenticator build(java.util.Map<String, ?> map) throws Exception {
            ListAuthenticatorsResponseBodyAuthenticator self = new ListAuthenticatorsResponseBodyAuthenticator();
            return TeaModel.build(map, self);
        }

        public ListAuthenticatorsResponseBodyAuthenticator setApplicationExternalId(String applicationExternalId) {
            this.applicationExternalId = applicationExternalId;
            return this;
        }
        public String getApplicationExternalId() {
            return this.applicationExternalId;
        }

        public ListAuthenticatorsResponseBodyAuthenticator setAuthenticatorName(String authenticatorName) {
            this.authenticatorName = authenticatorName;
            return this;
        }
        public String getAuthenticatorName() {
            return this.authenticatorName;
        }

        public ListAuthenticatorsResponseBodyAuthenticator setAuthenticatorUuid(String authenticatorUuid) {
            this.authenticatorUuid = authenticatorUuid;
            return this;
        }
        public String getAuthenticatorUuid() {
            return this.authenticatorUuid;
        }

        public ListAuthenticatorsResponseBodyAuthenticator setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListAuthenticatorsResponseBodyAuthenticator setLastVerifyTime(Long lastVerifyTime) {
            this.lastVerifyTime = lastVerifyTime;
            return this;
        }
        public Long getLastVerifyTime() {
            return this.lastVerifyTime;
        }

        public ListAuthenticatorsResponseBodyAuthenticator setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public ListAuthenticatorsResponseBodyAuthenticator setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
