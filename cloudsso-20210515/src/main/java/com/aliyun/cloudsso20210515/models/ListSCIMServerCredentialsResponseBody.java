// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListSCIMServerCredentialsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE4B7037-C315-5DD5-826E-57A87950BCD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SCIM credentials.</p>
     */
    @NameInMap("SCIMServerCredentials")
    public java.util.List<ListSCIMServerCredentialsResponseBodySCIMServerCredentials> SCIMServerCredentials;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The time when the SCIM credential was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-09T08:12:52Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the SCIM credential.</p>
         * 
         * <strong>example:</strong>
         * <p>scimcred-004whl0kvfwcypbi****</p>
         */
        @NameInMap("CredentialId")
        public String credentialId;

        /**
         * <p>The type of the SCIM credential.</p>
         * 
         * <strong>example:</strong>
         * <p>BearerToken</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The time when the SCIM credential expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-09T08:12:52Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status of the SCIM credential. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
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
