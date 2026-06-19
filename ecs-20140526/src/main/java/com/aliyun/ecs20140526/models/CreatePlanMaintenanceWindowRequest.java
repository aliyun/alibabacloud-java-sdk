// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePlanMaintenanceWindowRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the O&amp;M window.</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("MinMaintenanceInterval")
    public Integer minMaintenanceInterval;

    /**
     * <p>The name of the O&amp;M window. You can specify a custom name. The name can be up to 200 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WIndowName</p>
     */
    @NameInMap("PlanWindowName")
    public String planWindowName;

    /**
     * <p>The region ID. You can call DescribeRegions to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The O&amp;M operations supported by the O&amp;M window.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Reboot</p>
     */
    @NameInMap("SupportMaintenanceAction")
    public String supportMaintenanceAction;

    /**
     * <p>The resources on which the O&amp;M window takes effect.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetResource")
    public CreatePlanMaintenanceWindowRequestTargetResource targetResource;

    /**
     * <p>The recurring cycle of the O&amp;M window.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimePeriod")
    public CreatePlanMaintenanceWindowRequestTimePeriod timePeriod;

    public static CreatePlanMaintenanceWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanMaintenanceWindowRequest self = new CreatePlanMaintenanceWindowRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlanMaintenanceWindowRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreatePlanMaintenanceWindowRequest setMinMaintenanceInterval(Integer minMaintenanceInterval) {
        this.minMaintenanceInterval = minMaintenanceInterval;
        return this;
    }
    public Integer getMinMaintenanceInterval() {
        return this.minMaintenanceInterval;
    }

    public CreatePlanMaintenanceWindowRequest setPlanWindowName(String planWindowName) {
        this.planWindowName = planWindowName;
        return this;
    }
    public String getPlanWindowName() {
        return this.planWindowName;
    }

    public CreatePlanMaintenanceWindowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePlanMaintenanceWindowRequest setSupportMaintenanceAction(String supportMaintenanceAction) {
        this.supportMaintenanceAction = supportMaintenanceAction;
        return this;
    }
    public String getSupportMaintenanceAction() {
        return this.supportMaintenanceAction;
    }

    public CreatePlanMaintenanceWindowRequest setTargetResource(CreatePlanMaintenanceWindowRequestTargetResource targetResource) {
        this.targetResource = targetResource;
        return this;
    }
    public CreatePlanMaintenanceWindowRequestTargetResource getTargetResource() {
        return this.targetResource;
    }

    public CreatePlanMaintenanceWindowRequest setTimePeriod(CreatePlanMaintenanceWindowRequestTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    public CreatePlanMaintenanceWindowRequestTimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public static class CreatePlanMaintenanceWindowRequestTargetResourceTags extends TeaModel {
        /**
         * <p>The key of the tag on which the O&amp;M window takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>vms_qualification_孙总身份证_e5590864-1fef-4db2-b2a7-bd2d657fed43.png</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag on which the O&amp;M window takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>21.137.18.60</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePlanMaintenanceWindowRequestTargetResourceTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePlanMaintenanceWindowRequestTargetResourceTags self = new CreatePlanMaintenanceWindowRequestTargetResourceTags();
            return TeaModel.build(map, self);
        }

        public CreatePlanMaintenanceWindowRequestTargetResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePlanMaintenanceWindowRequestTargetResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreatePlanMaintenanceWindowRequestTargetResource extends TeaModel {
        /**
         * <p>The ID of the resource group. This parameter is required when Scope is set to ResourceGroup.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzhm7pmnvcbty</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of resources for which the O&amp;M window is configured.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The tags on which the O&amp;M window takes effect. This parameter is required when Scope is set to Tag.</p>
         */
        @NameInMap("Tags")
        public java.util.List<CreatePlanMaintenanceWindowRequestTargetResourceTags> tags;

        public static CreatePlanMaintenanceWindowRequestTargetResource build(java.util.Map<String, ?> map) throws Exception {
            CreatePlanMaintenanceWindowRequestTargetResource self = new CreatePlanMaintenanceWindowRequestTargetResource();
            return TeaModel.build(map, self);
        }

        public CreatePlanMaintenanceWindowRequestTargetResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreatePlanMaintenanceWindowRequestTargetResource setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreatePlanMaintenanceWindowRequestTargetResource setTags(java.util.List<CreatePlanMaintenanceWindowRequestTargetResourceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreatePlanMaintenanceWindowRequestTargetResourceTags> getTags() {
            return this.tags;
        }

    }

    public static class CreatePlanMaintenanceWindowRequestTimePeriodRangeList extends TeaModel {
        /**
         * <p>The end time of the O&amp;M window.</p>
         * <ul>
         * <li>If PeriodUnit is set to Weekly, the format is Monday,22:00. Monday can be replaced with Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday.</li>
         * <li>If PeriodUnit is set to Daily, the format is 22:00.</li>
         * <li>The comma (,) is used as a delimiter. The first part represents the hour, which ranges from 00 to 23. The second part represents the minute, which currently supports only 00.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tuesday,03:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the O&amp;M window.</p>
         * <ul>
         * <li>If PeriodUnit is set to Weekly, the format is Monday,22:00. Monday can be replaced with Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday.</li>
         * <li>If PeriodUnit is set to Daily, the format is 22:00.</li>
         * <li>The comma (,) is used as a delimiter. The first part represents the hour, which ranges from 00 to 23. The second part represents the minute, which currently supports only 00.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Monday,22:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static CreatePlanMaintenanceWindowRequestTimePeriodRangeList build(java.util.Map<String, ?> map) throws Exception {
            CreatePlanMaintenanceWindowRequestTimePeriodRangeList self = new CreatePlanMaintenanceWindowRequestTimePeriodRangeList();
            return TeaModel.build(map, self);
        }

        public CreatePlanMaintenanceWindowRequestTimePeriodRangeList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreatePlanMaintenanceWindowRequestTimePeriodRangeList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreatePlanMaintenanceWindowRequestTimePeriod extends TeaModel {
        /**
         * <p>The cycle type. Valid values: Daily and Weekly.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The time ranges of the recurring cycle of the O&amp;M window (in UTC).</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RangeList")
        public java.util.List<CreatePlanMaintenanceWindowRequestTimePeriodRangeList> rangeList;

        public static CreatePlanMaintenanceWindowRequestTimePeriod build(java.util.Map<String, ?> map) throws Exception {
            CreatePlanMaintenanceWindowRequestTimePeriod self = new CreatePlanMaintenanceWindowRequestTimePeriod();
            return TeaModel.build(map, self);
        }

        public CreatePlanMaintenanceWindowRequestTimePeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreatePlanMaintenanceWindowRequestTimePeriod setRangeList(java.util.List<CreatePlanMaintenanceWindowRequestTimePeriodRangeList> rangeList) {
            this.rangeList = rangeList;
            return this;
        }
        public java.util.List<CreatePlanMaintenanceWindowRequestTimePeriodRangeList> getRangeList() {
            return this.rangeList;
        }

    }

}
