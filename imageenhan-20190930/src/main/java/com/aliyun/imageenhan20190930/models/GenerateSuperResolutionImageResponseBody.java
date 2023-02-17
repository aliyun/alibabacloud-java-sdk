// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateSuperResolutionImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateSuperResolutionImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateSuperResolutionImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateSuperResolutionImageResponseBody self = new GenerateSuperResolutionImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateSuperResolutionImageResponseBody setData(GenerateSuperResolutionImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateSuperResolutionImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateSuperResolutionImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateSuperResolutionImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateSuperResolutionImageResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static GenerateSuperResolutionImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateSuperResolutionImageResponseBodyData self = new GenerateSuperResolutionImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateSuperResolutionImageResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
