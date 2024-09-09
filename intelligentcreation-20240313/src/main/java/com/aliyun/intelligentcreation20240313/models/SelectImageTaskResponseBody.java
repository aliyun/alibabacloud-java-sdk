// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SelectImageTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Failed to proxy flink ui request, message: An error occurred: Invalid UUID string: jobsn</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("failed")
    public String failed;

    /**
     * <strong>example:</strong>
     * <p>PLATFORM</p>
     */
    @NameInMap("generationSource")
    public String generationSource;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("imageInfos")
    public java.util.List<SelectImageTaskResponseBodyImageInfos> imageInfos;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <strong>example:</strong>
     * <p>Successed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("subtaskProcessing")
    public String subtaskProcessing;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public String total;

    public static SelectImageTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectImageTaskResponseBody self = new SelectImageTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectImageTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SelectImageTaskResponseBody setFailed(String failed) {
        this.failed = failed;
        return this;
    }
    public String getFailed() {
        return this.failed;
    }

    public SelectImageTaskResponseBody setGenerationSource(String generationSource) {
        this.generationSource = generationSource;
        return this;
    }
    public String getGenerationSource() {
        return this.generationSource;
    }

    public SelectImageTaskResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SelectImageTaskResponseBody setImageInfos(java.util.List<SelectImageTaskResponseBodyImageInfos> imageInfos) {
        this.imageInfos = imageInfos;
        return this;
    }
    public java.util.List<SelectImageTaskResponseBodyImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    public SelectImageTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectImageTaskResponseBody setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SelectImageTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SelectImageTaskResponseBody setSubtaskProcessing(String subtaskProcessing) {
        this.subtaskProcessing = subtaskProcessing;
        return this;
    }
    public String getSubtaskProcessing() {
        return this.subtaskProcessing;
    }

    public SelectImageTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SelectImageTaskResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class SelectImageTaskResponseBodyImageInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.ali.com">www.ali.com</a></p>
         */
        @NameInMap("customImageUrl")
        public String customImageUrl;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("imageH")
        public String imageH;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("imageW")
        public String imageW;

        public static SelectImageTaskResponseBodyImageInfos build(java.util.Map<String, ?> map) throws Exception {
            SelectImageTaskResponseBodyImageInfos self = new SelectImageTaskResponseBodyImageInfos();
            return TeaModel.build(map, self);
        }

        public SelectImageTaskResponseBodyImageInfos setCustomImageUrl(String customImageUrl) {
            this.customImageUrl = customImageUrl;
            return this;
        }
        public String getCustomImageUrl() {
            return this.customImageUrl;
        }

        public SelectImageTaskResponseBodyImageInfos setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public SelectImageTaskResponseBodyImageInfos setImageH(String imageH) {
            this.imageH = imageH;
            return this;
        }
        public String getImageH() {
            return this.imageH;
        }

        public SelectImageTaskResponseBodyImageInfos setImageW(String imageW) {
            this.imageW = imageW;
            return this;
        }
        public String getImageW() {
            return this.imageW;
        }

    }

}
