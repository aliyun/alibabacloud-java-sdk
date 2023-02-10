// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateCartoonizedImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateCartoonizedImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateCartoonizedImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateCartoonizedImageResponseBody self = new GenerateCartoonizedImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateCartoonizedImageResponseBody setData(GenerateCartoonizedImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateCartoonizedImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateCartoonizedImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateCartoonizedImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateCartoonizedImageResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static GenerateCartoonizedImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateCartoonizedImageResponseBodyData self = new GenerateCartoonizedImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateCartoonizedImageResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
