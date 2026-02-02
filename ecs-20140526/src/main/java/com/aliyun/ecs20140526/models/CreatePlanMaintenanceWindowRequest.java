// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePlanMaintenanceWindowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PlanWindowName")
    public String planWindowName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Reboot</p>
     */
    @NameInMap("SupportMaintenanceAction")
    public String supportMaintenanceAction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetResource")
    public CreatePlanMaintenanceWindowRequestTargetResource targetResource;

    /**
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
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>rg-aekzhm7pmnvcbty</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag</p>
         */
        @NameInMap("Scope")
        public String scope;

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
         * <strong>example:</strong>
         * <p>Tuesday,03:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
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
