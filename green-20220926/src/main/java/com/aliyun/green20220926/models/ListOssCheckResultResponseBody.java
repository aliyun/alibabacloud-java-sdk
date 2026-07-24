// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListOssCheckResultResponseBody extends TeaModel {
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
    public java.util.List<ListOssCheckResultResponseBodyItems> items;

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
     * <p>13</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOssCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOssCheckResultResponseBody self = new ListOssCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOssCheckResultResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOssCheckResultResponseBody setItems(java.util.List<ListOssCheckResultResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListOssCheckResultResponseBodyItems> getItems() {
        return this.items;
    }

    public ListOssCheckResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOssCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOssCheckResultResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOssCheckResultResponseBodyItemsLabelDetails extends TeaModel {
        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>影音娱乐类</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label hit by the video frame.</p>
         * 
         * <strong>example:</strong>
         * <p>logo_streaming</p>
         */
        @NameInMap("Label")
        public String label;

        public static ListOssCheckResultResponseBodyItemsLabelDetails build(java.util.Map<String, ?> map) throws Exception {
            ListOssCheckResultResponseBodyItemsLabelDetails self = new ListOssCheckResultResponseBodyItemsLabelDetails();
            return TeaModel.build(map, self);
        }

        public ListOssCheckResultResponseBodyItemsLabelDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOssCheckResultResponseBodyItemsLabelDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ListOssCheckResultResponseBodyItemsLabelDetails2 extends TeaModel {
        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>辱骂内容</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label hit by the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>abuse</p>
         */
        @NameInMap("Label")
        public String label;

        public static ListOssCheckResultResponseBodyItemsLabelDetails2 build(java.util.Map<String, ?> map) throws Exception {
            ListOssCheckResultResponseBodyItemsLabelDetails2 self = new ListOssCheckResultResponseBodyItemsLabelDetails2();
            return TeaModel.build(map, self);
        }

        public ListOssCheckResultResponseBodyItemsLabelDetails2 setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOssCheckResultResponseBodyItemsLabelDetails2 setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ListOssCheckResultResponseBodyItems extends TeaModel {
        /**
         * <p>The OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>tmp</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The error code, which is consistent with the HTTP status code.</p>
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
         * <p>The freeze status.</p>
         * 
         * <strong>example:</strong>
         * <p>FREEZED</p>
         */
        @NameInMap("FreezeStatus")
        public String freezeStatus;

        /**
         * <p>The freeze type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("FreezeType")
        public String freezeType;

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
         * <p>The list of labels hit by video frames.</p>
         */
        @NameInMap("LabelDetails")
        public java.util.List<ListOssCheckResultResponseBodyItemsLabelDetails> labelDetails;

        /**
         * <p>The list of labels hit by video audio.</p>
         */
        @NameInMap("LabelDetails2")
        public java.util.List<ListOssCheckResultResponseBodyItemsLabelDetails2> labelDetails2;

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
         * <p>OK</p>
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
         * <p>The image risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The overall risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel0")
        public String riskLevel0;

        /**
         * <p>The text risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("RiskLevel2")
        public String riskLevel2;

        /**
         * <p>The scan result details.</p>
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
         * <p>EP6TI7_au_Zo25ITvCbkocNuF801QOQX</p>
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

        public static ListOssCheckResultResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListOssCheckResultResponseBodyItems self = new ListOssCheckResultResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListOssCheckResultResponseBodyItems setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListOssCheckResultResponseBodyItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListOssCheckResultResponseBodyItems setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListOssCheckResultResponseBodyItems setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public ListOssCheckResultResponseBodyItems setFreezeStatus(String freezeStatus) {
            this.freezeStatus = freezeStatus;
            return this;
        }
        public String getFreezeStatus() {
            return this.freezeStatus;
        }

        public ListOssCheckResultResponseBodyItems setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

        public ListOssCheckResultResponseBodyItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListOssCheckResultResponseBodyItems setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public ListOssCheckResultResponseBodyItems setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListOssCheckResultResponseBodyItems setLabelDetails(java.util.List<ListOssCheckResultResponseBodyItemsLabelDetails> labelDetails) {
            this.labelDetails = labelDetails;
            return this;
        }
        public java.util.List<ListOssCheckResultResponseBodyItemsLabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        public ListOssCheckResultResponseBodyItems setLabelDetails2(java.util.List<ListOssCheckResultResponseBodyItemsLabelDetails2> labelDetails2) {
            this.labelDetails2 = labelDetails2;
            return this;
        }
        public java.util.List<ListOssCheckResultResponseBodyItemsLabelDetails2> getLabelDetails2() {
            return this.labelDetails2;
        }

        public ListOssCheckResultResponseBodyItems setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public ListOssCheckResultResponseBodyItems setLabels2(java.util.List<String> labels2) {
            this.labels2 = labels2;
            return this;
        }
        public java.util.List<String> getLabels2() {
            return this.labels2;
        }

        public ListOssCheckResultResponseBodyItems setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListOssCheckResultResponseBodyItems setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListOssCheckResultResponseBodyItems setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public ListOssCheckResultResponseBodyItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListOssCheckResultResponseBodyItems setRiskLevel0(String riskLevel0) {
            this.riskLevel0 = riskLevel0;
            return this;
        }
        public String getRiskLevel0() {
            return this.riskLevel0;
        }

        public ListOssCheckResultResponseBodyItems setRiskLevel2(String riskLevel2) {
            this.riskLevel2 = riskLevel2;
            return this;
        }
        public String getRiskLevel2() {
            return this.riskLevel2;
        }

        public ListOssCheckResultResponseBodyItems setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public ListOssCheckResultResponseBodyItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public ListOssCheckResultResponseBodyItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListOssCheckResultResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOssCheckResultResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
