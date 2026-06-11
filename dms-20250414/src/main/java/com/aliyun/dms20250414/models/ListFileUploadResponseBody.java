// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListFileUploadResponseBody extends TeaModel {
    /**
     * <p>The list of file objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFileUploadResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFileUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileUploadResponseBody self = new ListFileUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileUploadResponseBody setData(java.util.List<ListFileUploadResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFileUploadResponseBodyData> getData() {
        return this.data;
    }

    public ListFileUploadResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListFileUploadResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListFileUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileUploadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFileUploadResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud master account.</p>
         * 
         * <strong>example:</strong>
         * <p>16738266********</p>
         */
        @NameInMap("AliyunParentUid")
        public String aliyunParentUid;

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20372822********</p>
         */
        @NameInMap("AliyunUid")
        public String aliyunUid;

        /**
         * <p>The public download link.</p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <p>The file category.</p>
         * 
         * <strong>example:</strong>
         * <p>TextReport</p>
         */
        @NameInMap("FileCategory")
        public String fileCategory;

        /**
         * <p>The file source.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent</p>
         */
        @NameInMap("FileFrom")
        public String fileFrom;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>samele_report.md</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>7453</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The file extension.</p>
         * 
         * <strong>example:</strong>
         * <p>md</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The time when the file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The internal download link.</p>
         */
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>h8r********4fch</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The upload path.</p>
         */
        @NameInMap("UploadLocation")
        public String uploadLocation;

        public static ListFileUploadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFileUploadResponseBodyData self = new ListFileUploadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFileUploadResponseBodyData setAliyunParentUid(String aliyunParentUid) {
            this.aliyunParentUid = aliyunParentUid;
            return this;
        }
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        public ListFileUploadResponseBodyData setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListFileUploadResponseBodyData setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public ListFileUploadResponseBodyData setFileCategory(String fileCategory) {
            this.fileCategory = fileCategory;
            return this;
        }
        public String getFileCategory() {
            return this.fileCategory;
        }

        public ListFileUploadResponseBodyData setFileFrom(String fileFrom) {
            this.fileFrom = fileFrom;
            return this;
        }
        public String getFileFrom() {
            return this.fileFrom;
        }

        public ListFileUploadResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListFileUploadResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListFileUploadResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListFileUploadResponseBodyData setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListFileUploadResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListFileUploadResponseBodyData setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public ListFileUploadResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListFileUploadResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListFileUploadResponseBodyData setUploadLocation(String uploadLocation) {
            this.uploadLocation = uploadLocation;
            return this;
        }
        public String getUploadLocation() {
            return this.uploadLocation;
        }

    }

}
