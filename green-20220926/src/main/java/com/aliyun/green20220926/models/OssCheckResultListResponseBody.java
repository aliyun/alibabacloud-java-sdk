// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class OssCheckResultListResponseBody extends TeaModel {
    /**
     * <p>The authorization status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("AuthStatus")
    public String authStatus;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data on the current page.</p>
     */
    @NameInMap("Items")
    public java.util.List<OssCheckResultListResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static OssCheckResultListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OssCheckResultListResponseBody self = new OssCheckResultListResponseBody();
        return TeaModel.build(map, self);
    }

    public OssCheckResultListResponseBody setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public OssCheckResultListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public OssCheckResultListResponseBody setItems(java.util.List<OssCheckResultListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OssCheckResultListResponseBodyItems> getItems() {
        return this.items;
    }

    public OssCheckResultListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OssCheckResultListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OssCheckResultListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class OssCheckResultListResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>tmp</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The audio and video detection type.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The primary service.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_media_detection</p>
         */
        @NameInMap("CopyFrom")
        public String copyFrom;

        /**
         * <p>The URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyuncs.com/test.jpg">http://www.aliyuncs.com/test.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>Indicates whether the task is copied.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCopy")
        public Boolean isCopy;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>dhT20X2310</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The image labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The text labels.</p>
         */
        @NameInMap("Labels2")
        public java.util.List<String> labels2;

        /**
         * <p>The MD5 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>54416c9b159df4a60ae03c04ccb94cb5</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>1713014531569_958.png.jpeg</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The result details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScanResult")
        public String scanResult;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_media_detection_01</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>服务名称</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>P_XHDUS</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyuncs.com/test.mp3">http://www.aliyuncs.com/test.mp3</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static OssCheckResultListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            OssCheckResultListResponseBodyItems self = new OssCheckResultListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public OssCheckResultListResponseBodyItems setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public OssCheckResultListResponseBodyItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public OssCheckResultListResponseBodyItems setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public OssCheckResultListResponseBodyItems setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public OssCheckResultListResponseBodyItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public OssCheckResultListResponseBodyItems setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public OssCheckResultListResponseBodyItems setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public OssCheckResultListResponseBodyItems setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public OssCheckResultListResponseBodyItems setLabels2(java.util.List<String> labels2) {
            this.labels2 = labels2;
            return this;
        }
        public java.util.List<String> getLabels2() {
            return this.labels2;
        }

        public OssCheckResultListResponseBodyItems setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public OssCheckResultListResponseBodyItems setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public OssCheckResultListResponseBodyItems setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public OssCheckResultListResponseBodyItems setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public OssCheckResultListResponseBodyItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public OssCheckResultListResponseBodyItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public OssCheckResultListResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public OssCheckResultListResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
