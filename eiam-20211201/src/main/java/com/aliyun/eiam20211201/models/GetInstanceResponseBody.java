// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyInstanceDefaultEndpoint extends TeaModel {
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

        public static GetInstanceResponseBodyInstanceDefaultEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceDefaultEndpoint self = new GetInstanceResponseBodyInstanceDefaultEndpoint();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceDefaultEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetInstanceResponseBodyInstanceDefaultEndpoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        /**
         * <p>实例的创建时间</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>实例默认域名,用户portal和应用开发集成的端点地址</p>
         */
        @NameInMap("DefaultEndpoint")
        public GetInstanceResponseBodyInstanceDefaultEndpoint defaultEndpoint;

        /**
         * <p>实例描述信息</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IDaaS实例出口公网地址段</p>
         */
        @NameInMap("EgressAddresses")
        public java.util.List<String> egressAddresses;

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

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseBodyInstance setDefaultEndpoint(GetInstanceResponseBodyInstanceDefaultEndpoint defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public GetInstanceResponseBodyInstanceDefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public GetInstanceResponseBodyInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceResponseBodyInstance setEgressAddresses(java.util.List<String> egressAddresses) {
            this.egressAddresses = egressAddresses;
            return this;
        }
        public java.util.List<String> getEgressAddresses() {
            return this.egressAddresses;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
