// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListTransferFileDownloadUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F1F01499-8F3D-5657-91AD-48177EB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Urls")
    public java.util.List<ListTransferFileDownloadUrlResponseBodyUrls> urls;

    public static ListTransferFileDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransferFileDownloadUrlResponseBody self = new ListTransferFileDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransferFileDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransferFileDownloadUrlResponseBody setUrls(java.util.List<ListTransferFileDownloadUrlResponseBodyUrls> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<ListTransferFileDownloadUrlResponseBodyUrls> getUrls() {
        return this.urls;
    }

    public static class ListTransferFileDownloadUrlResponseBodyUrls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>trf-i4pz8emx2k2fr****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>document.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>DELETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxsy-transfer.oss-cn-beijing.aliyuncs.com/xxxx">http://xxsy-transfer.oss-cn-beijing.aliyuncs.com/xxxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListTransferFileDownloadUrlResponseBodyUrls build(java.util.Map<String, ?> map) throws Exception {
            ListTransferFileDownloadUrlResponseBodyUrls self = new ListTransferFileDownloadUrlResponseBodyUrls();
            return TeaModel.build(map, self);
        }

        public ListTransferFileDownloadUrlResponseBodyUrls setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListTransferFileDownloadUrlResponseBodyUrls setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListTransferFileDownloadUrlResponseBodyUrls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransferFileDownloadUrlResponseBodyUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
