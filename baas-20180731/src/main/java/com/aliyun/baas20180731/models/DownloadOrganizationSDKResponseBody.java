// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadOrganizationSDKResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DownloadOrganizationSDKResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DownloadOrganizationSDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadOrganizationSDKResponseBody self = new DownloadOrganizationSDKResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadOrganizationSDKResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DownloadOrganizationSDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadOrganizationSDKResponseBody setResult(java.util.List<DownloadOrganizationSDKResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DownloadOrganizationSDKResponseBodyResult> getResult() {
        return this.result;
    }

    public DownloadOrganizationSDKResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadOrganizationSDKResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>base64string</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>dir/file</p>
         */
        @NameInMap("Path")
        public String path;

        public static DownloadOrganizationSDKResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadOrganizationSDKResponseBodyResult self = new DownloadOrganizationSDKResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DownloadOrganizationSDKResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DownloadOrganizationSDKResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
