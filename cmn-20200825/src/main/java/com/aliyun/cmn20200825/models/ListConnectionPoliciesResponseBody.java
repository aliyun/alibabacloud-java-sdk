// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConnectionPoliciesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("ConnectionPolicy")
    public java.util.List<ListConnectionPoliciesResponseBodyConnectionPolicy> connectionPolicy;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListConnectionPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionPoliciesResponseBody self = new ListConnectionPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionPoliciesResponseBody setConnectionPolicy(java.util.List<ListConnectionPoliciesResponseBodyConnectionPolicy> connectionPolicy) {
        this.connectionPolicy = connectionPolicy;
        return this;
    }
    public java.util.List<ListConnectionPoliciesResponseBodyConnectionPolicy> getConnectionPolicy() {
        return this.connectionPolicy;
    }

    public ListConnectionPoliciesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionPoliciesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListConnectionPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListConnectionPoliciesResponseBodyConnectionPolicy extends TeaModel {
        // 连接策略算法
        @NameInMap("Algorithm")
        public String algorithm;

        // 架构迭代uid
        @NameInMap("ArchitectureIterationId")
        public String architectureIterationId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 上联设备uid
        @NameInMap("DownlinkArchitectureDeviceId")
        public String downlinkArchitectureDeviceId;

        // 下联设备uid
        @NameInMap("DownlinkArchitectureModuleId")
        public String downlinkArchitectureModuleId;

        // 连接策略uid
        @NameInMap("Id")
        public String id;

        // 连接数
        @NameInMap("LinkCount")
        public Integer linkCount;

        // 连接策略名字
        @NameInMap("Name")
        public String name;

        // 更新是啊金
        @NameInMap("UpdateTime")
        public String updateTime;

        // 上联模块uid
        @NameInMap("UplinkArchitectureDeviceId")
        public String uplinkArchitectureDeviceId;

        // 下联模块uid
        @NameInMap("UplinkArchitectureModuleId")
        public String uplinkArchitectureModuleId;

        public static ListConnectionPoliciesResponseBodyConnectionPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionPoliciesResponseBodyConnectionPolicy self = new ListConnectionPoliciesResponseBodyConnectionPolicy();
            return TeaModel.build(map, self);
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setArchitectureIterationId(String architectureIterationId) {
            this.architectureIterationId = architectureIterationId;
            return this;
        }
        public String getArchitectureIterationId() {
            return this.architectureIterationId;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setDownlinkArchitectureDeviceId(String downlinkArchitectureDeviceId) {
            this.downlinkArchitectureDeviceId = downlinkArchitectureDeviceId;
            return this;
        }
        public String getDownlinkArchitectureDeviceId() {
            return this.downlinkArchitectureDeviceId;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setDownlinkArchitectureModuleId(String downlinkArchitectureModuleId) {
            this.downlinkArchitectureModuleId = downlinkArchitectureModuleId;
            return this;
        }
        public String getDownlinkArchitectureModuleId() {
            return this.downlinkArchitectureModuleId;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setLinkCount(Integer linkCount) {
            this.linkCount = linkCount;
            return this;
        }
        public Integer getLinkCount() {
            return this.linkCount;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setUplinkArchitectureDeviceId(String uplinkArchitectureDeviceId) {
            this.uplinkArchitectureDeviceId = uplinkArchitectureDeviceId;
            return this;
        }
        public String getUplinkArchitectureDeviceId() {
            return this.uplinkArchitectureDeviceId;
        }

        public ListConnectionPoliciesResponseBodyConnectionPolicy setUplinkArchitectureModuleId(String uplinkArchitectureModuleId) {
            this.uplinkArchitectureModuleId = uplinkArchitectureModuleId;
            return this;
        }
        public String getUplinkArchitectureModuleId() {
            return this.uplinkArchitectureModuleId;
        }

    }

}
