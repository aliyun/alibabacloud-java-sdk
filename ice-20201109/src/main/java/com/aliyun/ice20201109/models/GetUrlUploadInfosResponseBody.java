// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetUrlUploadInfosResponseBody extends TeaModel {
    @NameInMap("NonExists")
    public java.util.List<String> nonExists;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("URLUploadInfoList")
    public java.util.List<GetUrlUploadInfosResponseBodyURLUploadInfoList> URLUploadInfoList;

    public static GetUrlUploadInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUrlUploadInfosResponseBody self = new GetUrlUploadInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUrlUploadInfosResponseBody setNonExists(java.util.List<String> nonExists) {
        this.nonExists = nonExists;
        return this;
    }
    public java.util.List<String> getNonExists() {
        return this.nonExists;
    }

    public GetUrlUploadInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUrlUploadInfosResponseBody setURLUploadInfoList(java.util.List<GetUrlUploadInfosResponseBodyURLUploadInfoList> URLUploadInfoList) {
        this.URLUploadInfoList = URLUploadInfoList;
        return this;
    }
    public java.util.List<GetUrlUploadInfosResponseBodyURLUploadInfoList> getURLUploadInfoList() {
        return this.URLUploadInfoList;
    }

    public static class GetUrlUploadInfosResponseBodyURLUploadInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-11-26 21:47:37</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <strong>example:</strong>
         * <p>2021-11-07T10:03:37Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>64610</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <strong>example:</strong>
         * <p>3829500c0fef429fa4ec1680b122d***</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>5014ca70f08171ecbf940764a0fd6***</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>http://****.mp4</p>
         */
        @NameInMap("UploadURL")
        public String uploadURL;

        /**
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:&quot;{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D">http://example.aliyundoc.com&quot;}</a>&quot;, &quot;Extend&quot;:&quot;{&quot;localId&quot;:&quot;***&quot;, &quot;test&quot;:&quot;www&quot;}&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetUrlUploadInfosResponseBodyURLUploadInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetUrlUploadInfosResponseBodyURLUploadInfoList self = new GetUrlUploadInfosResponseBodyURLUploadInfoList();
            return TeaModel.build(map, self);
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setUploadURL(String uploadURL) {
            this.uploadURL = uploadURL;
            return this;
        }
        public String getUploadURL() {
            return this.uploadURL;
        }

        public GetUrlUploadInfosResponseBodyURLUploadInfoList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
