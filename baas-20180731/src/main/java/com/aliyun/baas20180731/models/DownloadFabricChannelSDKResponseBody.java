// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadFabricChannelSDKResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DownloadFabricChannelSDKResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadFabricChannelSDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadFabricChannelSDKResponseBody self = new DownloadFabricChannelSDKResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadFabricChannelSDKResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DownloadFabricChannelSDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadFabricChannelSDKResponseBody setResult(java.util.List<DownloadFabricChannelSDKResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DownloadFabricChannelSDKResponseBodyResult> getResult() {
        return this.result;
    }

    public DownloadFabricChannelSDKResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadFabricChannelSDKResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Path")
        public String path;

        public static DownloadFabricChannelSDKResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadFabricChannelSDKResponseBodyResult self = new DownloadFabricChannelSDKResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DownloadFabricChannelSDKResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DownloadFabricChannelSDKResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
