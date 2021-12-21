// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListHotParamRulesOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListHotParamRulesOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListHotParamRulesOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotParamRulesOfAppResponseBody self = new ListHotParamRulesOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotParamRulesOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotParamRulesOfAppResponseBody setData(ListHotParamRulesOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHotParamRulesOfAppResponseBodyData getData() {
        return this.data;
    }

    public ListHotParamRulesOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotParamRulesOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotParamRulesOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList extends TeaModel {
        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList self = new ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListHotParamRulesOfAppResponseBodyDataDatas extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BurstCount")
        public Integer burstCount;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParamFlowItemList")
        public java.util.List<ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList> paramFlowItemList;

        @NameInMap("ParamIdx")
        public Integer paramIdx;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("StatDurationSec")
        public Long statDurationSec;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListHotParamRulesOfAppResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListHotParamRulesOfAppResponseBodyDataDatas self = new ListHotParamRulesOfAppResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setParamFlowItemList(java.util.List<ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<ListHotParamRulesOfAppResponseBodyDataDatasParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setStatDurationSec(Long statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Long getStatDurationSec() {
            return this.statDurationSec;
        }

        public ListHotParamRulesOfAppResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListHotParamRulesOfAppResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<ListHotParamRulesOfAppResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListHotParamRulesOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotParamRulesOfAppResponseBodyData self = new ListHotParamRulesOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotParamRulesOfAppResponseBodyData setDatas(java.util.List<ListHotParamRulesOfAppResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListHotParamRulesOfAppResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListHotParamRulesOfAppResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListHotParamRulesOfAppResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotParamRulesOfAppResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListHotParamRulesOfAppResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
