// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The access control lists (ACLs).</p>
     */
    @NameInMap("KafkaAclList")
    public DescribeAclsResponseBodyKafkaAclList kafkaAclList;

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
     * <p>46496E38-881E-4719-A2F3-F3DA6AE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The types of operations allowed by the ACL. Separate multiple operation types with commas (,).</p>
         * <ul>
         * <li>Valid values:</li>
         * <li>Write</li>
         * <li>Read</li>
         * <li>Describe: reads of transactional IDs.</li>
         * <li>IdempotentWrite: idempotent data writes to clusters.</li>
         * <li>IDEMPOTENT_WRITE: idempotent data writes to clusters. This value is available only for ApsaraMQ for Kafka V3 instances.</li>
         * <li>DESCRIBE_CONFIGS: queries of configurations. This value is available only for ApsaraMQ for Kafka V3 instances.<blockquote>
         * <p>This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Write</p>
         */
        @NameInMap("AclOperationType")
        public String aclOperationType;

        /**
         * <p>The authorization method. Valid values:</p>
         * <ul>
         * <li>DENY</li>
         * <li>ALLOW<blockquote>
         * <p>This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DENY</p>
         */
        @NameInMap("AclPermissionType")
        public String aclPermissionType;

        /**
         * <p>The resource name.</p>
         * <ul>
         * <li>The value can be the name of a topic or consumer group.</li>
         * <li>You can use the asterisk (\*) wildcard character to specify the names of all topics or consumer groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("AclResourceName")
        public String aclResourceName;

        /**
         * <p>The matching mode. Valid values:</p>
         * <ul>
         * <li><strong>LITERAL:</strong> full-name match</li>
         * <li><strong>PREFIXED</strong>: prefix match</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LITERAL</p>
         */
        @NameInMap("AclResourcePatternType")
        public String aclResourcePatternType;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><strong>Topic</strong></li>
         * <li><strong>Group</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Topic</p>
         */
        @NameInMap("AclResourceType")
        public String aclResourceType;

        /**
         * <p>The host.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test12***</p>
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
