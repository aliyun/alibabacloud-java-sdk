// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListHotParamRulesOfResourceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListHotParamRulesOfResourceResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListHotParamRulesOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotParamRulesOfResourceResponseBody self = new ListHotParamRulesOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotParamRulesOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotParamRulesOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotParamRulesOfResourceResponseBody setData(ListHotParamRulesOfResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHotParamRulesOfResourceResponseBodyData getData() {
        return this.data;
    }

    public ListHotParamRulesOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotParamRulesOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList extends TeaModel {
        @NameInMap("ItemValue")
        public String itemValue;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList build(java.util.Map<String, ?> map) throws Exception {
            ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList self = new ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList();
            return TeaModel.build(map, self);
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList setItemValue(String itemValue) {
            this.itemValue = itemValue;
            return this;
        }
        public String getItemValue() {
            return this.itemValue;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListHotParamRulesOfResourceResponseBodyDataDatas extends TeaModel {
        @NameInMap("ParamIdx")
        public Integer paramIdx;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ParamFlowItemList")
        public java.util.List<ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList> paramFlowItemList;

        @NameInMap("StatDurationSec")
        public Long statDurationSec;

        @NameInMap("BurstCount")
        public Integer burstCount;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("MaxQueueingTimeMs")
        public Integer maxQueueingTimeMs;

        @NameInMap("ControlBehavior")
        public Integer controlBehavior;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Enable")
        public Boolean enable;

        public static ListHotParamRulesOfResourceResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListHotParamRulesOfResourceResponseBodyDataDatas self = new ListHotParamRulesOfResourceResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setParamIdx(Integer paramIdx) {
            this.paramIdx = paramIdx;
            return this;
        }
        public Integer getParamIdx() {
            return this.paramIdx;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setParamFlowItemList(java.util.List<ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList> paramFlowItemList) {
            this.paramFlowItemList = paramFlowItemList;
            return this;
        }
        public java.util.List<ListHotParamRulesOfResourceResponseBodyDataDatasParamFlowItemList> getParamFlowItemList() {
            return this.paramFlowItemList;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setStatDurationSec(Long statDurationSec) {
            this.statDurationSec = statDurationSec;
            return this;
        }
        public Long getStatDurationSec() {
            return this.statDurationSec;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setBurstCount(Integer burstCount) {
            this.burstCount = burstCount;
            return this;
        }
        public Integer getBurstCount() {
            return this.burstCount;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }
        public Integer getMaxQueueingTimeMs() {
            return this.maxQueueingTimeMs;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setControlBehavior(Integer controlBehavior) {
            this.controlBehavior = controlBehavior;
            return this;
        }
        public Integer getControlBehavior() {
            return this.controlBehavior;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListHotParamRulesOfResourceResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class ListHotParamRulesOfResourceResponseBodyData extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("Datas")
        public java.util.List<ListHotParamRulesOfResourceResponseBodyDataDatas> datas;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHotParamRulesOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotParamRulesOfResourceResponseBodyData self = new ListHotParamRulesOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotParamRulesOfResourceResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListHotParamRulesOfResourceResponseBodyData setDatas(java.util.List<ListHotParamRulesOfResourceResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListHotParamRulesOfResourceResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListHotParamRulesOfResourceResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListHotParamRulesOfResourceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotParamRulesOfResourceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
