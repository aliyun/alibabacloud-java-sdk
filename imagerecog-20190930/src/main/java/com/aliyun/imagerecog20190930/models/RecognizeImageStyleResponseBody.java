// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageStyleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeImageStyleResponseBodyData data;

    public static RecognizeImageStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageStyleResponseBody self = new RecognizeImageStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeImageStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeImageStyleResponseBody setData(RecognizeImageStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageStyleResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeImageStyleResponseBodyData extends TeaModel {
        @NameInMap("Styles")
        public java.util.List<String> styles;

        public static RecognizeImageStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeImageStyleResponseBodyData self = new RecognizeImageStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeImageStyleResponseBodyData setStyles(java.util.List<String> styles) {
            this.styles = styles;
            return this;
        }
        public java.util.List<String> getStyles() {
            return this.styles;
        }

    }

}
