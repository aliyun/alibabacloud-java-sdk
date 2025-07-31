// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckResultDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetOssCheckResultDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>62E97001-1255-50A9-8E1E-4FD05473D952</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOssCheckResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckResultDetailResponseBody self = new GetOssCheckResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssCheckResultDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetOssCheckResultDetailResponseBody setData(GetOssCheckResultDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOssCheckResultDetailResponseBodyData getData() {
        return this.data;
    }

    public GetOssCheckResultDetailResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetOssCheckResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssCheckResultDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOssCheckResultDetailResponseBodyDataLabelDetails extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static GetOssCheckResultDetailResponseBodyDataLabelDetails build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckResultDetailResponseBodyDataLabelDetails self = new GetOssCheckResultDetailResponseBodyDataLabelDetails();
            return TeaModel.build(map, self);
        }

        public GetOssCheckResultDetailResponseBodyDataLabelDetails setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GetOssCheckResultDetailResponseBodyDataLabelDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOssCheckResultDetailResponseBodyDataLabelDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetOssCheckResultDetailResponseBodyDataLabelDetails2 extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static GetOssCheckResultDetailResponseBodyDataLabelDetails2 build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckResultDetailResponseBodyDataLabelDetails2 self = new GetOssCheckResultDetailResponseBodyDataLabelDetails2();
            return TeaModel.build(map, self);
        }

        public GetOssCheckResultDetailResponseBodyDataLabelDetails2 setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GetOssCheckResultDetailResponseBodyDataLabelDetails2 setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOssCheckResultDetailResponseBodyDataLabelDetails2 setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetOssCheckResultDetailResponseBodyDataScanServiceInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>audio_media_detection</p>
         */
        @NameInMap("CopyFrom")
        public String copyFrom;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCopy")
        public Boolean isCopy;

        /**
         * <strong>example:</strong>
         * <p>audio_media_detection_01</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("ServiceName")
        public String serviceName;

        public static GetOssCheckResultDetailResponseBodyDataScanServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckResultDetailResponseBodyDataScanServiceInfos self = new GetOssCheckResultDetailResponseBodyDataScanServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetOssCheckResultDetailResponseBodyDataScanServiceInfos setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public GetOssCheckResultDetailResponseBodyDataScanServiceInfos setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public GetOssCheckResultDetailResponseBodyDataScanServiceInfos setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetOssCheckResultDetailResponseBodyDataScanServiceInfos setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetOssCheckResultDetailResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss-tmp</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>audio_media_detection</p>
         */
        @NameInMap("CopyFrom")
        public String copyFrom;

        /**
         * <strong>example:</strong>
         * <p>UNFREEZED</p>
         */
        @NameInMap("FreezeStatus")
        public String freezeStatus;

        /**
         * <strong>example:</strong>
         * <p>COPY</p>
         */
        @NameInMap("FreezeType")
        public String freezeType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyuncs.com/test.jpg">http://www.aliyuncs.com/test.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCopy")
        public Boolean isCopy;

        /**
         * <strong>example:</strong>
         * <p>dhT20X2310</p>
         */
        @NameInMap("JobName")
        public String jobName;

        @NameInMap("LabelDetails")
        public java.util.List<GetOssCheckResultDetailResponseBodyDataLabelDetails> labelDetails;

        @NameInMap("LabelDetails2")
        public java.util.List<GetOssCheckResultDetailResponseBodyDataLabelDetails2> labelDetails2;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Labels2")
        public java.util.List<String> labels2;

        @NameInMap("ManualFreezeAction")
        public String manualFreezeAction;

        @NameInMap("ManualOperateTime")
        public String manualOperateTime;

        @NameInMap("ManualOperator")
        public String manualOperator;

        /**
         * <strong>example:</strong>
         * <p>f6e2e1946f06310c8a0cc443a05819f3</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>1748396909030.jpg</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("RiskLevel0")
        public String riskLevel0;

        /**
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("RiskLevel2")
        public String riskLevel2;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScanResult")
        public String scanResult;

        @NameInMap("ScanServiceInfos")
        public java.util.List<GetOssCheckResultDetailResponseBodyDataScanServiceInfos> scanServiceInfos;

        /**
         * <strong>example:</strong>
         * <p>audio_media_detection_01</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>P_Z7OLMN</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyuncs.com/test.mp3">http://www.aliyuncs.com/test.mp3</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetOssCheckResultDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOssCheckResultDetailResponseBodyData self = new GetOssCheckResultDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOssCheckResultDetailResponseBodyData setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetOssCheckResultDetailResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetOssCheckResultDetailResponseBodyData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetOssCheckResultDetailResponseBodyData setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public GetOssCheckResultDetailResponseBodyData setFreezeStatus(String freezeStatus) {
            this.freezeStatus = freezeStatus;
            return this;
        }
        public String getFreezeStatus() {
            return this.freezeStatus;
        }

        public GetOssCheckResultDetailResponseBodyData setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

        public GetOssCheckResultDetailResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetOssCheckResultDetailResponseBodyData setIsCopy(Boolean isCopy) {
            this.isCopy = isCopy;
            return this;
        }
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        public GetOssCheckResultDetailResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetOssCheckResultDetailResponseBodyData setLabelDetails(java.util.List<GetOssCheckResultDetailResponseBodyDataLabelDetails> labelDetails) {
            this.labelDetails = labelDetails;
            return this;
        }
        public java.util.List<GetOssCheckResultDetailResponseBodyDataLabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        public GetOssCheckResultDetailResponseBodyData setLabelDetails2(java.util.List<GetOssCheckResultDetailResponseBodyDataLabelDetails2> labelDetails2) {
            this.labelDetails2 = labelDetails2;
            return this;
        }
        public java.util.List<GetOssCheckResultDetailResponseBodyDataLabelDetails2> getLabelDetails2() {
            return this.labelDetails2;
        }

        public GetOssCheckResultDetailResponseBodyData setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetOssCheckResultDetailResponseBodyData setLabels2(java.util.List<String> labels2) {
            this.labels2 = labels2;
            return this;
        }
        public java.util.List<String> getLabels2() {
            return this.labels2;
        }

        public GetOssCheckResultDetailResponseBodyData setManualFreezeAction(String manualFreezeAction) {
            this.manualFreezeAction = manualFreezeAction;
            return this;
        }
        public String getManualFreezeAction() {
            return this.manualFreezeAction;
        }

        public GetOssCheckResultDetailResponseBodyData setManualOperateTime(String manualOperateTime) {
            this.manualOperateTime = manualOperateTime;
            return this;
        }
        public String getManualOperateTime() {
            return this.manualOperateTime;
        }

        public GetOssCheckResultDetailResponseBodyData setManualOperator(String manualOperator) {
            this.manualOperator = manualOperator;
            return this;
        }
        public String getManualOperator() {
            return this.manualOperator;
        }

        public GetOssCheckResultDetailResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetOssCheckResultDetailResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetOssCheckResultDetailResponseBodyData setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public GetOssCheckResultDetailResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetOssCheckResultDetailResponseBodyData setRiskLevel0(String riskLevel0) {
            this.riskLevel0 = riskLevel0;
            return this;
        }
        public String getRiskLevel0() {
            return this.riskLevel0;
        }

        public GetOssCheckResultDetailResponseBodyData setRiskLevel2(String riskLevel2) {
            this.riskLevel2 = riskLevel2;
            return this;
        }
        public String getRiskLevel2() {
            return this.riskLevel2;
        }

        public GetOssCheckResultDetailResponseBodyData setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public GetOssCheckResultDetailResponseBodyData setScanServiceInfos(java.util.List<GetOssCheckResultDetailResponseBodyDataScanServiceInfos> scanServiceInfos) {
            this.scanServiceInfos = scanServiceInfos;
            return this;
        }
        public java.util.List<GetOssCheckResultDetailResponseBodyDataScanServiceInfos> getScanServiceInfos() {
            return this.scanServiceInfos;
        }

        public GetOssCheckResultDetailResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetOssCheckResultDetailResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetOssCheckResultDetailResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetOssCheckResultDetailResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
