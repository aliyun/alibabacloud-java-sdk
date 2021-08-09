// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class UpdateSpringCloudFlowItemRuleRequest extends TeaModel {
    @NameInMap("requestData")
    public UpdateSpringCloudFlowItemRuleRequestRequestData requestData;

    public static UpdateSpringCloudFlowItemRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpringCloudFlowItemRuleRequest self = new UpdateSpringCloudFlowItemRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpringCloudFlowItemRuleRequest setRequestData(UpdateSpringCloudFlowItemRuleRequestRequestData requestData) {
        this.requestData = requestData;
        return this;
    }
    public UpdateSpringCloudFlowItemRuleRequestRequestData getRequestData() {
        return this.requestData;
    }

    public static class UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher extends TeaModel {
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

        public static UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher build(java.util.Map<String, ?> map) throws Exception {
            UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher self = new UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher();
            return TeaModel.build(map, self);
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setExtractType(String extractType) {
            this.extractType = extractType;
            return this;
        }
        public String getExtractType() {
            return this.extractType;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher setModValue(Long modValue) {
            this.modValue = modValue;
            return this;
        }
        public Long getModValue() {
            return this.modValue;
        }

    }

    public static class UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher extends TeaModel {
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

        public static UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher build(java.util.Map<String, ?> map) throws Exception {
            UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher self = new UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher();
            return TeaModel.build(map, self);
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setExtractType(String extractType) {
            this.extractType = extractType;
            return this;
        }
        public String getExtractType() {
            return this.extractType;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher setModValue(Long modValue) {
            this.modValue = modValue;
            return this;
        }
        public Long getModValue() {
            return this.modValue;
        }

    }

    public static class UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList extends TeaModel {
        // 单元格
        @NameInMap("cellFlag")
        public String cellFlag;

        // 引流比例,最多支持小数点后4位。0.0000～1.0000
        @NameInMap("weight")
        public String weight;

        public static UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList self = new UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList();
            return TeaModel.build(map, self);
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList setCellFlag(String cellFlag) {
            this.cellFlag = cellFlag;
            return this;
        }
        public String getCellFlag() {
            return this.cellFlag;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class UpdateSpringCloudFlowItemRuleRequestRequestData extends TeaModel {
        // itemRuleID
        @NameInMap("itemRuleId")
        public Long itemRuleId;

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
        public java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher> queryMatcher;

        // HTTP header匹配规则
        @NameInMap("headerMatcher")
        public java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher> headerMatcher;

        @NameInMap("cellWeightList")
        public java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList> cellWeightList;

        // 是否立即生效，MSHA将立即推送该规则
        @NameInMap("effective")
        public Boolean effective;

        public static UpdateSpringCloudFlowItemRuleRequestRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSpringCloudFlowItemRuleRequestRequestData self = new UpdateSpringCloudFlowItemRuleRequestRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setItemRuleId(Long itemRuleId) {
            this.itemRuleId = itemRuleId;
            return this;
        }
        public Long getItemRuleId() {
            return this.itemRuleId;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setTransportEnable(Boolean transportEnable) {
            this.transportEnable = transportEnable;
            return this;
        }
        public Boolean getTransportEnable() {
            return this.transportEnable;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setUriList(java.util.List<String> uriList) {
            this.uriList = uriList;
            return this;
        }
        public java.util.List<String> getUriList() {
            return this.uriList;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setQueryMatcher(java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher> queryMatcher) {
            this.queryMatcher = queryMatcher;
            return this;
        }
        public java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataQueryMatcher> getQueryMatcher() {
            return this.queryMatcher;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setHeaderMatcher(java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher> headerMatcher) {
            this.headerMatcher = headerMatcher;
            return this;
        }
        public java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataHeaderMatcher> getHeaderMatcher() {
            return this.headerMatcher;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setCellWeightList(java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList> cellWeightList) {
            this.cellWeightList = cellWeightList;
            return this;
        }
        public java.util.List<UpdateSpringCloudFlowItemRuleRequestRequestDataCellWeightList> getCellWeightList() {
            return this.cellWeightList;
        }

        public UpdateSpringCloudFlowItemRuleRequestRequestData setEffective(Boolean effective) {
            this.effective = effective;
            return this;
        }
        public Boolean getEffective() {
            return this.effective;
        }

    }

}
