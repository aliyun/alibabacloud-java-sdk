// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeCloudSiemEventsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
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
        /**
         * <p>The current page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
        /**
         * <p>The number of alerts that are associated with the event.</p>
         */
        @NameInMap("AlertNum")
        public Integer alertNum;

        /**
         * <p>The ID of the Alibaba Cloud account to which the event belongs.</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The number of assets that are associated with the event.</p>
         */
        @NameInMap("AssetNum")
        public Integer assetNum;

        /**
         * <p>The tags of the ATT\&CK attack.</p>
         */
        @NameInMap("AttCkLabels")
        public java.util.List<String> attCkLabels;

        /**
         * <p>The sources of the alert.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<String> dataSources;

        /**
         * <p>The description of the event.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The event description in English.</p>
         */
        @NameInMap("DescriptionEn")
        public String descriptionEn;

        /**
         * <p>The extended event information in the JSON format.</p>
         */
        @NameInMap("ExtContent")
        public String extContent;

        /**
         * <p>The time when the event occurred.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the event was last updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <p>The event name in English.</p>
         */
        @NameInMap("IncidentNameEn")
        public String incidentNameEn;

        /**
         * <p>The UUID of the event.</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        @NameInMap("ReferAccount")
        public String referAccount;

        /**
         * <p>The remarks of the event.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the event. Valid values:</p>
         * <br>
         * <p>*   0: unhandled</p>
         * <p>*   1: handling</p>
         * <p>*   5: handling failed</p>
         * <p>*   10: handled</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The risk level. Valid values:</p>
         * <br>
         * <p>*   serious: high</p>
         * <p>*   suspicious: medium</p>
         * <p>*   remind: low</p>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        /**
         * <p>The risk score of the event. Valid values: 0 to 100. A higher value indicates a higher risk level.</p>
         */
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

        public DescribeCloudSiemEventsResponseBodyDataResponseData setReferAccount(String referAccount) {
            this.referAccount = referAccount;
            return this;
        }
        public String getReferAccount() {
            return this.referAccount;
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
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeCloudSiemEventsResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
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
