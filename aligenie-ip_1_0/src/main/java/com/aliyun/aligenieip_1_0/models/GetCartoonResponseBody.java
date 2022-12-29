// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetCartoonResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetCartoonResponseBodyResult result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetCartoonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCartoonResponseBody self = new GetCartoonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCartoonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCartoonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCartoonResponseBody setResult(GetCartoonResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCartoonResponseBodyResult getResult() {
        return this.result;
    }

    public GetCartoonResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetCartoonResponseBodyResult extends TeaModel {
        @NameInMap("StartVideoMd5")
        public String startVideoMd5;

        @NameInMap("StartVideoUrl")
        public String startVideoUrl;

        public static GetCartoonResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCartoonResponseBodyResult self = new GetCartoonResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCartoonResponseBodyResult setStartVideoMd5(String startVideoMd5) {
            this.startVideoMd5 = startVideoMd5;
            return this;
        }
        public String getStartVideoMd5() {
            return this.startVideoMd5;
        }

        public GetCartoonResponseBodyResult setStartVideoUrl(String startVideoUrl) {
            this.startVideoUrl = startVideoUrl;
            return this;
        }
        public String getStartVideoUrl() {
            return this.startVideoUrl;
        }

    }

}
