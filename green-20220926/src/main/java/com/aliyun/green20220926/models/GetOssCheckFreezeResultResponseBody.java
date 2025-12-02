// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckFreezeResultResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Data of the current page.</p>
     */
    @NameInMap("Items")
    public java.util.List<GetOssCheckFreezeResultResponseBodyItems> items;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Backend-assigned ID, used to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F0A594BB-FA7A-580F-AE9E-A4188E092823</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetOssCheckFreezeResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckFreezeResultResponseBody self = new GetOssCheckFreezeResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssCheckFreezeResultResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOssCheckFreezeResultResponseBody setItems(java.util.List<GetOssCheckFreezeResultResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetOssCheckFreezeResultResponseBodyItems> getItems() {
        return this.items;
    }

    public GetOssCheckFreezeResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOssCheckFreezeResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssCheckFreezeResultResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetOssCheckFreezeResultResponseBodyItemsLabelDetails extends TeaModel {
        /**
         * <p>Confidence.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>Label description.</p>
         * 
         * <strong>example:</strong>
         * <p>涉政</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Label.</p>
         * 
         * <strong>example:</strong>
         * <p>politics</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetOssCheckFreezeResultResponseBodyItemsLabelDetails build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckFreezeResultResponseBodyItemsLabelDetails self = new GetOssCheckFreezeResultResponseBodyItemsLabelDetails();
            return TeaModel.build(map, self);
        }

        public GetOssCheckFreezeResultResponseBodyItemsLabelDetails setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GetOssCheckFreezeResultResponseBodyItemsLabelDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOssCheckFreezeResultResponseBodyItemsLabelDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetOssCheckFreezeResultResponseBodyItems extends TeaModel {
        /**
         * <p>Storage space.</p>
         * 
         * <strong>example:</strong>
         * <p>tmp</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>Error code, consistent with HTTP status.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Audio and video detection type.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>Primary service.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_media_detection</p>
         */
        @NameInMap("CopyFrom")
        public String copyFrom;

        /**
         * <p>Feedback.</p>
         * 
         * <strong>example:</strong>
         * <p>misreport</p>
         */
        @NameInMap("Feedback")
        public String feedback;

        /**
         * <p>Whether frozen.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Freeze")
        public Boolean freeze;

        /**
         * <p>Freeze status.</p>
         * 
         * <strong>example:</strong>
         * <p>FREEZED</p>
         */
        @NameInMap("FreezeStatus")
        public String freezeStatus;

        /**
         * <p>Freeze type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("FreezeType")
        public String freezeType;

        /**
         * <p>Image URL address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyuncs.com/test.jpg">http://www.aliyuncs.com/test.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>Whether to copy.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCopy")
        public Boolean isCopy;

        /**
         * <p>Job name.</p>
         * 
         * <strong>example:</strong>
         * <p>dhT20X2310</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>Labels.</p>
         */
        @NameInMap("LabelDetails")
        public java.util.List<GetOssCheckFreezeResultResponseBodyItemsLabelDetails> labelDetails;

        /**
         * <p>Image labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>Text labels.</p>
         */
        @NameInMap("Labels2")
        public java.util.List<String> labels2;

        /**
         * <p>Manual disposal status.</p>
         * 
         * <strong>example:</strong>
         * <p>FREEZE</p>
         */
        @NameInMap("ManualFreezeAction")
        public String manualFreezeAction;

        /**
         * <p>Disposal time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-09 12:00:00</p>
         */
        @NameInMap("ManualOperateTime")
        public String manualOperateTime;

        /**
         * <p>Operator.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ManualOperator")
        public String manualOperator;

        /**
         * <p>File\&quot;s MD5.</p>
         * 
         * <strong>example:</strong>
         * <p>54416c9b159df4a60ae03c04ccb94cb5</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>Further description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Object name.</p>
         * 
         * <strong>example:</strong>
         * <p>1713014531569_958.png.jpeg</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0A594BB-FA7A-580F-AE9E-A4188E092823</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>Image risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>Overall risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel0")
        public String riskLevel0;

        /**
         * <p>Text risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("RiskLevel2")
        public String riskLevel2;

        /**
         * <p>Details of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScanResult")
        public String scanResult;

        /**
         * <p>Service code.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_media_detection_01</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>服务名称</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>System disposal status.</p>
         * 
         * <strong>example:</strong>
         * <p>FREEZED</p>
         */
        @NameInMap("SysDisposalStatus")
        public String sysDisposalStatus;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>P_BT3FHS</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Task URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyuncs.com/test.mp3">http://www.aliyuncs.com/test.mp3</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetOssCheckFreezeResultResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckFreezeResultResponseBodyItems self = new GetOssCheckFreezeResultResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetOssCheckFreezeResultResponseBodyItems setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetOssCheckFreezeResultResponseBodyItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOssCheckFreezeResultResponseBodyItems setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetOssCheckFreezeResultResponseBodyItems setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public GetOssCheckFreezeResultResponseBodyItems setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public GetOssCheckFreezeResultResponseBodyItems setFreeze(Boolean freeze) {
            this.freeze = freeze;
            return this;
        }
        public Boolean getFreeze() {
            return this.freeze;
        }

        public GetOssCheckFreezeResultResponseBodyItems setFreezeStatus(String freezeStatus) {
            this.freezeStatus = freezeStatus;
            return this;
        }
        public String getFreezeStatus() {
            return this.freezeStatus;
        }

        public GetOssCheckFreezeResultResponseBodyItems setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

        public GetOssCheckFreezeResultResponseBodyItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetOssCheckFreezeResultResponseBodyItems setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public GetOssCheckFreezeResultResponseBodyItems setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetOssCheckFreezeResultResponseBodyItems setLabelDetails(java.util.List<GetOssCheckFreezeResultResponseBodyItemsLabelDetails> labelDetails) {
            this.labelDetails = labelDetails;
            return this;
        }
        public java.util.List<GetOssCheckFreezeResultResponseBodyItemsLabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        public GetOssCheckFreezeResultResponseBodyItems setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetOssCheckFreezeResultResponseBodyItems setLabels2(java.util.List<String> labels2) {
            this.labels2 = labels2;
            return this;
        }
        public java.util.List<String> getLabels2() {
            return this.labels2;
        }

        public GetOssCheckFreezeResultResponseBodyItems setManualFreezeAction(String manualFreezeAction) {
            this.manualFreezeAction = manualFreezeAction;
            return this;
        }
        public String getManualFreezeAction() {
            return this.manualFreezeAction;
        }

        public GetOssCheckFreezeResultResponseBodyItems setManualOperateTime(String manualOperateTime) {
            this.manualOperateTime = manualOperateTime;
            return this;
        }
        public String getManualOperateTime() {
            return this.manualOperateTime;
        }

        public GetOssCheckFreezeResultResponseBodyItems setManualOperator(String manualOperator) {
            this.manualOperator = manualOperator;
            return this;
        }
        public String getManualOperator() {
            return this.manualOperator;
        }

        public GetOssCheckFreezeResultResponseBodyItems setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetOssCheckFreezeResultResponseBodyItems setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetOssCheckFreezeResultResponseBodyItems setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public GetOssCheckFreezeResultResponseBodyItems setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetOssCheckFreezeResultResponseBodyItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetOssCheckFreezeResultResponseBodyItems setRiskLevel0(String riskLevel0) {
            this.riskLevel0 = riskLevel0;
            return this;
        }
        public String getRiskLevel0() {
            return this.riskLevel0;
        }

        public GetOssCheckFreezeResultResponseBodyItems setRiskLevel2(String riskLevel2) {
            this.riskLevel2 = riskLevel2;
            return this;
        }
        public String getRiskLevel2() {
            return this.riskLevel2;
        }

        public GetOssCheckFreezeResultResponseBodyItems setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public GetOssCheckFreezeResultResponseBodyItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetOssCheckFreezeResultResponseBodyItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetOssCheckFreezeResultResponseBodyItems setSysDisposalStatus(String sysDisposalStatus) {
            this.sysDisposalStatus = sysDisposalStatus;
            return this;
        }
        public String getSysDisposalStatus() {
            return this.sysDisposalStatus;
        }

        public GetOssCheckFreezeResultResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetOssCheckFreezeResultResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
