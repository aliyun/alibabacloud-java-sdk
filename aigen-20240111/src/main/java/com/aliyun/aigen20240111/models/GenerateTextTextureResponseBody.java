// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextTextureResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateTextTextureResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateTextTextureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextTextureResponseBody self = new GenerateTextTextureResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTextTextureResponseBody setData(GenerateTextTextureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateTextTextureResponseBodyData getData() {
        return this.data;
    }

    public GenerateTextTextureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateTextTextureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateTextTextureResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static GenerateTextTextureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateTextTextureResponseBodyData self = new GenerateTextTextureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateTextTextureResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
