// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DescribeOssV2ResultResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeOssV2ResultResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeOssV2ResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssV2ResultResponseBody self = new DescribeOssV2ResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssV2ResultResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOssV2ResultResponseBody setItems(java.util.List<DescribeOssV2ResultResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeOssV2ResultResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeOssV2ResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOssV2ResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssV2ResultResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOssV2ResultResponseBodyItemsLabelDetails extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static DescribeOssV2ResultResponseBodyItemsLabelDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssV2ResultResponseBodyItemsLabelDetails self = new DescribeOssV2ResultResponseBodyItemsLabelDetails();
            return TeaModel.build(map, self);
        }

        public DescribeOssV2ResultResponseBodyItemsLabelDetails setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DescribeOssV2ResultResponseBodyItemsLabelDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOssV2ResultResponseBodyItemsLabelDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeOssV2ResultResponseBodyItemsLabelDetails2 extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        public static DescribeOssV2ResultResponseBodyItemsLabelDetails2 build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssV2ResultResponseBodyItemsLabelDetails2 self = new DescribeOssV2ResultResponseBodyItemsLabelDetails2();
            return TeaModel.build(map, self);
        }

        public DescribeOssV2ResultResponseBodyItemsLabelDetails2 setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DescribeOssV2ResultResponseBodyItemsLabelDetails2 setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOssV2ResultResponseBodyItemsLabelDetails2 setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeOssV2ResultResponseBodyItems extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Code")
        public String code;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Freeze")
        public Boolean freeze;

        @NameInMap("FreezeStatus")
        public String freezeStatus;

        @NameInMap("FreezeType")
        public String freezeType;

        @NameInMap("LabelDetails")
        public java.util.List<DescribeOssV2ResultResponseBodyItemsLabelDetails> labelDetails;

        @NameInMap("LabelDetails2")
        public java.util.List<DescribeOssV2ResultResponseBodyItemsLabelDetails2> labelDetails2;

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

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Object")
        public String object;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RiskLevel0")
        public String riskLevel0;

        @NameInMap("RiskLevel2")
        public String riskLevel2;

        @NameInMap("ScanResult")
        public String scanResult;

        @NameInMap("ServiceCode")
        public String serviceCode;

        @NameInMap("SysDisposalStatus")
        public String sysDisposalStatus;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Url")
        public String url;

        public static DescribeOssV2ResultResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssV2ResultResponseBodyItems self = new DescribeOssV2ResultResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeOssV2ResultResponseBodyItems setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssV2ResultResponseBodyItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOssV2ResultResponseBodyItems setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeOssV2ResultResponseBodyItems setFreeze(Boolean freeze) {
            this.freeze = freeze;
            return this;
        }
        public Boolean getFreeze() {
            return this.freeze;
        }

        public DescribeOssV2ResultResponseBodyItems setFreezeStatus(String freezeStatus) {
            this.freezeStatus = freezeStatus;
            return this;
        }
        public String getFreezeStatus() {
            return this.freezeStatus;
        }

        public DescribeOssV2ResultResponseBodyItems setFreezeType(String freezeType) {
            this.freezeType = freezeType;
            return this;
        }
        public String getFreezeType() {
            return this.freezeType;
        }

        public DescribeOssV2ResultResponseBodyItems setLabelDetails(java.util.List<DescribeOssV2ResultResponseBodyItemsLabelDetails> labelDetails) {
            this.labelDetails = labelDetails;
            return this;
        }
        public java.util.List<DescribeOssV2ResultResponseBodyItemsLabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        public DescribeOssV2ResultResponseBodyItems setLabelDetails2(java.util.List<DescribeOssV2ResultResponseBodyItemsLabelDetails2> labelDetails2) {
            this.labelDetails2 = labelDetails2;
            return this;
        }
        public java.util.List<DescribeOssV2ResultResponseBodyItemsLabelDetails2> getLabelDetails2() {
            return this.labelDetails2;
        }

        public DescribeOssV2ResultResponseBodyItems setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public DescribeOssV2ResultResponseBodyItems setLabels2(java.util.List<String> labels2) {
            this.labels2 = labels2;
            return this;
        }
        public java.util.List<String> getLabels2() {
            return this.labels2;
        }

        public DescribeOssV2ResultResponseBodyItems setManualFreezeAction(String manualFreezeAction) {
            this.manualFreezeAction = manualFreezeAction;
            return this;
        }
        public String getManualFreezeAction() {
            return this.manualFreezeAction;
        }

        public DescribeOssV2ResultResponseBodyItems setManualOperateTime(String manualOperateTime) {
            this.manualOperateTime = manualOperateTime;
            return this;
        }
        public String getManualOperateTime() {
            return this.manualOperateTime;
        }

        public DescribeOssV2ResultResponseBodyItems setManualOperator(String manualOperator) {
            this.manualOperator = manualOperator;
            return this;
        }
        public String getManualOperator() {
            return this.manualOperator;
        }

        public DescribeOssV2ResultResponseBodyItems setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeOssV2ResultResponseBodyItems setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public DescribeOssV2ResultResponseBodyItems setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeOssV2ResultResponseBodyItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeOssV2ResultResponseBodyItems setRiskLevel0(String riskLevel0) {
            this.riskLevel0 = riskLevel0;
            return this;
        }
        public String getRiskLevel0() {
            return this.riskLevel0;
        }

        public DescribeOssV2ResultResponseBodyItems setRiskLevel2(String riskLevel2) {
            this.riskLevel2 = riskLevel2;
            return this;
        }
        public String getRiskLevel2() {
            return this.riskLevel2;
        }

        public DescribeOssV2ResultResponseBodyItems setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public DescribeOssV2ResultResponseBodyItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public DescribeOssV2ResultResponseBodyItems setSysDisposalStatus(String sysDisposalStatus) {
            this.sysDisposalStatus = sysDisposalStatus;
            return this;
        }
        public String getSysDisposalStatus() {
            return this.sysDisposalStatus;
        }

        public DescribeOssV2ResultResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeOssV2ResultResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
