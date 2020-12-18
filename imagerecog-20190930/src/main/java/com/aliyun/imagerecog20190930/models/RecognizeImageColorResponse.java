// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageColorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeImageColorResponseData data;

    public static RecognizeImageColorResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageColorResponse self = new RecognizeImageColorResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeImageColorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeImageColorResponse setData(RecognizeImageColorResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageColorResponseData getData() {
        return this.data;
    }

    public static class RecognizeImageColorResponseDataColorTemplateList extends TeaModel {
        @NameInMap("Color")
        @Validation(required = true)
        public String color;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Percentage")
        @Validation(required = true)
        public Float percentage;

        public static RecognizeImageColorResponseDataColorTemplateList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageColorResponseDataColorTemplateList self = new RecognizeImageColorResponseDataColorTemplateList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageColorResponseDataColorTemplateList setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public RecognizeImageColorResponseDataColorTemplateList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeImageColorResponseDataColorTemplateList setPercentage(Float percentage) {
            this.percentage = percentage;
            return this;
        }
        public Float getPercentage() {
            return this.percentage;
        }

    }

    public static class RecognizeImageColorResponseData extends TeaModel {
        @NameInMap("ColorTemplateList")
        @Validation(required = true)
        public java.util.List<RecognizeImageColorResponseDataColorTemplateList> colorTemplateList;

        public static RecognizeImageColorResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageColorResponseData self = new RecognizeImageColorResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeImageColorResponseData setColorTemplateList(java.util.List<RecognizeImageColorResponseDataColorTemplateList> colorTemplateList) {
            this.colorTemplateList = colorTemplateList;
            return this;
        }
        public java.util.List<RecognizeImageColorResponseDataColorTemplateList> getColorTemplateList() {
            return this.colorTemplateList;
        }

    }

}
