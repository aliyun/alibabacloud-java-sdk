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

    public static class RecognizeImageColorResponseDataColorTemplateList extends TeaModel {
        @NameInMap("Color")
        @Validation(required = true)
        public String color;

        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Percentage")
        @Validation(required = true)
        public Double percentage;

        public static RecognizeImageColorResponseDataColorTemplateList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageColorResponseDataColorTemplateList self = new RecognizeImageColorResponseDataColorTemplateList();
            return TeaModel.build(map, self);
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

    }

}
