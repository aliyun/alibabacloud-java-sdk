// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImagePropertyResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public ImagePropertyResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static ImagePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImagePropertyResponseBody self = new ImagePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ImagePropertyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImagePropertyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImagePropertyResponseBody setData(ImagePropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImagePropertyResponseBodyData getData() {
        return this.data;
    }

    public ImagePropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImagePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImagePropertyResponseBodyDataPropertyResultsValues extends TeaModel {
        @NameInMap("ValueId")
        public String valueId;

        @NameInMap("Probability")
        public Float probability;

        @NameInMap("ValueName")
        public String valueName;

        public static ImagePropertyResponseBodyDataPropertyResultsValues build(java.util.Map<String, ?> map) throws Exception {
            ImagePropertyResponseBodyDataPropertyResultsValues self = new ImagePropertyResponseBodyDataPropertyResultsValues();
            return TeaModel.build(map, self);
        }

        public ImagePropertyResponseBodyDataPropertyResultsValues setValueId(String valueId) {
            this.valueId = valueId;
            return this;
        }
        public String getValueId() {
            return this.valueId;
        }

        public ImagePropertyResponseBodyDataPropertyResultsValues setProbability(Float probability) {
            this.probability = probability;
            return this;
        }
        public Float getProbability() {
            return this.probability;
        }

        public ImagePropertyResponseBodyDataPropertyResultsValues setValueName(String valueName) {
            this.valueName = valueName;
            return this;
        }
        public String getValueName() {
            return this.valueName;
        }

    }

    public static class ImagePropertyResponseBodyDataPropertyResults extends TeaModel {
        @NameInMap("PropertyName")
        public String propertyName;

        @NameInMap("PropertyId")
        public String propertyId;

        @NameInMap("Values")
        public java.util.List<ImagePropertyResponseBodyDataPropertyResultsValues> values;

        public static ImagePropertyResponseBodyDataPropertyResults build(java.util.Map<String, ?> map) throws Exception {
            ImagePropertyResponseBodyDataPropertyResults self = new ImagePropertyResponseBodyDataPropertyResults();
            return TeaModel.build(map, self);
        }

        public ImagePropertyResponseBodyDataPropertyResults setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public ImagePropertyResponseBodyDataPropertyResults setPropertyId(String propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public String getPropertyId() {
            return this.propertyId;
        }

        public ImagePropertyResponseBodyDataPropertyResults setValues(java.util.List<ImagePropertyResponseBodyDataPropertyResultsValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<ImagePropertyResponseBodyDataPropertyResultsValues> getValues() {
            return this.values;
        }

    }

    public static class ImagePropertyResponseBodyData extends TeaModel {
        @NameInMap("PropertyResults")
        public java.util.List<ImagePropertyResponseBodyDataPropertyResults> propertyResults;

        public static ImagePropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImagePropertyResponseBodyData self = new ImagePropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImagePropertyResponseBodyData setPropertyResults(java.util.List<ImagePropertyResponseBodyDataPropertyResults> propertyResults) {
            this.propertyResults = propertyResults;
            return this;
        }
        public java.util.List<ImagePropertyResponseBodyDataPropertyResults> getPropertyResults() {
            return this.propertyResults;
        }

    }

}
