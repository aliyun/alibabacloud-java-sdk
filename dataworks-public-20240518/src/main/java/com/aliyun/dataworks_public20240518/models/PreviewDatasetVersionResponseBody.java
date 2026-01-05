// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PreviewDatasetVersionResponseBody extends TeaModel {
    /**
     * <p>Preview results</p>
     */
    @NameInMap("PreviewResult")
    public PreviewDatasetVersionResponseBodyPreviewResult previewResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A6C6B486-E3A2-5D52-9E76-D9380485DXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PreviewDatasetVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewDatasetVersionResponseBody self = new PreviewDatasetVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewDatasetVersionResponseBody setPreviewResult(PreviewDatasetVersionResponseBodyPreviewResult previewResult) {
        this.previewResult = previewResult;
        return this;
    }
    public PreviewDatasetVersionResponseBodyPreviewResult getPreviewResult() {
        return this.previewResult;
    }

    public PreviewDatasetVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewDatasetVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PreviewDatasetVersionResponseBodyPreviewResult extends TeaModel {
        /**
         * <p>Content</p>
         * 
         * <strong>example:</strong>
         * <p>this is content</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>File name</p>
         * 
         * <strong>example:</strong>
         * <p>parth/data.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The MIME type</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("MimeType")
        public String mimeType;

        /**
         * <p>Preview availability</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportPreview")
        public Boolean supportPreview;

        public static PreviewDatasetVersionResponseBodyPreviewResult build(java.util.Map<String, ?> map) throws Exception {
            PreviewDatasetVersionResponseBodyPreviewResult self = new PreviewDatasetVersionResponseBodyPreviewResult();
            return TeaModel.build(map, self);
        }

        public PreviewDatasetVersionResponseBodyPreviewResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PreviewDatasetVersionResponseBodyPreviewResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public PreviewDatasetVersionResponseBodyPreviewResult setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public PreviewDatasetVersionResponseBodyPreviewResult setSupportPreview(Boolean supportPreview) {
            this.supportPreview = supportPreview;
            return this;
        }
        public Boolean getSupportPreview() {
            return this.supportPreview;
        }

    }

}
