// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("KafkaAclList")
    public java.util.List<DescribeAclsResponseBodyKafkaAclList> kafkaAclList;

    public static DescribeAclsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclsResponseBody self = new DescribeAclsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAclsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAclsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAclsResponseBody setKafkaAclList(java.util.List<DescribeAclsResponseBodyKafkaAclList> kafkaAclList) {
        this.kafkaAclList = kafkaAclList;
        return this;
    }
    public java.util.List<DescribeAclsResponseBodyKafkaAclList> getKafkaAclList() {
        return this.kafkaAclList;
    }

    public static class DescribeAclsResponseBodyKafkaAclList extends TeaModel {
        @NameInMap("AclResourceType")
        public String aclResourceType;

        @NameInMap("Host")
        public String host;

        @NameInMap("AclOperationType")
        public String aclOperationType;

        @NameInMap("AclResourceName")
        public String aclResourceName;

        @NameInMap("AclResourcePatternType")
        public String aclResourcePatternType;

        @NameInMap("Username")
        public String username;

        public static DescribeAclsResponseBodyKafkaAclList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclsResponseBodyKafkaAclList self = new DescribeAclsResponseBodyKafkaAclList();
            return TeaModel.build(map, self);
        }

        public DescribeAclsResponseBodyKafkaAclList setAclResourceType(String aclResourceType) {
            this.aclResourceType = aclResourceType;
            return this;
        }
        public String getAclResourceType() {
            return this.aclResourceType;
        }

        public DescribeAclsResponseBodyKafkaAclList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeAclsResponseBodyKafkaAclList setAclOperationType(String aclOperationType) {
            this.aclOperationType = aclOperationType;
            return this;
        }
        public String getAclOperationType() {
            return this.aclOperationType;
        }

        public DescribeAclsResponseBodyKafkaAclList setAclResourceName(String aclResourceName) {
            this.aclResourceName = aclResourceName;
            return this;
        }
        public String getAclResourceName() {
            return this.aclResourceName;
        }

        public DescribeAclsResponseBodyKafkaAclList setAclResourcePatternType(String aclResourcePatternType) {
            this.aclResourcePatternType = aclResourcePatternType;
            return this;
        }
        public String getAclResourcePatternType() {
            return this.aclResourcePatternType;
        }

        public DescribeAclsResponseBodyKafkaAclList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
