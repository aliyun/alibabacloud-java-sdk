// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetSpringCloudFlowItemRulesResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetSpringCloudFlowItemRulesResponseBodyData> data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("ip")
    public String ip;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("message")
    public String message;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("httpCode")
    public Integer httpCode;

    public static GetSpringCloudFlowItemRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpringCloudFlowItemRulesResponseBody self = new GetSpringCloudFlowItemRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpringCloudFlowItemRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetSpringCloudFlowItemRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSpringCloudFlowItemRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpringCloudFlowItemRulesResponseBody setData(java.util.List<GetSpringCloudFlowItemRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSpringCloudFlowItemRulesResponseBodyData> getData() {
        return this.data;
    }

    public GetSpringCloudFlowItemRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSpringCloudFlowItemRulesResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetSpringCloudFlowItemRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSpringCloudFlowItemRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSpringCloudFlowItemRulesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSpringCloudFlowItemRulesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher extends TeaModel {
        // 键值
        @NameInMap("Key")
        public String key;

        // 匹配类型。in,notIn,between,>,>=,<,<=,=
        @NameInMap("MatchType")
        public String matchType;

        // 值的集合
        @NameInMap("Values")
        public java.util.List<String> values;

        // 提取类型。mod,whole
        @NameInMap("ExtractType")
        public String extractType;

        // 模数
        @NameInMap("ModValue")
        public Long modValue;

        public static GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher build(java.util.Map<String, ?> map) throws Exception {
            GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher self = new GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher();
            return TeaModel.build(map, self);
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher setExtractType(String extractType) {
            this.extractType = extractType;
            return this;
        }
        public String getExtractType() {
            return this.extractType;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher setModValue(Long modValue) {
            this.modValue = modValue;
            return this;
        }
        public Long getModValue() {
            return this.modValue;
        }

    }

    public static class GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher extends TeaModel {
        // 键值
        @NameInMap("Key")
        public String key;

        // 匹配类型。in,notIn,between,>,>=,<,<=,=
        @NameInMap("MatchType")
        public String matchType;

        // 值的集合
        @NameInMap("Values")
        public java.util.List<String> values;

        // 提取类型。mod,whole
        @NameInMap("ExtractType")
        public String extractType;

        // 模数
        @NameInMap("ModValue")
        public Long modValue;

        public static GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher build(java.util.Map<String, ?> map) throws Exception {
            GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher self = new GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher();
            return TeaModel.build(map, self);
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher setExtractType(String extractType) {
            this.extractType = extractType;
            return this;
        }
        public String getExtractType() {
            return this.extractType;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher setModValue(Long modValue) {
            this.modValue = modValue;
            return this;
        }
        public Long getModValue() {
            return this.modValue;
        }

    }

    public static class GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList extends TeaModel {
        // 单元格
        @NameInMap("cellFlag")
        public String cellFlag;

        // 引流比例。0.0000～1，最多支持小数点后4位
        @NameInMap("weight")
        public String weight;

        public static GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList build(java.util.Map<String, ?> map) throws Exception {
            GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList self = new GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList();
            return TeaModel.build(map, self);
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList setCellFlag(String cellFlag) {
            this.cellFlag = cellFlag;
            return this;
        }
        public String getCellFlag() {
            return this.cellFlag;
        }

        public GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class GetSpringCloudFlowItemRulesResponseBodyData extends TeaModel {
        // 该匹配规则的ID
        @NameInMap("ruleItemId")
        public Long ruleItemId;

        // 名称
        @NameInMap("name")
        public String name;

        // 是否生效
        @NameInMap("active")
        public Boolean active;

        // 是否开启流量染色
        @NameInMap("transportEnable")
        public Boolean transportEnable;

        // 优先级
        @NameInMap("priority")
        public Integer priority;

        // HTTP query匹配条件
        @NameInMap("queryMatcher")
        public java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher> queryMatcher;

        // HTTP header匹配条件
        @NameInMap("headerMatcher")
        public java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher> headerMatcher;

        // URI的列表
        @NameInMap("uriList")
        public java.util.List<String> uriList;

        // 单元格引流比例
        @NameInMap("cellWeightList")
        public java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList> cellWeightList;

        // 状态.未配置,创建未生效,修改未生效,删除未生效,推送中,生效中,生效失败
        @NameInMap("status")
        public String status;

        public static GetSpringCloudFlowItemRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSpringCloudFlowItemRulesResponseBodyData self = new GetSpringCloudFlowItemRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setRuleItemId(Long ruleItemId) {
            this.ruleItemId = ruleItemId;
            return this;
        }
        public Long getRuleItemId() {
            return this.ruleItemId;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setTransportEnable(Boolean transportEnable) {
            this.transportEnable = transportEnable;
            return this;
        }
        public Boolean getTransportEnable() {
            return this.transportEnable;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setQueryMatcher(java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher> queryMatcher) {
            this.queryMatcher = queryMatcher;
            return this;
        }
        public java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataQueryMatcher> getQueryMatcher() {
            return this.queryMatcher;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setHeaderMatcher(java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher> headerMatcher) {
            this.headerMatcher = headerMatcher;
            return this;
        }
        public java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataHeaderMatcher> getHeaderMatcher() {
            return this.headerMatcher;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setUriList(java.util.List<String> uriList) {
            this.uriList = uriList;
            return this;
        }
        public java.util.List<String> getUriList() {
            return this.uriList;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setCellWeightList(java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList> cellWeightList) {
            this.cellWeightList = cellWeightList;
            return this;
        }
        public java.util.List<GetSpringCloudFlowItemRulesResponseBodyDataCellWeightList> getCellWeightList() {
            return this.cellWeightList;
        }

        public GetSpringCloudFlowItemRulesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
