// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPlanMaintenanceWindowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pw-bp1au1w8v8a1yer65g5k</p>
     */
    @NameInMap("PlanWindowId")
    public String planWindowId;

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
     * <strong>example:</strong>
     * <p>Reboot</p>
     */
    @NameInMap("SupportMaintenanceAction")
    public String supportMaintenanceAction;

    @NameInMap("TargetResource")
    public ModifyPlanMaintenanceWindowRequestTargetResource targetResource;

    @NameInMap("TimePeriod")
    public ModifyPlanMaintenanceWindowRequestTimePeriod timePeriod;

    public static ModifyPlanMaintenanceWindowRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlanMaintenanceWindowRequest self = new ModifyPlanMaintenanceWindowRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPlanMaintenanceWindowRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyPlanMaintenanceWindowRequest setPlanWindowId(String planWindowId) {
        this.planWindowId = planWindowId;
        return this;
    }
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    public ModifyPlanMaintenanceWindowRequest setPlanWindowName(String planWindowName) {
        this.planWindowName = planWindowName;
        return this;
    }
    public String getPlanWindowName() {
        return this.planWindowName;
    }

    public ModifyPlanMaintenanceWindowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPlanMaintenanceWindowRequest setSupportMaintenanceAction(String supportMaintenanceAction) {
        this.supportMaintenanceAction = supportMaintenanceAction;
        return this;
    }
    public String getSupportMaintenanceAction() {
        return this.supportMaintenanceAction;
    }

    public ModifyPlanMaintenanceWindowRequest setTargetResource(ModifyPlanMaintenanceWindowRequestTargetResource targetResource) {
        this.targetResource = targetResource;
        return this;
    }
    public ModifyPlanMaintenanceWindowRequestTargetResource getTargetResource() {
        return this.targetResource;
    }

    public ModifyPlanMaintenanceWindowRequest setTimePeriod(ModifyPlanMaintenanceWindowRequestTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    public ModifyPlanMaintenanceWindowRequestTimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public static class ModifyPlanMaintenanceWindowRequestTargetResourceTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ModifyPlanMaintenanceWindowRequestTargetResourceTags build(java.util.Map<String, ?> map) throws Exception {
            ModifyPlanMaintenanceWindowRequestTargetResourceTags self = new ModifyPlanMaintenanceWindowRequestTargetResourceTags();
            return TeaModel.build(map, self);
        }

        public ModifyPlanMaintenanceWindowRequestTargetResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyPlanMaintenanceWindowRequestTargetResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyPlanMaintenanceWindowRequestTargetResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rg-acfmy4cc27vsvia</p>
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
        public java.util.List<ModifyPlanMaintenanceWindowRequestTargetResourceTags> tags;

        public static ModifyPlanMaintenanceWindowRequestTargetResource build(java.util.Map<String, ?> map) throws Exception {
            ModifyPlanMaintenanceWindowRequestTargetResource self = new ModifyPlanMaintenanceWindowRequestTargetResource();
            return TeaModel.build(map, self);
        }

        public ModifyPlanMaintenanceWindowRequestTargetResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ModifyPlanMaintenanceWindowRequestTargetResource setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ModifyPlanMaintenanceWindowRequestTargetResource setTags(java.util.List<ModifyPlanMaintenanceWindowRequestTargetResourceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ModifyPlanMaintenanceWindowRequestTargetResourceTags> getTags() {
            return this.tags;
        }

    }

    public static class ModifyPlanMaintenanceWindowRequestTimePeriodRangeList extends TeaModel {
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

        public static ModifyPlanMaintenanceWindowRequestTimePeriodRangeList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPlanMaintenanceWindowRequestTimePeriodRangeList self = new ModifyPlanMaintenanceWindowRequestTimePeriodRangeList();
            return TeaModel.build(map, self);
        }

        public ModifyPlanMaintenanceWindowRequestTimePeriodRangeList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyPlanMaintenanceWindowRequestTimePeriodRangeList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ModifyPlanMaintenanceWindowRequestTimePeriod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("RangeList")
        public java.util.List<ModifyPlanMaintenanceWindowRequestTimePeriodRangeList> rangeList;

        public static ModifyPlanMaintenanceWindowRequestTimePeriod build(java.util.Map<String, ?> map) throws Exception {
            ModifyPlanMaintenanceWindowRequestTimePeriod self = new ModifyPlanMaintenanceWindowRequestTimePeriod();
            return TeaModel.build(map, self);
        }

        public ModifyPlanMaintenanceWindowRequestTimePeriod setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public ModifyPlanMaintenanceWindowRequestTimePeriod setRangeList(java.util.List<ModifyPlanMaintenanceWindowRequestTimePeriodRangeList> rangeList) {
            this.rangeList = rangeList;
            return this;
        }
        public java.util.List<ModifyPlanMaintenanceWindowRequestTimePeriodRangeList> getRangeList() {
            return this.rangeList;
        }

    }

}
