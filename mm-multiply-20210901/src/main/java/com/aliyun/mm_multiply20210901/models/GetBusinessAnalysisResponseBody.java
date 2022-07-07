// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetBusinessAnalysisResponseBody extends TeaModel {
    // 业务日期
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("Code")
    public String code;

    // 日期类型：日、周、月
    @NameInMap("DateType")
    public String dateType;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IndexTrendModels")
    public java.util.List<GetBusinessAnalysisResponseBodyIndexTrendModels> indexTrendModels;

    // 商城id
    @NameInMap("MallId")
    public String mallId;

    @NameInMap("Message")
    public String message;

    // 经营看板、流量看板、商品看板
    @NameInMap("RegionModels")
    public java.util.List<GetBusinessAnalysisResponseBodyRegionModels> regionModels;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBusinessAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessAnalysisResponseBody self = new GetBusinessAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBusinessAnalysisResponseBody setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetBusinessAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBusinessAnalysisResponseBody setDateType(String dateType) {
        this.dateType = dateType;
        return this;
    }
    public String getDateType() {
        return this.dateType;
    }

    public GetBusinessAnalysisResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetBusinessAnalysisResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetBusinessAnalysisResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBusinessAnalysisResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBusinessAnalysisResponseBody setIndexTrendModels(java.util.List<GetBusinessAnalysisResponseBodyIndexTrendModels> indexTrendModels) {
        this.indexTrendModels = indexTrendModels;
        return this;
    }
    public java.util.List<GetBusinessAnalysisResponseBodyIndexTrendModels> getIndexTrendModels() {
        return this.indexTrendModels;
    }

    public GetBusinessAnalysisResponseBody setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

    public GetBusinessAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBusinessAnalysisResponseBody setRegionModels(java.util.List<GetBusinessAnalysisResponseBodyRegionModels> regionModels) {
        this.regionModels = regionModels;
        return this;
    }
    public java.util.List<GetBusinessAnalysisResponseBodyRegionModels> getRegionModels() {
        return this.regionModels;
    }

    public GetBusinessAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBusinessAnalysisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBusinessAnalysisResponseBodyIndexTrendModels extends TeaModel {
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("IndexName")
        public String indexName;

        @NameInMap("IndexTag")
        public String indexTag;

        @NameInMap("IndexValue")
        public Double indexValue;

        public static GetBusinessAnalysisResponseBodyIndexTrendModels build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessAnalysisResponseBodyIndexTrendModels self = new GetBusinessAnalysisResponseBodyIndexTrendModels();
            return TeaModel.build(map, self);
        }

        public GetBusinessAnalysisResponseBodyIndexTrendModels setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetBusinessAnalysisResponseBodyIndexTrendModels setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public GetBusinessAnalysisResponseBodyIndexTrendModels setIndexTag(String indexTag) {
            this.indexTag = indexTag;
            return this;
        }
        public String getIndexTag() {
            return this.indexTag;
        }

        public GetBusinessAnalysisResponseBodyIndexTrendModels setIndexValue(Double indexValue) {
            this.indexValue = indexValue;
            return this;
        }
        public Double getIndexValue() {
            return this.indexValue;
        }

    }

    public static class GetBusinessAnalysisResponseBodyRegionModelsGroups extends TeaModel {
        // 三级大类 数据列表
        @NameInMap("CurrentIndex")
        public String currentIndex;

        // 二级大类 name
        @NameInMap("GroupName")
        public String groupName;

        // 二级大类 tag
        @NameInMap("GroupTag")
        public String groupTag;

        public static GetBusinessAnalysisResponseBodyRegionModelsGroups build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessAnalysisResponseBodyRegionModelsGroups self = new GetBusinessAnalysisResponseBodyRegionModelsGroups();
            return TeaModel.build(map, self);
        }

        public GetBusinessAnalysisResponseBodyRegionModelsGroups setCurrentIndex(String currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }
        public String getCurrentIndex() {
            return this.currentIndex;
        }

        public GetBusinessAnalysisResponseBodyRegionModelsGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetBusinessAnalysisResponseBodyRegionModelsGroups setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

    }

    public static class GetBusinessAnalysisResponseBodyRegionModels extends TeaModel {
        // 二级大类数据列表
        @NameInMap("Groups")
        public java.util.List<GetBusinessAnalysisResponseBodyRegionModelsGroups> groups;

        // 一级大类 name
        @NameInMap("RegionName")
        public String regionName;

        // 一级大类 tag
        @NameInMap("RegionTag")
        public String regionTag;

        public static GetBusinessAnalysisResponseBodyRegionModels build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessAnalysisResponseBodyRegionModels self = new GetBusinessAnalysisResponseBodyRegionModels();
            return TeaModel.build(map, self);
        }

        public GetBusinessAnalysisResponseBodyRegionModels setGroups(java.util.List<GetBusinessAnalysisResponseBodyRegionModelsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetBusinessAnalysisResponseBodyRegionModelsGroups> getGroups() {
            return this.groups;
        }

        public GetBusinessAnalysisResponseBodyRegionModels setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetBusinessAnalysisResponseBodyRegionModels setRegionTag(String regionTag) {
            this.regionTag = regionTag;
            return this;
        }
        public String getRegionTag() {
            return this.regionTag;
        }

    }

}
