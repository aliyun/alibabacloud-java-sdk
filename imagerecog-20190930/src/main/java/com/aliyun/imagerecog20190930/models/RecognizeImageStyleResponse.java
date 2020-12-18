// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageStyleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeImageStyleResponseData data;

    public static RecognizeImageStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageStyleResponse self = new RecognizeImageStyleResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeImageStyleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeImageStyleResponse setData(RecognizeImageStyleResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageStyleResponseData getData() {
        return this.data;
    }

    public static class RecognizeImageStyleResponseData extends TeaModel {
        @NameInMap("Styles")
        @Validation(required = true)
        public java.util.List<String> styles;

        public static RecognizeImageStyleResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageStyleResponseData self = new RecognizeImageStyleResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeImageStyleResponseData setStyles(java.util.List<String> styles) {
            this.styles = styles;
            return this;
        }
        public java.util.List<String> getStyles() {
            return this.styles;
        }

    }

}
