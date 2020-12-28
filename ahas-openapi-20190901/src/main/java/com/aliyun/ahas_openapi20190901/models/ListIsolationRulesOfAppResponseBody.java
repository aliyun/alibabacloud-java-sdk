// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListIsolationRulesOfAppResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListIsolationRulesOfAppResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListIsolationRulesOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIsolationRulesOfAppResponseBody self = new ListIsolationRulesOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIsolationRulesOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIsolationRulesOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIsolationRulesOfAppResponseBody setData(ListIsolationRulesOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIsolationRulesOfAppResponseBodyData getData() {
        return this.data;
    }

    public ListIsolationRulesOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIsolationRulesOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIsolationRulesOfAppResponseBodyDataDatas extends TeaModel {
        @NameInMap("RelationStrategy")
        public Integer relationStrategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("RefResource")
        public String refResource;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("LimitOrigin")
        public String limitOrigin;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Enable")
        public Boolean enable;

        public static ListIsolationRulesOfAppResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListIsolationRulesOfAppResponseBodyDataDatas self = new ListIsolationRulesOfAppResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListIsolationRulesOfAppResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class ListIsolationRulesOfAppResponseBodyData extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("Datas")
        public java.util.List<ListIsolationRulesOfAppResponseBodyDataDatas> datas;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListIsolationRulesOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIsolationRulesOfAppResponseBodyData self = new ListIsolationRulesOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIsolationRulesOfAppResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListIsolationRulesOfAppResponseBodyData setDatas(java.util.List<ListIsolationRulesOfAppResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListIsolationRulesOfAppResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListIsolationRulesOfAppResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListIsolationRulesOfAppResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIsolationRulesOfAppResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
