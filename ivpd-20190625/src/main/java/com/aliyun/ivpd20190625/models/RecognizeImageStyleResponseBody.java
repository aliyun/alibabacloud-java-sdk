// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class RecognizeImageStyleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RecognizeImageStyleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeImageStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageStyleResponseBody self = new RecognizeImageStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeImageStyleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeImageStyleResponseBody setData(RecognizeImageStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeImageStyleResponseBodyData getData() {
        return this.data;
    }

    public RecognizeImageStyleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeImageStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
