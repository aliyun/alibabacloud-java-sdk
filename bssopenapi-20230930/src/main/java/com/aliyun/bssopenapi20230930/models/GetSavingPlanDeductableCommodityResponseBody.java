// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanDeductableCommodityResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetSavingPlanDeductableCommodityResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSavingPlanDeductableCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanDeductableCommodityResponseBody self = new GetSavingPlanDeductableCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanDeductableCommodityResponseBody setData(java.util.List<GetSavingPlanDeductableCommodityResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSavingPlanDeductableCommodityResponseBodyData> getData() {
        return this.data;
    }

    public GetSavingPlanDeductableCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataCycleList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static GetSavingPlanDeductableCommodityResponseBodyDataCycleList build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataCycleList self = new GetSavingPlanDeductableCommodityResponseBodyDataCycleList();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataCycleList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataCycleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataFilterModules extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        public static GetSavingPlanDeductableCommodityResponseBodyDataFilterModules build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataFilterModules self = new GetSavingPlanDeductableCommodityResponseBodyDataFilterModules();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataFilterModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataFilterModules setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataFilterModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        public static GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules self = new GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        public static GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules self = new GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList self = new GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList extends TeaModel {
        @NameInMap("FilterModules")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules> filterModules;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("ShowModules")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules> showModules;

        @NameInMap("SpnTypeList")
        public java.util.List<String> spnTypeList;

        @NameInMap("SpnTypeMapList")
        public java.util.List<java.util.Map<String, DataModuleMapListSpnTypeMapListValue>> spnTypeMapList;

        @NameInMap("SpnTypeNameList")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList> spnTypeNameList;

        public static GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList self = new GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setFilterModules(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules> filterModules) {
            this.filterModules = filterModules;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListFilterModules> getFilterModules() {
            return this.filterModules;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setShowModules(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules> showModules) {
            this.showModules = showModules;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListShowModules> getShowModules() {
            return this.showModules;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setSpnTypeList(java.util.List<String> spnTypeList) {
            this.spnTypeList = spnTypeList;
            return this;
        }
        public java.util.List<String> getSpnTypeList() {
            return this.spnTypeList;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setSpnTypeMapList(java.util.List<java.util.Map<String, DataModuleMapListSpnTypeMapListValue>> spnTypeMapList) {
            this.spnTypeMapList = spnTypeMapList;
            return this;
        }
        public java.util.List<java.util.Map<String, DataModuleMapListSpnTypeMapListValue>> getSpnTypeMapList() {
            return this.spnTypeMapList;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList setSpnTypeNameList(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList> spnTypeNameList) {
            this.spnTypeNameList = spnTypeNameList;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapListSpnTypeNameList> getSpnTypeNameList() {
            return this.spnTypeNameList;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataPayModeList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static GetSavingPlanDeductableCommodityResponseBodyDataPayModeList build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataPayModeList self = new GetSavingPlanDeductableCommodityResponseBodyDataPayModeList();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataPayModeList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataPayModeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyDataPricingModules extends TeaModel {
        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleId")
        public Long moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        public static GetSavingPlanDeductableCommodityResponseBodyDataPricingModules build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyDataPricingModules self = new GetSavingPlanDeductableCommodityResponseBodyDataPricingModules();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataPricingModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataPricingModules setModuleId(Long moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Long getModuleId() {
            return this.moduleId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyDataPricingModules setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class GetSavingPlanDeductableCommodityResponseBodyData extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityId")
        public Long commodityId;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("CycleList")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataCycleList> cycleList;

        @NameInMap("FilterModules")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataFilterModules> filterModules;

        @NameInMap("ItemCode")
        public String itemCode;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ModuleMapList")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList> moduleMapList;

        @NameInMap("PayModeList")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataPayModeList> payModeList;

        @NameInMap("PricingModules")
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataPricingModules> pricingModules;

        @NameInMap("SpnCommodityCode")
        public String spnCommodityCode;

        @NameInMap("SpnCommodityName")
        public String spnCommodityName;

        @NameInMap("SpnDiscountConfigType")
        public String spnDiscountConfigType;

        @NameInMap("StepPriceMap")
        public java.util.Map<String, java.util.List<DataStepPriceMapValue>> stepPriceMap;

        public static GetSavingPlanDeductableCommodityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanDeductableCommodityResponseBodyData self = new GetSavingPlanDeductableCommodityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setCommodityId(Long commodityId) {
            this.commodityId = commodityId;
            return this;
        }
        public Long getCommodityId() {
            return this.commodityId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setCycleList(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataCycleList> cycleList) {
            this.cycleList = cycleList;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataCycleList> getCycleList() {
            return this.cycleList;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setFilterModules(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataFilterModules> filterModules) {
            this.filterModules = filterModules;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataFilterModules> getFilterModules() {
            return this.filterModules;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setModuleMapList(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList> moduleMapList) {
            this.moduleMapList = moduleMapList;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataModuleMapList> getModuleMapList() {
            return this.moduleMapList;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setPayModeList(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataPayModeList> payModeList) {
            this.payModeList = payModeList;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataPayModeList> getPayModeList() {
            return this.payModeList;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setPricingModules(java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataPricingModules> pricingModules) {
            this.pricingModules = pricingModules;
            return this;
        }
        public java.util.List<GetSavingPlanDeductableCommodityResponseBodyDataPricingModules> getPricingModules() {
            return this.pricingModules;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setSpnCommodityCode(String spnCommodityCode) {
            this.spnCommodityCode = spnCommodityCode;
            return this;
        }
        public String getSpnCommodityCode() {
            return this.spnCommodityCode;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setSpnCommodityName(String spnCommodityName) {
            this.spnCommodityName = spnCommodityName;
            return this;
        }
        public String getSpnCommodityName() {
            return this.spnCommodityName;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setSpnDiscountConfigType(String spnDiscountConfigType) {
            this.spnDiscountConfigType = spnDiscountConfigType;
            return this;
        }
        public String getSpnDiscountConfigType() {
            return this.spnDiscountConfigType;
        }

        public GetSavingPlanDeductableCommodityResponseBodyData setStepPriceMap(java.util.Map<String, java.util.List<DataStepPriceMapValue>> stepPriceMap) {
            this.stepPriceMap = stepPriceMap;
            return this;
        }
        public java.util.Map<String, java.util.List<DataStepPriceMapValue>> getStepPriceMap() {
            return this.stepPriceMap;
        }

    }

}
