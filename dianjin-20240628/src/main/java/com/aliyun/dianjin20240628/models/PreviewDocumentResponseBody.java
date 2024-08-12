// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class PreviewDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public PreviewDocumentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ff551395-1c8a-4f30-8ffd-ef7e87c70b4c</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static PreviewDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewDocumentResponseBody self = new PreviewDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewDocumentResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public PreviewDocumentResponseBody setData(PreviewDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PreviewDocumentResponseBodyData getData() {
        return this.data;
    }

    public PreviewDocumentResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PreviewDocumentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public PreviewDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreviewDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PreviewDocumentResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class PreviewDocumentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("previewType")
        public String previewType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("uploadTime")
        public String uploadTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://agi.alicdn.com/user/d0o/d3c1f50d-a6c2-49b3-b0c8-3e613c3f20ee_16872_3236784461.png">https://agi.alicdn.com/user/d0o/d3c1f50d-a6c2-49b3-b0c8-3e613c3f20ee_16872_3236784461.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static PreviewDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PreviewDocumentResponseBodyData self = new PreviewDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PreviewDocumentResponseBodyData setPreviewType(String previewType) {
            this.previewType = previewType;
            return this;
        }
        public String getPreviewType() {
            return this.previewType;
        }

        public PreviewDocumentResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PreviewDocumentResponseBodyData setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public PreviewDocumentResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
