// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeCloudSiemEventDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudSiemEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventDetailResponseBody self = new DescribeCloudSiemEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCloudSiemEventDetailResponseBody setData(DescribeCloudSiemEventDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudSiemEventDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudSiemEventDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudSiemEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudSiemEventDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudSiemEventDetailResponseBodyData extends TeaModel {
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

        public static DescribeCloudSiemEventDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventDetailResponseBodyData self = new DescribeCloudSiemEventDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAssetNum(Integer assetNum) {
            this.assetNum = assetNum;
            return this;
        }
        public Integer getAssetNum() {
            return this.assetNum;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAttCkLabels(java.util.List<String> attCkLabels) {
            this.attCkLabels = attCkLabels;
            return this;
        }
        public java.util.List<String> getAttCkLabels() {
            return this.attCkLabels;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setDataSources(java.util.List<String> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setExtContent(String extContent) {
            this.extContent = extContent;
            return this;
        }
        public String getExtContent() {
            return this.extContent;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setIncidentName(String incidentName) {
            this.incidentName = incidentName;
            return this;
        }
        public String getIncidentName() {
            return this.incidentName;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setIncidentNameEn(String incidentNameEn) {
            this.incidentNameEn = incidentNameEn;
            return this;
        }
        public String getIncidentNameEn() {
            return this.incidentNameEn;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setThreatScore(Float threatScore) {
            this.threatScore = threatScore;
            return this;
        }
        public Float getThreatScore() {
            return this.threatScore;
        }

    }

}
