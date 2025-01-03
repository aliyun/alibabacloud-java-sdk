// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessRuleResponseBody extends TeaModel {
    @NameInMap("AccessRule")
    public GetAccessRuleResponseBodyAccessRule accessRule;

    /**
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        /**
         * <strong>example:</strong>
         * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
         */
        @NameInMap("AccessRuleId")
        public String accessRuleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>192.0.2.0/24</p>
         */
        @NameInMap("NetworkSegment")
        public String networkSegment;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>RDWR</p>
         */
        @NameInMap("RWAccessType")
        public String RWAccessType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
