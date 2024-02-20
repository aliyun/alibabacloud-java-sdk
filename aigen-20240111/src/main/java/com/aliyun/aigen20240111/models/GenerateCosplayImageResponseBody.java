// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateCosplayImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateCosplayImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateCosplayImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCosplayImageResponseBody self = new GenerateCosplayImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCosplayImageResponseBody setData(GenerateCosplayImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateCosplayImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateCosplayImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateCosplayImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateCosplayImageResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static GenerateCosplayImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateCosplayImageResponseBodyData self = new GenerateCosplayImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateCosplayImageResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
