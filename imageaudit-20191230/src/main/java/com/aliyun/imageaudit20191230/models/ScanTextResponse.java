// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanTextResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ScanTextResponseData data;

    public static ScanTextResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanTextResponse self = new ScanTextResponse();
        return TeaModel.build(map, self);
    }

    public ScanTextResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanTextResponse setData(ScanTextResponseData data) {
        this.data = data;
        return this;
    }
    public ScanTextResponseData getData() {
        return this.data;
    }

    public static class ScanTextResponseDataElementsResultsDetailsContexts extends TeaModel {
        @NameInMap("Context")
        @Validation(required = true)
        public String context;

        public static ScanTextResponseDataElementsResultsDetailsContexts build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseDataElementsResultsDetailsContexts self = new ScanTextResponseDataElementsResultsDetailsContexts();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseDataElementsResultsDetailsContexts setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

    }

    public static class ScanTextResponseDataElementsResultsDetails extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Contexts")
        @Validation(required = true)
        public java.util.List<ScanTextResponseDataElementsResultsDetailsContexts> contexts;

        public static ScanTextResponseDataElementsResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseDataElementsResultsDetails self = new ScanTextResponseDataElementsResultsDetails();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseDataElementsResultsDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ScanTextResponseDataElementsResultsDetails setContexts(java.util.List<ScanTextResponseDataElementsResultsDetailsContexts> contexts) {
            this.contexts = contexts;
            return this;
        }
        public java.util.List<ScanTextResponseDataElementsResultsDetailsContexts> getContexts() {
            return this.contexts;
        }

    }

    public static class ScanTextResponseDataElementsResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("Details")
        @Validation(required = true)
        public java.util.List<ScanTextResponseDataElementsResultsDetails> details;

        public static ScanTextResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseDataElementsResults self = new ScanTextResponseDataElementsResults();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ScanTextResponseDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ScanTextResponseDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ScanTextResponseDataElementsResults setDetails(java.util.List<ScanTextResponseDataElementsResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ScanTextResponseDataElementsResultsDetails> getDetails() {
            return this.details;
        }

    }

    public static class ScanTextResponseDataElements extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<ScanTextResponseDataElementsResults> results;

        public static ScanTextResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseDataElements self = new ScanTextResponseDataElements();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ScanTextResponseDataElements setResults(java.util.List<ScanTextResponseDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ScanTextResponseDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class ScanTextResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<ScanTextResponseDataElements> elements;

        public static ScanTextResponseData build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseData self = new ScanTextResponseData();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseData setElements(java.util.List<ScanTextResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ScanTextResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
