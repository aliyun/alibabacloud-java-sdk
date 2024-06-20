// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DownloadFabricOrganizationSDKResponseBody extends TeaModel {
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
    public java.util.List<DownloadFabricOrganizationSDKResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
