// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListIsolationRulesOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListIsolationRulesOfResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListIsolationRulesOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIsolationRulesOfResourceResponseBody self = new ListIsolationRulesOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIsolationRulesOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIsolationRulesOfResourceResponseBody setData(ListIsolationRulesOfResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIsolationRulesOfResourceResponseBodyData getData() {
        return this.data;
    }

    public ListIsolationRulesOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIsolationRulesOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIsolationRulesOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIsolationRulesOfResourceResponseBodyDataDatas extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("LimitOrigin")
        public String limitOrigin;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RefResource")
        public String refResource;

        @NameInMap("RelationStrategy")
        public Integer relationStrategy;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Threshold")
        public Float threshold;

        public static ListIsolationRulesOfResourceResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ListIsolationRulesOfResourceResponseBodyDataDatas self = new ListIsolationRulesOfResourceResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setLimitOrigin(String limitOrigin) {
            this.limitOrigin = limitOrigin;
            return this;
        }
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setRefResource(String refResource) {
            this.refResource = refResource;
            return this;
        }
        public String getRefResource() {
            return this.refResource;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setRelationStrategy(Integer relationStrategy) {
            this.relationStrategy = relationStrategy;
            return this;
        }
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListIsolationRulesOfResourceResponseBodyDataDatas setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class ListIsolationRulesOfResourceResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<ListIsolationRulesOfResourceResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListIsolationRulesOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIsolationRulesOfResourceResponseBodyData self = new ListIsolationRulesOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIsolationRulesOfResourceResponseBodyData setDatas(java.util.List<ListIsolationRulesOfResourceResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<ListIsolationRulesOfResourceResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public ListIsolationRulesOfResourceResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListIsolationRulesOfResourceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIsolationRulesOfResourceResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListIsolationRulesOfResourceResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
