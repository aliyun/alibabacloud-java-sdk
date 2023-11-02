// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeCloudSiemEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudSiemEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventsResponseBody self = new DescribeCloudSiemEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCloudSiemEventsResponseBody setData(DescribeCloudSiemEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudSiemEventsResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudSiemEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudSiemEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudSiemEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudSiemEventsResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCloudSiemEventsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventsResponseBodyDataPageInfo self = new DescribeCloudSiemEventsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCloudSiemEventsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudSiemEventsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeCloudSiemEventsResponseBodyDataResponseData extends TeaModel {
        @NameInMap("AlertNum")
        public Integer alertNum;

        @NameInMap("Aliuid")
        public Long aliuid;

        @NameInMap("AssetNum")
        public Integer assetNum;

        @NameInMap("AttCkLabels")
        public java.util.List<String> attCkLabels;

        @NameInMap("DataSources")
        public java.util.List<String> dataSources;

        @NameInMap("Description")
        public String description;

        @NameInMap("DescriptionEn")
        public String descriptionEn;

        @NameInMap("ExtContent")
        public String extContent;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IncidentName")
        public String incidentName;

        @NameInMap("IncidentNameEn")
        public String incidentNameEn;

        @NameInMap("IncidentUuid")
        public String incidentUuid;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("ThreatLevel")
        public String threatLevel;

        @NameInMap("ThreatScore")
        public Float threatScore;

        public static DescribeCloudSiemEventsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventsResponseBodyDataResponseData self = new DescribeCloudSiemEventsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAssetNum(Integer assetNum) {
            this.assetNum = assetNum;
            return this;
        }
        public Integer getAssetNum() {
            return this.assetNum;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAttCkLabels(java.util.List<String> attCkLabels) {
            this.attCkLabels = attCkLabels;
            return this;
        }
        public java.util.List<String> getAttCkLabels() {
            return this.attCkLabels;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setDataSources(java.util.List<String> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setExtContent(String extContent) {
            this.extContent = extContent;
            return this;
        }
        public String getExtContent() {
            return this.extContent;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setIncidentName(String incidentName) {
            this.incidentName = incidentName;
            return this;
        }
        public String getIncidentName() {
            return this.incidentName;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setIncidentNameEn(String incidentNameEn) {
            this.incidentNameEn = incidentNameEn;
            return this;
        }
        public String getIncidentNameEn() {
            return this.incidentNameEn;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setThreatScore(Float threatScore) {
            this.threatScore = threatScore;
            return this;
        }
        public Float getThreatScore() {
            return this.threatScore;
        }

    }

    public static class DescribeCloudSiemEventsResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public DescribeCloudSiemEventsResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseData> responseData;

        public static DescribeCloudSiemEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventsResponseBodyData self = new DescribeCloudSiemEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventsResponseBodyData setPageInfo(DescribeCloudSiemEventsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeCloudSiemEventsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeCloudSiemEventsResponseBodyData setResponseData(java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
