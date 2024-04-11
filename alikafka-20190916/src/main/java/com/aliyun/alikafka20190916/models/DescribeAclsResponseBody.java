// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ACLs.</p>
     */
    @NameInMap("KafkaAclList")
    public DescribeAclsResponseBodyKafkaAclList kafkaAclList;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAclsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclsResponseBody self = new DescribeAclsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAclsResponseBody setKafkaAclList(DescribeAclsResponseBodyKafkaAclList kafkaAclList) {
        this.kafkaAclList = kafkaAclList;
        return this;
    }
    public DescribeAclsResponseBodyKafkaAclList getKafkaAclList() {
        return this.kafkaAclList;
    }

    public DescribeAclsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAclsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAclsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAclsResponseBodyKafkaAclListKafkaAclVO extends TeaModel {
        /**
         * <p>The type of the operation. Valid values:</p>
         * <br>
         * <p>*   **Write**</p>
         * <p>*   **Read**</p>
         */
        @NameInMap("AclOperationType")
        public String aclOperationType;

        @NameInMap("AclPermissionType")
        public String aclPermissionType;

        /**
         * <p>The name of the resource.</p>
         * <br>
         * <p>*   The value can be the name of a topic or a consumer group.</p>
         * <p>*   An asterisk (\*) represents the names of all topics or consumer groups.</p>
         */
        @NameInMap("AclResourceName")
        public String aclResourceName;

        /**
         * <p>The match mode. Valid values:</p>
         * <br>
         * <p>*   **LITERAL**: full-name match</p>
         * <p>*   **PREFIXED**: prefix match</p>
         */
        @NameInMap("AclResourcePatternType")
        public String aclResourcePatternType;

        /**
         * <p>The type of the resources to which you want to attach tags. Valid values:</p>
         * <br>
         * <p>*   **Topic**</p>
         * <p>*   **Group**</p>
         */
        @NameInMap("AclResourceType")
        public String aclResourceType;

        /**
         * <p>The host.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The name of the user.</p>
         */
        @NameInMap("Username")
        public String username;

        public static DescribeAclsResponseBodyKafkaAclListKafkaAclVO build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclsResponseBodyKafkaAclListKafkaAclVO self = new DescribeAclsResponseBodyKafkaAclListKafkaAclVO();
            return TeaModel.build(map, self);
        }

        public DescribeAclsResponseBodyKafkaAclListKafkaAclVO setAclOperationType(String aclOperationType) {
            this.aclOperationType = aclOperationType;
            return this;
        }
        public String getAclOperationType() {
            return this.aclOperationType;
        }

        public DescribeAclsResponseBodyKafkaAclListKafkaAclVO setAclPermissionType(String aclPermissionType) {
            this.aclPermissionType = aclPermissionType;
            return this;
        }
        public String getAclPermissionType() {
            return this.aclPermissionType;
        }

        public DescribeAclsResponseBodyKafkaAclListKafkaAclVO setAclResourceName(String aclResourceName) {
            this.aclResourceName = aclResourceName;
            return this;
        }
        public String getAclResourceName() {
            return this.aclResourceName;
        }

        public DescribeAclsResponseBodyKafkaAclListKafkaAclVO setAclResourcePatternType(String aclResourcePatternType) {
            this.aclResourcePatternType = aclResourcePatternType;
            return this;
        }
        public String getAclResourcePatternType() {
            return this.aclResourcePatternType;
        }

        public DescribeAclsResponseBodyKafkaAclListKafkaAclVO setAclResourceType(String aclResourceType) {
            this.aclResourceType = aclResourceType;
            return this;
        }
        public String getAclResourceType() {
            return this.aclResourceType;
        }

        public DescribeAclsResponseBodyKafkaAclListKafkaAclVO setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeAclsResponseBodyKafkaAclListKafkaAclVO setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeAclsResponseBodyKafkaAclList extends TeaModel {
        @NameInMap("KafkaAclVO")
        public java.util.List<DescribeAclsResponseBodyKafkaAclListKafkaAclVO> kafkaAclVO;

        public static DescribeAclsResponseBodyKafkaAclList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclsResponseBodyKafkaAclList self = new DescribeAclsResponseBodyKafkaAclList();
            return TeaModel.build(map, self);
        }

        public DescribeAclsResponseBodyKafkaAclList setKafkaAclVO(java.util.List<DescribeAclsResponseBodyKafkaAclListKafkaAclVO> kafkaAclVO) {
            this.kafkaAclVO = kafkaAclVO;
            return this;
        }
        public java.util.List<DescribeAclsResponseBodyKafkaAclListKafkaAclVO> getKafkaAclVO() {
            return this.kafkaAclVO;
        }

    }

}
