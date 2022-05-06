// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessRuleResponseBody extends TeaModel {
    @NameInMap("AccessRule")
    public GetAccessRuleResponseBodyAccessRule accessRule;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessRuleResponseBody self = new GetAccessRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessRuleResponseBody setAccessRule(GetAccessRuleResponseBodyAccessRule accessRule) {
        this.accessRule = accessRule;
        return this;
    }
    public GetAccessRuleResponseBodyAccessRule getAccessRule() {
        return this.accessRule;
    }

    public GetAccessRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessRuleResponseBodyAccessRule extends TeaModel {
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        @NameInMap("AccessRuleId")
        public String accessRuleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkSegment")
        public String networkSegment;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RWAccessType")
        public String RWAccessType;

        @NameInMap("RegionId")
        public String regionId;

        public static GetAccessRuleResponseBodyAccessRule build(java.util.Map<String, ?> map) throws Exception {
            GetAccessRuleResponseBodyAccessRule self = new GetAccessRuleResponseBodyAccessRule();
            return TeaModel.build(map, self);
        }

        public GetAccessRuleResponseBodyAccessRule setAccessGroupId(String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        public GetAccessRuleResponseBodyAccessRule setAccessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        public GetAccessRuleResponseBodyAccessRule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAccessRuleResponseBodyAccessRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAccessRuleResponseBodyAccessRule setNetworkSegment(String networkSegment) {
            this.networkSegment = networkSegment;
            return this;
        }
        public String getNetworkSegment() {
            return this.networkSegment;
        }

        public GetAccessRuleResponseBodyAccessRule setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetAccessRuleResponseBodyAccessRule setRWAccessType(String RWAccessType) {
            this.RWAccessType = RWAccessType;
            return this;
        }
        public String getRWAccessType() {
            return this.RWAccessType;
        }

        public GetAccessRuleResponseBodyAccessRule setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
