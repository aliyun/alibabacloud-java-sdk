// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePlanMaintenanceWindowsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PlanMaintenanceWindowList")
    public java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList> planMaintenanceWindowList;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePlanMaintenanceWindowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlanMaintenanceWindowsResponseBody self = new DescribePlanMaintenanceWindowsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlanMaintenanceWindowsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePlanMaintenanceWindowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePlanMaintenanceWindowsResponseBody setPlanMaintenanceWindowList(java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList> planMaintenanceWindowList) {
        this.planMaintenanceWindowList = planMaintenanceWindowList;
        return this;
    }
    public java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList> getPlanMaintenanceWindowList() {
        return this.planMaintenanceWindowList;
    }

    public DescribePlanMaintenanceWindowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlanMaintenanceWindowsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags self = new DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags();
            return TeaModel.build(map, self);
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rg-aek2qxeteo7fr6y</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Tag</p>
         */
        @NameInMap("Scope")
        public String scope;

        @NameInMap("Tags")
        public java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags> tags;

        public static DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource build(java.util.Map<String, ?> map) throws Exception {
            DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource self = new DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource();
            return TeaModel.build(map, self);
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource setTags(java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResourceTags> getTags() {
            return this.tags;
        }

    }

    public static class DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Monday,22:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>Monday,22:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList build(java.util.Map<String, ?> map) throws Exception {
            DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList self = new DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList();
            return TeaModel.build(map, self);
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("RangeList")
        public java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList> rangeList;

        public static DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod build(java.util.Map<String, ?> map) throws Exception {
            DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod self = new DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod();
            return TeaModel.build(map, self);
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod setRangeList(java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList> rangeList) {
            this.rangeList = rangeList;
            return this;
        }
        public java.util.List<DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriodRangeList> getRangeList() {
            return this.rangeList;
        }

    }

    public static class DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-04-11T02:20:41Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>2025-02-22 10:14:28 +0800</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>pw-bp1bqkbjb7h4j8zqzwvp</p>
         */
        @NameInMap("PlanWindowId")
        public String planWindowId;

        @NameInMap("PlanWindowName")
        public String planWindowName;

        /**
         * <strong>example:</strong>
         * <p>Reboot</p>
         */
        @NameInMap("SupportMaintenanceAction")
        public String supportMaintenanceAction;

        @NameInMap("TargetResource")
        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource targetResource;

        @NameInMap("TimePeriod")
        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod timePeriod;

        public static DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList build(java.util.Map<String, ?> map) throws Exception {
            DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList self = new DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList();
            return TeaModel.build(map, self);
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setPlanWindowId(String planWindowId) {
            this.planWindowId = planWindowId;
            return this;
        }
        public String getPlanWindowId() {
            return this.planWindowId;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setPlanWindowName(String planWindowName) {
            this.planWindowName = planWindowName;
            return this;
        }
        public String getPlanWindowName() {
            return this.planWindowName;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setSupportMaintenanceAction(String supportMaintenanceAction) {
            this.supportMaintenanceAction = supportMaintenanceAction;
            return this;
        }
        public String getSupportMaintenanceAction() {
            return this.supportMaintenanceAction;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setTargetResource(DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource targetResource) {
            this.targetResource = targetResource;
            return this;
        }
        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTargetResource getTargetResource() {
            return this.targetResource;
        }

        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowList setTimePeriod(DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }
        public DescribePlanMaintenanceWindowsResponseBodyPlanMaintenanceWindowListTimePeriod getTimePeriod() {
            return this.timePeriod;
        }

    }

}
