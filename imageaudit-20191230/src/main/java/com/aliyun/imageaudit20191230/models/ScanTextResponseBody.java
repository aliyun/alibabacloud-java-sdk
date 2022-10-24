// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanTextResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScanTextResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ScanTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanTextResponseBody self = new ScanTextResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanTextResponseBody setData(ScanTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScanTextResponseBodyData getData() {
        return this.data;
    }

    public ScanTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        @NameInMap("Contexts")
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetailsContexts> contexts;

        @NameInMap("Label")
        public String label;

        public static ScanTextResponseBodyDataElementsResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyDataElementsResultsDetails self = new ScanTextResponseBodyDataElementsResultsDetails();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyDataElementsResultsDetails setContexts(java.util.List<ScanTextResponseBodyDataElementsResultsDetailsContexts> contexts) {
            this.contexts = contexts;
            return this;
        }
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetailsContexts> getContexts() {
            return this.contexts;
        }

        public ScanTextResponseBodyDataElementsResultsDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ScanTextResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Details")
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetails> details;

        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Suggestion")
        public String suggestion;

        public static ScanTextResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyDataElementsResults self = new ScanTextResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyDataElementsResults setDetails(java.util.List<ScanTextResponseBodyDataElementsResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ScanTextResponseBodyDataElementsResultsDetails> getDetails() {
            return this.details;
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

        public ScanTextResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ScanTextResponseBodyDataElements extends TeaModel {
        @NameInMap("Results")
        public java.util.List<ScanTextResponseBodyDataElementsResults> results;

        @NameInMap("TaskId")
        public String taskId;

        public static ScanTextResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseBodyDataElements self = new ScanTextResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public ScanTextResponseBodyDataElements setResults(java.util.List<ScanTextResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ScanTextResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

        public ScanTextResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
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
