// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryQualificationDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    @NameInMap("Credentials")
    public QueryQualificationDetailResponseBodyCredentials credentials;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>943a1662898a****0acbdbeca91</p>
     */
    @NameInMap("TrackId")
    public String trackId;

    public static QueryQualificationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificationDetailResponseBody self = new QueryQualificationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQualificationDetailResponseBody setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public QueryQualificationDetailResponseBody setCredentials(QueryQualificationDetailResponseBodyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }
    public QueryQualificationDetailResponseBodyCredentials getCredentials() {
        return this.credentials;
    }

    public QueryQualificationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryQualificationDetailResponseBody setTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }
    public String getTrackId() {
        return this.trackId;
    }

    public static class QueryQualificationDetailResponseBodyCredentialsQualificationCredential extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>92610725MA7G2E****</p>
         */
        @NameInMap("CredentialNo")
        public String credentialNo;

        /**
         * <strong>example:</strong>
         * <p>SHSQB</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        @NameInMap("CredentialUrl")
        public String credentialUrl;

        public static QueryQualificationDetailResponseBodyCredentialsQualificationCredential build(java.util.Map<String, ?> map) throws Exception {
            QueryQualificationDetailResponseBodyCredentialsQualificationCredential self = new QueryQualificationDetailResponseBodyCredentialsQualificationCredential();
            return TeaModel.build(map, self);
        }

        public QueryQualificationDetailResponseBodyCredentialsQualificationCredential setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public QueryQualificationDetailResponseBodyCredentialsQualificationCredential setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public QueryQualificationDetailResponseBodyCredentialsQualificationCredential setCredentialUrl(String credentialUrl) {
            this.credentialUrl = credentialUrl;
            return this;
        }
        public String getCredentialUrl() {
            return this.credentialUrl;
        }

    }

    public static class QueryQualificationDetailResponseBodyCredentials extends TeaModel {
        @NameInMap("QualificationCredential")
        public java.util.List<QueryQualificationDetailResponseBodyCredentialsQualificationCredential> qualificationCredential;

        public static QueryQualificationDetailResponseBodyCredentials build(java.util.Map<String, ?> map) throws Exception {
            QueryQualificationDetailResponseBodyCredentials self = new QueryQualificationDetailResponseBodyCredentials();
            return TeaModel.build(map, self);
        }

        public QueryQualificationDetailResponseBodyCredentials setQualificationCredential(java.util.List<QueryQualificationDetailResponseBodyCredentialsQualificationCredential> qualificationCredential) {
            this.qualificationCredential = qualificationCredential;
            return this;
        }
        public java.util.List<QueryQualificationDetailResponseBodyCredentialsQualificationCredential> getQualificationCredential() {
            return this.qualificationCredential;
        }

    }

}
