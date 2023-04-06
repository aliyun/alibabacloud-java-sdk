// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesDefaultEndpoint extends TeaModel {
        /**
         * <p>用户portal和应用开发集成的端点地址</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>实例域名状态，Unresolved(未解析)、Resolved(已解析)</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstancesDefaultEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesDefaultEndpoint self = new ListInstancesResponseBodyInstancesDefaultEndpoint();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesDefaultEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListInstancesResponseBodyInstancesDefaultEndpoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>实例的创建时间</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>实例默认域名,用户portal和应用开发集成的端点地址</p>
         */
        @NameInMap("DefaultEndpoint")
        public ListInstancesResponseBodyInstancesDefaultEndpoint defaultEndpoint;

        /**
         * <p>实例描述信息</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>实例id</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>实例状态，Pending(初始状态)、Creating(创建中)、Running(运行中)、Disabled(禁用)、CreateFailed(创建失败)</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyInstances setDefaultEndpoint(ListInstancesResponseBodyInstancesDefaultEndpoint defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public ListInstancesResponseBodyInstancesDefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public ListInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
