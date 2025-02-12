// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeSaslUsersResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9E3B3592-5994-4F65-A61E-E62A77A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Simple Authentication and Security Layer (SASL) users.</p>
     */
    @NameInMap("SaslUserList")
    public DescribeSaslUsersResponseBodySaslUserList saslUserList;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSaslUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSaslUsersResponseBody self = new DescribeSaslUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSaslUsersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeSaslUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSaslUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSaslUsersResponseBody setSaslUserList(DescribeSaslUsersResponseBodySaslUserList saslUserList) {
        this.saslUserList = saslUserList;
        return this;
    }
    public DescribeSaslUsersResponseBodySaslUserList getSaslUserList() {
        return this.saslUserList;
    }

    public DescribeSaslUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSaslUsersResponseBodySaslUserListSaslUserVO extends TeaModel {
        /**
         * <p>The encryption method.</p>
         * <blockquote>
         * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SCRAM-SHA-256</p>
         */
        @NameInMap("Mechanism")
        public String mechanism;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The type of the SASL user. Valid values:</p>
         * <ul>
         * <li><strong>plain</strong>: a simple mechanism that uses usernames and passwords to verify user identities. ApsaraMQ for Kafka provides an improved PLAIN mechanism that allows you to dynamically add SASL users without the need to restart an instance.</li>
         * <li><strong>SCRAM</strong>: a mechanism that uses usernames and passwords to verify user identities. Compared with the PLAIN mechanism, this mechanism provides better security protection. ApsaraMQ for Kafka uses the SCRAM-SHA-256 algorithm.</li>
         * <li><strong>LDAP</strong>: This value is available only for the SASL users of ApsaraMQ for Confluent instances.</li>
         * </ul>
         * <p>Default value: <strong>plain</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>scram</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test12***</p>
         */
        @NameInMap("Username")
        public String username;

        public static DescribeSaslUsersResponseBodySaslUserListSaslUserVO build(java.util.Map<String, ?> map) throws Exception {
            DescribeSaslUsersResponseBodySaslUserListSaslUserVO self = new DescribeSaslUsersResponseBodySaslUserListSaslUserVO();
            return TeaModel.build(map, self);
        }

        public DescribeSaslUsersResponseBodySaslUserListSaslUserVO setMechanism(String mechanism) {
            this.mechanism = mechanism;
            return this;
        }
        public String getMechanism() {
            return this.mechanism;
        }

        public DescribeSaslUsersResponseBodySaslUserListSaslUserVO setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public DescribeSaslUsersResponseBodySaslUserListSaslUserVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSaslUsersResponseBodySaslUserListSaslUserVO setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeSaslUsersResponseBodySaslUserList extends TeaModel {
        @NameInMap("SaslUserVO")
        public java.util.List<DescribeSaslUsersResponseBodySaslUserListSaslUserVO> saslUserVO;

        public static DescribeSaslUsersResponseBodySaslUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSaslUsersResponseBodySaslUserList self = new DescribeSaslUsersResponseBodySaslUserList();
            return TeaModel.build(map, self);
        }

        public DescribeSaslUsersResponseBodySaslUserList setSaslUserVO(java.util.List<DescribeSaslUsersResponseBodySaslUserListSaslUserVO> saslUserVO) {
            this.saslUserVO = saslUserVO;
            return this;
        }
        public java.util.List<DescribeSaslUsersResponseBodySaslUserListSaslUserVO> getSaslUserVO() {
            return this.saslUserVO;
        }

    }

}
