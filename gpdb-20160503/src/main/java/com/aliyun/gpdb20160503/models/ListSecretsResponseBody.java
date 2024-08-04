// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSecretsResponseBody extends TeaModel {
    /**
     * <p>The number of access credentials.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried access credentials.</p>
     */
    @NameInMap("Secrets")
    public ListSecretsResponseBodySecrets secrets;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsResponseBody self = new ListSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListSecretsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecretsResponseBody setSecrets(ListSecretsResponseBodySecrets secrets) {
        this.secrets = secrets;
        return this;
    }
    public ListSecretsResponseBodySecrets getSecrets() {
        return this.secrets;
    }

    public ListSecretsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListSecretsResponseBodySecretsSecrets extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1033***</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp14****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The description of the access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the access credential for the created Data API account. Format: <code>acs:gpdb:{{region}}:{{accountId}}:secret/{{secretName}}-{{32 digits random string}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:gpdb:cn-beijing:1033**:secret/testsecret-eG2AQGRIwQ0zFp4VA7mYL3uiCXTfDQbQ</p>
         */
        @NameInMap("SecretArn")
        public String secretArn;

        /**
         * <p>The name of the access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>testsecret</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>testacc</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListSecretsResponseBodySecretsSecrets build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodySecretsSecrets self = new ListSecretsResponseBodySecretsSecrets();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodySecretsSecrets setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListSecretsResponseBodySecretsSecrets setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public ListSecretsResponseBodySecretsSecrets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecretsResponseBodySecretsSecrets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSecretsResponseBodySecretsSecrets setSecretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }
        public String getSecretArn() {
            return this.secretArn;
        }

        public ListSecretsResponseBodySecretsSecrets setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public ListSecretsResponseBodySecretsSecrets setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListSecretsResponseBodySecrets extends TeaModel {
        @NameInMap("Secrets")
        public java.util.List<ListSecretsResponseBodySecretsSecrets> secrets;

        public static ListSecretsResponseBodySecrets build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseBodySecrets self = new ListSecretsResponseBodySecrets();
            return TeaModel.build(map, self);
        }

        public ListSecretsResponseBodySecrets setSecrets(java.util.List<ListSecretsResponseBodySecretsSecrets> secrets) {
            this.secrets = secrets;
            return this;
        }
        public java.util.List<ListSecretsResponseBodySecretsSecrets> getSecrets() {
            return this.secrets;
        }

    }

}
