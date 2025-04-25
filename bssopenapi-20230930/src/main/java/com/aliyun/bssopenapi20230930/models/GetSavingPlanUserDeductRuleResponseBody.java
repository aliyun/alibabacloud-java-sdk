// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetSavingPlanUserDeductRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetSavingPlanUserDeductRuleResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSavingPlanUserDeductRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSavingPlanUserDeductRuleResponseBody self = new GetSavingPlanUserDeductRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSavingPlanUserDeductRuleResponseBody setData(java.util.List<GetSavingPlanUserDeductRuleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSavingPlanUserDeductRuleResponseBodyData> getData() {
        return this.data;
    }

    public GetSavingPlanUserDeductRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSavingPlanUserDeductRuleResponseBodyData extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityName")
        public String commodityName;

        @NameInMap("ModuleCode")
        public String moduleCode;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("SkipDeduct")
        public Boolean skipDeduct;

        public static GetSavingPlanUserDeductRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSavingPlanUserDeductRuleResponseBodyData self = new GetSavingPlanUserDeductRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSavingPlanUserDeductRuleResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetSavingPlanUserDeductRuleResponseBodyData setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public GetSavingPlanUserDeductRuleResponseBodyData setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public GetSavingPlanUserDeductRuleResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetSavingPlanUserDeductRuleResponseBodyData setSkipDeduct(Boolean skipDeduct) {
            this.skipDeduct = skipDeduct;
            return this;
        }
        public Boolean getSkipDeduct() {
            return this.skipDeduct;
        }

    }

}
