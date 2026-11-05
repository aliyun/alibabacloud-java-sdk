// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessRuleResponseBody extends TeaModel {
    /**
     * <p>Collection of permission group rule information.</p>
     */
    @NameInMap("AccessRule")
    public GetAccessRuleResponseBodyAccessRule accessRule;

    /**
     * <p>Request ID.</p>
     * 
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
         * <p>Permission group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        /**
         * <p>Permission group rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
         */
        @NameInMap("AccessRuleId")
        public String accessRuleId;

        /**
         * <p>Creation Time of the permission group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T08:02:09.986217Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description of the permission group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>日志上传机器网段</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IP address or network segment of the authorization object.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.0/24</p>
         */
        @NameInMap("NetworkSegment")
        public String networkSegment;

        /**
         * <p>Priority of the permission group rule.</p>
         * <p>When the same authorization object matches multiple rules, the rule with the higher priority takes effect.</p>
         * <p>Valid values: 1 to 100. A value of 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Read and write permission of the authorization object on the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RDWR: read-write</li>
         * <li>RDONLY: read-only</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDWR</p>
         */
        @NameInMap("RWAccessType")
        public String RWAccessType;

        /**
         * <p>Region ID.</p>
         * 
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
