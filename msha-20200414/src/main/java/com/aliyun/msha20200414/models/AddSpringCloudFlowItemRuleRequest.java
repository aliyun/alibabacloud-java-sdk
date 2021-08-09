// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class AddSpringCloudFlowItemRuleRequest extends TeaModel {
    @NameInMap("requestData")
    public AddSpringCloudFlowItemRuleRequestRequestData requestData;

    public static AddSpringCloudFlowItemRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSpringCloudFlowItemRuleRequest self = new AddSpringCloudFlowItemRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddSpringCloudFlowItemRuleRequest setRequestData(AddSpringCloudFlowItemRuleRequestRequestData requestData) {
        this.requestData = requestData;
        return this;
    }
    public AddSpringCloudFlowItemRuleRequestRequestData getRequestData() {
        return this.requestData;
    }

    public static class AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher extends TeaModel {
        // 键值
        @NameInMap("key")
        public String key;

        // 匹配类型。in,notIn,between,>,>=,<,<=,=
        @NameInMap("matchType")
        public String matchType;

        // 值的集合
        @NameInMap("values")
        public java.util.List<String> values;

        // 提取类型。mod,whole
        @NameInMap("extractType")
        public String extractType;

        // 模数
        @NameInMap("modValue")
        public Long modValue;

        public static AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher build(java.util.Map<String, ?> map) throws Exception {
            AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher self = new AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher();
            return TeaModel.build(map, self);
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setExtractType(String extractType) {
            this.extractType = extractType;
            return this;
        }
        public String getExtractType() {
            return this.extractType;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setModValue(Long modValue) {
            this.modValue = modValue;
            return this;
        }
        public Long getModValue() {
            return this.modValue;
        }

    }

    public static class AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher extends TeaModel {
        // 键值
        @NameInMap("key")
        public String key;

        // 匹配类型。in,notIn,between,>,>=,<,<=,=
        @NameInMap("matchType")
        public String matchType;

        // 值的集合
        @NameInMap("values")
        public java.util.List<String> values;

        // 提取类型。mod,whole
        @NameInMap("extractType")
        public String extractType;

        // 模数
        @NameInMap("modValue")
        public Long modValue;

        public static AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher build(java.util.Map<String, ?> map) throws Exception {
            AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher self = new AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher();
            return TeaModel.build(map, self);
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setExtractType(String extractType) {
            this.extractType = extractType;
            return this;
        }
        public String getExtractType() {
            return this.extractType;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setModValue(Long modValue) {
            this.modValue = modValue;
            return this;
        }
        public Long getModValue() {
            return this.modValue;
        }

    }

    public static class AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList extends TeaModel {
        // 单元格
        @NameInMap("cellFlag")
        public String cellFlag;

        // 引流比例,最多支持小数点后4位。0.0000～1.0000
        @NameInMap("weight")
        public String weight;

        public static AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList build(java.util.Map<String, ?> map) throws Exception {
            AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList self = new AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList();
            return TeaModel.build(map, self);
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList setCellFlag(String cellFlag) {
            this.cellFlag = cellFlag;
            return this;
        }
        public String getCellFlag() {
            return this.cellFlag;
        }

        public AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class AddSpringCloudFlowItemRuleRequestRequestData extends TeaModel {
        // 多活命名空间ID
        @NameInMap("mshaTenantId")
        public String mshaTenantId;

        // 单元
        @NameInMap("unitFlag")
        public String unitFlag;

        // 应用名称
        @NameInMap("appName")
        public String appName;

        // 是否开启染色
        @NameInMap("transportEnable")
        public Boolean transportEnable;

        // 优先级
        @NameInMap("priority")
        public Long priority;

        // 名称
        @NameInMap("name")
        public String name;

        // URI列表
        @NameInMap("uriList")
        public java.util.List<String> uriList;

        // 是否生效，该规则在数据面是否生效
        @NameInMap("active")
        public Boolean active;

        // Http query param匹配
        @NameInMap("queryMatcher")
        public java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher> queryMatcher;

        // HTTP header匹配规则
        @NameInMap("headerMatcher")
        public java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher> headerMatcher;

        @NameInMap("cellWeightList")
        public java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList> cellWeightList;

        // 是否立即生效，MSHA将立即推送该规则
        @NameInMap("effective")
        public Boolean effective;

        public static AddSpringCloudFlowItemRuleRequestRequestData build(java.util.Map<String, ?> map) throws Exception {
            AddSpringCloudFlowItemRuleRequestRequestData self = new AddSpringCloudFlowItemRuleRequestRequestData();
            return TeaModel.build(map, self);
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setMshaTenantId(String mshaTenantId) {
            this.mshaTenantId = mshaTenantId;
            return this;
        }
        public String getMshaTenantId() {
            return this.mshaTenantId;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setUnitFlag(String unitFlag) {
            this.unitFlag = unitFlag;
            return this;
        }
        public String getUnitFlag() {
            return this.unitFlag;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setTransportEnable(Boolean transportEnable) {
            this.transportEnable = transportEnable;
            return this;
        }
        public Boolean getTransportEnable() {
            return this.transportEnable;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setUriList(java.util.List<String> uriList) {
            this.uriList = uriList;
            return this;
        }
        public java.util.List<String> getUriList() {
            return this.uriList;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setQueryMatcher(java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher> queryMatcher) {
            this.queryMatcher = queryMatcher;
            return this;
        }
        public java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataQueryMatcher> getQueryMatcher() {
            return this.queryMatcher;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setHeaderMatcher(java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher> headerMatcher) {
            this.headerMatcher = headerMatcher;
            return this;
        }
        public java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher> getHeaderMatcher() {
            return this.headerMatcher;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setCellWeightList(java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList> cellWeightList) {
            this.cellWeightList = cellWeightList;
            return this;
        }
        public java.util.List<AddSpringCloudFlowItemRuleRequestRequestDataCellWeightList> getCellWeightList() {
            return this.cellWeightList;
        }

        public AddSpringCloudFlowItemRuleRequestRequestData setEffective(Boolean effective) {
            this.effective = effective;
            return this;
        }
        public Boolean getEffective() {
            return this.effective;
        }

    }

}
