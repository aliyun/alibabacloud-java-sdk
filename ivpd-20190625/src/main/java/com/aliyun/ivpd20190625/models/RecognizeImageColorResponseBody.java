// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class RecognizeImageColorResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeImageColorResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeImageColorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageColorResponseBody self = new RecognizeImageColorResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeImageColorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeImageColorResponseBody setData(RecognizeImageColorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageColorResponseBodyData getData() {
        return this.data;
    }

    public RecognizeImageColorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeImageColorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeImageColorResponseBodyDataColorTemplateList extends TeaModel {
        @NameInMap("Color")
        public String color;

        @NameInMap("Label")
        public String label;

        @NameInMap("Percentage")
        public Float percentage;

        public static RecognizeImageColorResponseBodyDataColorTemplateList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageColorResponseBodyDataColorTemplateList self = new RecognizeImageColorResponseBodyDataColorTemplateList();
            return TeaModel.build(map, self);
        }

        public RecognizeImageColorResponseBodyDataColorTemplateList setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public RecognizeImageColorResponseBodyDataColorTemplateList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeImageColorResponseBodyDataColorTemplateList setPercentage(Float percentage) {
            this.percentage = percentage;
            return this;
        }
        public Float getPercentage() {
            return this.percentage;
        }

    }

    public static class RecognizeImageColorResponseBodyData extends TeaModel {
        @NameInMap("ColorTemplateList")
        public java.util.List<RecognizeImageColorResponseBodyDataColorTemplateList> colorTemplateList;

        public static RecognizeImageColorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageColorResponseBodyData self = new RecognizeImageColorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeImageColorResponseBodyData setColorTemplateList(java.util.List<RecognizeImageColorResponseBodyDataColorTemplateList> colorTemplateList) {
            this.colorTemplateList = colorTemplateList;
            return this;
        }
        public java.util.List<RecognizeImageColorResponseBodyDataColorTemplateList> getColorTemplateList() {
            return this.colorTemplateList;
        }

    }

}
