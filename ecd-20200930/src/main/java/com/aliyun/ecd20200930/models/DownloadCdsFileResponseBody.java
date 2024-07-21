// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DownloadCdsFileResponseBody extends TeaModel {
    @NameInMap("DownloadFileModel")
    public DownloadCdsFileResponseBodyDownloadFileModel downloadFileModel;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E3ED9519-DD73-5C86-9C0A-43C9281C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DownloadCdsFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadCdsFileResponseBody self = new DownloadCdsFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadCdsFileResponseBody setDownloadFileModel(DownloadCdsFileResponseBodyDownloadFileModel downloadFileModel) {
        this.downloadFileModel = downloadFileModel;
        return this;
    }
    public DownloadCdsFileResponseBodyDownloadFileModel getDownloadFileModel() {
        return this.downloadFileModel;
    }

    public DownloadCdsFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadCdsFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadCdsFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadCdsFileResponseBodyDownloadFileModel extends TeaModel {
        @NameInMap("DownloadType")
        public String downloadType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://pds-XXXX-bj-1693807057.oss-cn-beijing.aliyuncs.com/A0SKfLOp%2F2%2F6662612e0570fb2bdd5549759716d433439f0572%2F6662612ee3804e4901794928b14f9a7477640ee7?di=XXXX&dr=1030&f=667d5a322ebf7409e91c485d808fb3bd8a73efbb&response-content-disposition=attachment%3B%20">https://pds-XXXX-bj-1693807057.oss-cn-beijing.aliyuncs.com/A0SKfLOp%2F2%2F6662612e0570fb2bdd5549759716d433439f0572%2F6662612ee3804e4901794928b14f9a7477640ee7?di=XXXX&amp;dr=1030&amp;f=667d5a322ebf7409e91c485d808fb3bd8a73efbb&amp;response-content-disposition=attachment%3B%20</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExpirationSecond")
        public String expirationSecond;

        /**
         * <strong>example:</strong>
         * <p>2024-07-18T02:55:49.795Z</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <strong>example:</strong>
         * <p>667d5a322ebf7409e91c485d808fb3bd8a73efbb</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>1594642</p>
         */
        @NameInMap("Size")
        public Long size;

        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DownloadCdsFileResponseBodyDownloadFileModel build(java.util.Map<String, ?> map) throws Exception {
            DownloadCdsFileResponseBodyDownloadFileModel self = new DownloadCdsFileResponseBodyDownloadFileModel();
            return TeaModel.build(map, self);
        }

        public DownloadCdsFileResponseBodyDownloadFileModel setDownloadType(String downloadType) {
            this.downloadType = downloadType;
            return this;
        }
        public String getDownloadType() {
            return this.downloadType;
        }

        public DownloadCdsFileResponseBodyDownloadFileModel setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DownloadCdsFileResponseBodyDownloadFileModel setExpirationSecond(String expirationSecond) {
            this.expirationSecond = expirationSecond;
            return this;
        }
        public String getExpirationSecond() {
            return this.expirationSecond;
        }

        public DownloadCdsFileResponseBodyDownloadFileModel setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public DownloadCdsFileResponseBodyDownloadFileModel setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DownloadCdsFileResponseBodyDownloadFileModel setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DownloadCdsFileResponseBodyDownloadFileModel setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

}
