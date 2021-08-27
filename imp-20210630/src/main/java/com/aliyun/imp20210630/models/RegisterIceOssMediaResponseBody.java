// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RegisterIceOssMediaResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public RegisterIceOssMediaResponseBodyResult result;

    public static RegisterIceOssMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterIceOssMediaResponseBody self = new RegisterIceOssMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterIceOssMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterIceOssMediaResponseBody setResult(RegisterIceOssMediaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RegisterIceOssMediaResponseBodyResult getResult() {
        return this.result;
    }

    public static class RegisterIceOssMediaResponseBodyResult extends TeaModel {
        // 媒体Id
        @NameInMap("MediaId")
        public String mediaId;

        public static RegisterIceOssMediaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RegisterIceOssMediaResponseBodyResult self = new RegisterIceOssMediaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RegisterIceOssMediaResponseBodyResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
