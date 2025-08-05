// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetInstanceInfluenceResponseBody extends TeaModel {
    @NameInMap("InstanceInfluence")
    public GetInstanceInfluenceResponseBodyInstanceInfluence instanceInfluence;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceInfluenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInfluenceResponseBody self = new GetInstanceInfluenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceInfluenceResponseBody setInstanceInfluence(GetInstanceInfluenceResponseBodyInstanceInfluence instanceInfluence) {
        this.instanceInfluence = instanceInfluence;
        return this;
    }
    public GetInstanceInfluenceResponseBodyInstanceInfluence getInstanceInfluence() {
        return this.instanceInfluence;
    }

    public GetInstanceInfluenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("Buffer")
        public Long buffer;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Status")
        public String status;

        public static GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences self = new GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences();
            return TeaModel.build(map, self);
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceInfluenceResponseBodyInstanceInfluence extends TeaModel {
        @NameInMap("Influences")
        public java.util.List<GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences> influences;

        @NameInMap("InstanceId")
        public Long instanceId;

        public static GetInstanceInfluenceResponseBodyInstanceInfluence build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceInfluenceResponseBodyInstanceInfluence self = new GetInstanceInfluenceResponseBodyInstanceInfluence();
            return TeaModel.build(map, self);
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluence setInfluences(java.util.List<GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences> influences) {
            this.influences = influences;
            return this;
        }
        public java.util.List<GetInstanceInfluenceResponseBodyInstanceInfluenceInfluences> getInfluences() {
            return this.influences;
        }

        public GetInstanceInfluenceResponseBodyInstanceInfluence setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

    }

}
