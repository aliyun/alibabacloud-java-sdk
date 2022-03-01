// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DownloadFabricOrganizationSDKResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DownloadFabricOrganizationSDKResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadFabricOrganizationSDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadFabricOrganizationSDKResponseBody self = new DownloadFabricOrganizationSDKResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadFabricOrganizationSDKResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DownloadFabricOrganizationSDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadFabricOrganizationSDKResponseBody setResult(java.util.List<DownloadFabricOrganizationSDKResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DownloadFabricOrganizationSDKResponseBodyResult> getResult() {
        return this.result;
    }

    public DownloadFabricOrganizationSDKResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadFabricOrganizationSDKResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Path")
        public String path;

        public static DownloadFabricOrganizationSDKResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadFabricOrganizationSDKResponseBodyResult self = new DownloadFabricOrganizationSDKResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DownloadFabricOrganizationSDKResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DownloadFabricOrganizationSDKResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
