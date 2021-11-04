// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImAuditResponseBody extends TeaModel {
    @NameInMap("ImageQuotaExceed")
    public Boolean imageQuotaExceed;

    @NameInMap("ImageResults")
    public ImAuditResponseBodyImageResults imageResults;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TextQuotaExceed")
    public Boolean textQuotaExceed;

    @NameInMap("TextResults")
    public ImAuditResponseBodyTextResults textResults;

    public static ImAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImAuditResponseBody self = new ImAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public ImAuditResponseBody setImageQuotaExceed(Boolean imageQuotaExceed) {
        this.imageQuotaExceed = imageQuotaExceed;
        return this;
    }
    public Boolean getImageQuotaExceed() {
        return this.imageQuotaExceed;
    }

    public ImAuditResponseBody setImageResults(ImAuditResponseBodyImageResults imageResults) {
        this.imageResults = imageResults;
        return this;
    }
    public ImAuditResponseBodyImageResults getImageResults() {
        return this.imageResults;
    }

    public ImAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImAuditResponseBody setTextQuotaExceed(Boolean textQuotaExceed) {
        this.textQuotaExceed = textQuotaExceed;
        return this;
    }
    public Boolean getTextQuotaExceed() {
        return this.textQuotaExceed;
    }

    public ImAuditResponseBody setTextResults(ImAuditResponseBodyTextResults textResults) {
        this.textResults = textResults;
        return this;
    }
    public ImAuditResponseBodyTextResults getTextResults() {
        return this.textResults;
    }

    public static class ImAuditResponseBodyImageResultsResultResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Double rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static ImAuditResponseBodyImageResultsResultResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResults self = new ImAuditResponseBodyImageResultsResultResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyImageResultsResultResults setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyImageResultsResultResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImAuditResponseBodyImageResultsResultResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ImAuditResponseBodyImageResultsResult extends TeaModel {
        @NameInMap("code")
        public Long code;

        @NameInMap("dataId")
        public String dataId;

        @NameInMap("extras")
        public java.util.Map<String, ?> extras;

        @NameInMap("msg")
        public String msg;

        @NameInMap("results")
        public java.util.List<ImAuditResponseBodyImageResultsResultResults> results;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("url")
        public String url;

        public static ImAuditResponseBodyImageResultsResult build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResult self = new ImAuditResponseBodyImageResultsResult();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResult setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImAuditResponseBodyImageResultsResult setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImAuditResponseBodyImageResultsResult setExtras(java.util.Map<String, ?> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.Map<String, ?> getExtras() {
            return this.extras;
        }

        public ImAuditResponseBodyImageResultsResult setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ImAuditResponseBodyImageResultsResult setResults(java.util.List<ImAuditResponseBodyImageResultsResultResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResults> getResults() {
            return this.results;
        }

        public ImAuditResponseBodyImageResultsResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ImAuditResponseBodyImageResultsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ImAuditResponseBodyImageResults extends TeaModel {
        @NameInMap("result")
        public java.util.List<ImAuditResponseBodyImageResultsResult> result;

        public static ImAuditResponseBodyImageResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResults self = new ImAuditResponseBodyImageResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResults setResult(java.util.List<ImAuditResponseBodyImageResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResult> getResult() {
            return this.result;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResultsDetails extends TeaModel {
        @NameInMap("Label")
        public String label;

        public static ImAuditResponseBodyTextResultsResultResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResultsDetails self = new ImAuditResponseBodyTextResultsResultResultsDetails();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResultsDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResults extends TeaModel {
        @NameInMap("details")
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> details;

        @NameInMap("label")
        public String label;

        @NameInMap("rate")
        public Double rate;

        @NameInMap("scene")
        public String scene;

        @NameInMap("suggestion")
        public String suggestion;

        public static ImAuditResponseBodyTextResultsResultResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResults self = new ImAuditResponseBodyTextResultsResultResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResults setDetails(java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> getDetails() {
            return this.details;
        }

        public ImAuditResponseBodyTextResultsResultResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyTextResultsResultResults setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyTextResultsResultResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImAuditResponseBodyTextResultsResultResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ImAuditResponseBodyTextResultsResult extends TeaModel {
        @NameInMap("code")
        public Long code;

        @NameInMap("content")
        public String content;

        @NameInMap("dataId")
        public String dataId;

        @NameInMap("msg")
        public String msg;

        @NameInMap("results")
        public java.util.List<ImAuditResponseBodyTextResultsResultResults> results;

        @NameInMap("taskId")
        public String taskId;

        public static ImAuditResponseBodyTextResultsResult build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResult self = new ImAuditResponseBodyTextResultsResult();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResult setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImAuditResponseBodyTextResultsResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ImAuditResponseBodyTextResultsResult setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImAuditResponseBodyTextResultsResult setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ImAuditResponseBodyTextResultsResult setResults(java.util.List<ImAuditResponseBodyTextResultsResultResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResults> getResults() {
            return this.results;
        }

        public ImAuditResponseBodyTextResultsResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ImAuditResponseBodyTextResults extends TeaModel {
        @NameInMap("result")
        public java.util.List<ImAuditResponseBodyTextResultsResult> result;

        public static ImAuditResponseBodyTextResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResults self = new ImAuditResponseBodyTextResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResults setResult(java.util.List<ImAuditResponseBodyTextResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResult> getResult() {
            return this.result;
        }

    }

}
