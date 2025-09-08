// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeMultimodalModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeMultimodalModerationResultResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMultimodalModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultimodalModerationResultResponseBody self = new DescribeMultimodalModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultimodalModerationResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeMultimodalModerationResultResponseBody setData(DescribeMultimodalModerationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMultimodalModerationResultResponseBodyData getData() {
        return this.data;
    }

    public DescribeMultimodalModerationResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeMultimodalModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults self = new DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults();
            return TeaModel.build(map, self);
        }

        public DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas extends TeaModel {
        @NameInMap("Results")
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults> results;

        public static DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas self = new DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas setResults(java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatasResults> getResults() {
            return this.results;
        }

    }

    public static class DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults self = new DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults();
            return TeaModel.build(map, self);
        }

        public DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeMultimodalModerationResultResponseBodyDataCommentDatas extends TeaModel {
        @NameInMap("CommentDatas")
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas> commentDatas;

        @NameInMap("Results")
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults> results;

        public static DescribeMultimodalModerationResultResponseBodyDataCommentDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultimodalModerationResultResponseBodyDataCommentDatas self = new DescribeMultimodalModerationResultResponseBodyDataCommentDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMultimodalModerationResultResponseBodyDataCommentDatas setCommentDatas(java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas> commentDatas) {
            this.commentDatas = commentDatas;
            return this;
        }
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasCommentDatas> getCommentDatas() {
            return this.commentDatas;
        }

        public DescribeMultimodalModerationResultResponseBodyDataCommentDatas setResults(java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatasResults> getResults() {
            return this.results;
        }

    }

    public static class DescribeMultimodalModerationResultResponseBodyDataMainDataResults extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static DescribeMultimodalModerationResultResponseBodyDataMainDataResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultimodalModerationResultResponseBodyDataMainDataResults self = new DescribeMultimodalModerationResultResponseBodyDataMainDataResults();
            return TeaModel.build(map, self);
        }

        public DescribeMultimodalModerationResultResponseBodyDataMainDataResults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMultimodalModerationResultResponseBodyDataMainDataResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeMultimodalModerationResultResponseBodyDataMainData extends TeaModel {
        @NameInMap("Results")
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataMainDataResults> results;

        public static DescribeMultimodalModerationResultResponseBodyDataMainData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultimodalModerationResultResponseBodyDataMainData self = new DescribeMultimodalModerationResultResponseBodyDataMainData();
            return TeaModel.build(map, self);
        }

        public DescribeMultimodalModerationResultResponseBodyDataMainData setResults(java.util.List<DescribeMultimodalModerationResultResponseBodyDataMainDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataMainDataResults> getResults() {
            return this.results;
        }

    }

    public static class DescribeMultimodalModerationResultResponseBodyData extends TeaModel {
        @NameInMap("CommentDatas")
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatas> commentDatas;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("MainData")
        public DescribeMultimodalModerationResultResponseBodyDataMainData mainData;

        @NameInMap("ReqId")
        public String reqId;

        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeMultimodalModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultimodalModerationResultResponseBodyData self = new DescribeMultimodalModerationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMultimodalModerationResultResponseBodyData setCommentDatas(java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatas> commentDatas) {
            this.commentDatas = commentDatas;
            return this;
        }
        public java.util.List<DescribeMultimodalModerationResultResponseBodyDataCommentDatas> getCommentDatas() {
            return this.commentDatas;
        }

        public DescribeMultimodalModerationResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeMultimodalModerationResultResponseBodyData setMainData(DescribeMultimodalModerationResultResponseBodyDataMainData mainData) {
            this.mainData = mainData;
            return this;
        }
        public DescribeMultimodalModerationResultResponseBodyDataMainData getMainData() {
            return this.mainData;
        }

        public DescribeMultimodalModerationResultResponseBodyData setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public DescribeMultimodalModerationResultResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
