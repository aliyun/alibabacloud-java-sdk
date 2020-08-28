// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit.models;

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

    public static class ScanTextResponseDataElementsResultsDetailsContexts extends TeaModel {
        @NameInMap("Context")
        @Validation(required = true)
        public String context;

        public static ScanTextResponseDataElementsResultsDetailsContexts build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseDataElementsResultsDetailsContexts self = new ScanTextResponseDataElementsResultsDetailsContexts();
            return TeaModel.build(map, self);
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
        public Double rate;

        @NameInMap("Details")
        @Validation(required = true)
        public java.util.List<ScanTextResponseDataElementsResultsDetails> details;

        public static ScanTextResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseDataElementsResults self = new ScanTextResponseDataElementsResults();
            return TeaModel.build(map, self);
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

    }

    public static class ScanTextResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<ScanTextResponseDataElements> elements;

        public static ScanTextResponseData build(java.util.Map<String, ?> map) throws Exception {
            ScanTextResponseData self = new ScanTextResponseData();
            return TeaModel.build(map, self);
        }

    }

}
