// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListSystemRulesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListSystemRulesResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListSystemRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemRulesResponseBody self = new ListSystemRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSystemRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemRulesResponseBody setData(ListSystemRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSystemRulesResponseBodyData getData() {
        return this.data;
    }

    public ListSystemRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSystemRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSystemRulesResponseBodyDataDatas extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("MetricType")
        public Integer metricType;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("RuleId")
        public Long ruleId;

        public static ListSystemRulesResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListSystemRulesResponseBodyDataDatas self = new ListSystemRulesResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListSystemRulesResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSystemRulesResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListSystemRulesResponseBodyDataDatas setMetricType(Integer metricType) {
            this.metricType = metricType;
            return this;
        }
        public Integer getMetricType() {
            return this.metricType;
        }

        public ListSystemRulesResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListSystemRulesResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListSystemRulesResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

    public static class ListSystemRulesResponseBodyData extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("Datas")
        public java.util.List<ListSystemRulesResponseBodyDataDatas> datas;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSystemRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSystemRulesResponseBodyData self = new ListSystemRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSystemRulesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListSystemRulesResponseBodyData setDatas(java.util.List<ListSystemRulesResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListSystemRulesResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListSystemRulesResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListSystemRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSystemRulesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
