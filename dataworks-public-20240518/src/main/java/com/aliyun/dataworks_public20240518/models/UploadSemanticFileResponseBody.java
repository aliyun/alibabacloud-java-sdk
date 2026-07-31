// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UploadSemanticFileResponseBody extends TeaModel {
    /**
     * <p>The attachment upload slot information. PUT the file to Data.UploadUrl before Data.ExpiresAt, and then use Data.FileId to create a single-file semantic job.</p>
     */
    @NameInMap("Data")
    public UploadSemanticFileResponseBodyData data;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UploadSemanticFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadSemanticFileResponseBody self = new UploadSemanticFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadSemanticFileResponseBody setData(UploadSemanticFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadSemanticFileResponseBodyData getData() {
        return this.data;
    }

    public UploadSemanticFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadSemanticFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadSemanticFileResponseBodyData extends TeaModel {
        /**
         * <p>The expiration time of UploadUrl, expressed as a UNIX timestamp in milliseconds. After this time, call UploadSemanticFile again to request a new URL.</p>
         * 
         * <strong>example:</strong>
         * <p>1700001800000</p>
         */
        @NameInMap("ExpiresAt")
        public Long expiresAt;

        /**
         * <p>The unique identifier of the attachment. After the PUT upload to UploadUrl is complete, pass this value to the ReferenceFileIds parameter of CreateSemanticJob.</p>
         * 
         * <strong>example:</strong>
         * <p>FID1</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The temporary OSS PUT upload URL. The URL is valid for 30 minutes and can only be used to upload the specified object. Use the ContentType specified in the request when you perform the PUT request. Do not log or distribute the full URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/temporary-upload-url">https://example.com/temporary-upload-url</a></p>
         */
        @NameInMap("UploadUrl")
        public String uploadUrl;

        public static UploadSemanticFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadSemanticFileResponseBodyData self = new UploadSemanticFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadSemanticFileResponseBodyData setExpiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        public UploadSemanticFileResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public UploadSemanticFileResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
