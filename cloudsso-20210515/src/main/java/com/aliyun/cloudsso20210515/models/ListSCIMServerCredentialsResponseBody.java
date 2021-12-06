// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListSCIMServerCredentialsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SCIMServerCredentials")
    public java.util.List<ListSCIMServerCredentialsResponseBodySCIMServerCredentials> SCIMServerCredentials;

    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static ListSCIMServerCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSCIMServerCredentialsResponseBody self = new ListSCIMServerCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSCIMServerCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSCIMServerCredentialsResponseBody setSCIMServerCredentials(java.util.List<ListSCIMServerCredentialsResponseBodySCIMServerCredentials> SCIMServerCredentials) {
        this.SCIMServerCredentials = SCIMServerCredentials;
        return this;
    }
    public java.util.List<ListSCIMServerCredentialsResponseBodySCIMServerCredentials> getSCIMServerCredentials() {
        return this.SCIMServerCredentials;
    }

    public ListSCIMServerCredentialsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListSCIMServerCredentialsResponseBodySCIMServerCredentials extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CredentialId")
        public String credentialId;

        @NameInMap("CredentialType")
        public String credentialType;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Status")
        public String status;

        public static ListSCIMServerCredentialsResponseBodySCIMServerCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListSCIMServerCredentialsResponseBodySCIMServerCredentials self = new ListSCIMServerCredentialsResponseBodySCIMServerCredentials();
            return TeaModel.build(map, self);
        }

        public ListSCIMServerCredentialsResponseBodySCIMServerCredentials setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSCIMServerCredentialsResponseBodySCIMServerCredentials setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListSCIMServerCredentialsResponseBodySCIMServerCredentials setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public ListSCIMServerCredentialsResponseBodySCIMServerCredentials setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListSCIMServerCredentialsResponseBodySCIMServerCredentials setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListSCIMServerCredentialsResponseBodySCIMServerCredentials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
