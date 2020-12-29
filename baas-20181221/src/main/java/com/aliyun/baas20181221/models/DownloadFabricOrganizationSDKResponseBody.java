// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DownloadFabricOrganizationSDKResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DownloadFabricOrganizationSDKResponseBodyResult> result;

    public static DownloadFabricOrganizationSDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadFabricOrganizationSDKResponseBody self = new DownloadFabricOrganizationSDKResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadFabricOrganizationSDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadFabricOrganizationSDKResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DownloadFabricOrganizationSDKResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DownloadFabricOrganizationSDKResponseBody setResult(java.util.List<DownloadFabricOrganizationSDKResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DownloadFabricOrganizationSDKResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DownloadFabricOrganizationSDKResponseBodyResult extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Content")
        public String content;

        public static DownloadFabricOrganizationSDKResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadFabricOrganizationSDKResponseBodyResult self = new DownloadFabricOrganizationSDKResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DownloadFabricOrganizationSDKResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DownloadFabricOrganizationSDKResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
