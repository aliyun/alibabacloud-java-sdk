// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanTextResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ScanTextResponseBodyData data;

    public static ScanTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanTextResponseBody self = new ScanTextResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanTextResponseBody setData(ScanTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScanTextResponseBodyData getData() {
        return this.data;
    }

    public static class ScanTextResponseBodyDataElementsResultsDetailsContexts extends TeaModel {
        @NameInMap("Context")
        public String context;

        public static ScanTextResponseBodyDataElementsResultsDetailsContexts build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyDataElementsResultsDetailsContexts self = new ScanTextResponseBodyDataElementsResultsDetailsContexts();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyDataElementsResultsDetailsContexts setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

    }

    public static class ScanTextResponseBodyDataElementsResultsDetails extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Contexts")
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetailsContexts> contexts;

        public static ScanTextResponseBodyDataElementsResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyDataElementsResultsDetails self = new ScanTextResponseBodyDataElementsResultsDetails();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyDataElementsResultsDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ScanTextResponseBodyDataElementsResultsDetails setContexts(java.util.List<ScanTextResponseBodyDataElementsResultsDetailsContexts> contexts) {
            this.contexts = contexts;
            return this;
        }
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetailsContexts> getContexts() {
            return this.contexts;
        }

    }

    public static class ScanTextResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Details")
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetails> details;

        public static ScanTextResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyDataElementsResults self = new ScanTextResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ScanTextResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ScanTextResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ScanTextResponseBodyDataElementsResults setDetails(java.util.List<ScanTextResponseBodyDataElementsResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetails> getDetails() {
            return this.details;
        }

    }

    public static class ScanTextResponseBodyDataElements extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Results")
        public java.util.List<ScanTextResponseBodyDataElementsResults> results;

        public static ScanTextResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyDataElements self = new ScanTextResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ScanTextResponseBodyDataElements setResults(java.util.List<ScanTextResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ScanTextResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class ScanTextResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<ScanTextResponseBodyDataElements> elements;

        public static ScanTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyData self = new ScanTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyData setElements(java.util.List<ScanTextResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ScanTextResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
