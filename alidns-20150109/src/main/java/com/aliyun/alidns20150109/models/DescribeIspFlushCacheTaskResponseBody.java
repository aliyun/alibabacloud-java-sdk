// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FlushCacheResults")
    public java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResults> flushCacheResults;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskStatus")
    public String taskStatus;

    public static DescribeIspFlushCacheTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheTaskResponseBody self = new DescribeIspFlushCacheTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeIspFlushCacheTaskResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeIspFlushCacheTaskResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeIspFlushCacheTaskResponseBody setFlushCacheResults(java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResults> flushCacheResults) {
        this.flushCacheResults = flushCacheResults;
        return this;
    }
    public java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResults> getFlushCacheResults() {
        return this.flushCacheResults;
    }

    public DescribeIspFlushCacheTaskResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIspFlushCacheTaskResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeIspFlushCacheTaskResponseBody setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeIspFlushCacheTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIspFlushCacheTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeIspFlushCacheTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static class DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Record")
        public String record;

        @NameInMap("Ttl")
        public Long ttl;

        @NameInMap("Type")
        public String type;

        public static DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers build(java.util.Map<String, ?> map) throws Exception {
            DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers self = new DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers();
            return TeaModel.build(map, self);
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes extends TeaModel {
        @NameInMap("Answers")
        public java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers> answers;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("SpName")
        public String spName;

        @NameInMap("Status")
        public String status;

        public static DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes self = new DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes();
            return TeaModel.build(map, self);
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes setAnswers(java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers> answers) {
            this.answers = answers;
            return this;
        }
        public java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodesAnswers> getAnswers() {
            return this.answers;
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes setSpName(String spName) {
            this.spName = spName;
            return this;
        }
        public String getSpName() {
            return this.spName;
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeIspFlushCacheTaskResponseBodyFlushCacheResults extends TeaModel {
        @NameInMap("DnsNodes")
        public java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes> dnsNodes;

        @NameInMap("Province")
        public String province;

        public static DescribeIspFlushCacheTaskResponseBodyFlushCacheResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeIspFlushCacheTaskResponseBodyFlushCacheResults self = new DescribeIspFlushCacheTaskResponseBodyFlushCacheResults();
            return TeaModel.build(map, self);
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResults setDnsNodes(java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes> dnsNodes) {
            this.dnsNodes = dnsNodes;
            return this;
        }
        public java.util.List<DescribeIspFlushCacheTaskResponseBodyFlushCacheResultsDnsNodes> getDnsNodes() {
            return this.dnsNodes;
        }

        public DescribeIspFlushCacheTaskResponseBodyFlushCacheResults setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
