// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMediaUploadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // 调用返回值
    @NameInMap("Result")
    public GetMediaUploadUrlResponseBodyResult result;

    public static GetMediaUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaUploadUrlResponseBody self = new GetMediaUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMediaUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMediaUploadUrlResponseBody setResult(GetMediaUploadUrlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMediaUploadUrlResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMediaUploadUrlResponseBodyResult extends TeaModel {
        // 上传Url
        @NameInMap("UploadUrl")
        public String uploadUrl;

        // 多媒体文件ID
        @NameInMap("MediaId")
        public String mediaId;

        public static GetMediaUploadUrlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaUploadUrlResponseBodyResult self = new GetMediaUploadUrlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMediaUploadUrlResponseBodyResult setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public GetMediaUploadUrlResponseBodyResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
