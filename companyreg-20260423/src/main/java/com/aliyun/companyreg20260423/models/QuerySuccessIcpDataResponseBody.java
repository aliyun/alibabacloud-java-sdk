// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20260423.models;

import com.aliyun.tea.*;

public class QuerySuccessIcpDataResponseBody extends TeaModel {
    @NameInMap("BaSuccessDataWithRiskList")
    public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList> baSuccessDataWithRiskList;

    /**
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1A13ABB5-7649-5031-B55C-D2E38F9F189D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySuccessIcpDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySuccessIcpDataResponseBody self = new QuerySuccessIcpDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySuccessIcpDataResponseBody setBaSuccessDataWithRiskList(java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList> baSuccessDataWithRiskList) {
        this.baSuccessDataWithRiskList = baSuccessDataWithRiskList;
        return this;
    }
    public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList> getBaSuccessDataWithRiskList() {
        return this.baSuccessDataWithRiskList;
    }

    public QuerySuccessIcpDataResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public QuerySuccessIcpDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySuccessIcpDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySuccessIcpDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alipay</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppRecordNum")
        public String appRecordNum;

        @NameInMap("DomainList")
        public java.util.List<String> domainList;

        @NameInMap("ResponsiblePersonName")
        public String responsiblePersonName;

        public static QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList build(java.util.Map<String, ?> map) throws Exception {
            QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList self = new QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList();
            return TeaModel.build(map, self);
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList setAppRecordNum(String appRecordNum) {
            this.appRecordNum = appRecordNum;
            return this;
        }
        public String getAppRecordNum() {
            return this.appRecordNum;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList setDomainList(java.util.List<String> domainList) {
            this.domainList = domainList;
            return this;
        }
        public java.util.List<String> getDomainList() {
            return this.domainList;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList setResponsiblePersonName(String responsiblePersonName) {
            this.responsiblePersonName = responsiblePersonName;
            return this;
        }
        public String getResponsiblePersonName() {
            return this.responsiblePersonName;
        }

    }

    public static class QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList extends TeaModel {
        @NameInMap("RectifySuggestList")
        public java.util.List<String> rectifySuggestList;

        @NameInMap("RiskSource")
        public String riskSource;

        public static QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList build(java.util.Map<String, ?> map) throws Exception {
            QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList self = new QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList();
            return TeaModel.build(map, self);
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList setRectifySuggestList(java.util.List<String> rectifySuggestList) {
            this.rectifySuggestList = rectifySuggestList;
            return this;
        }
        public java.util.List<String> getRectifySuggestList() {
            return this.rectifySuggestList;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList setRiskSource(String riskSource) {
            this.riskSource = riskSource;
            return this;
        }
        public String getRiskSource() {
            return this.riskSource;
        }

    }

    public static class QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-04-24</p>
         */
        @NameInMap("DeadLine")
        public String deadLine;

        @NameInMap("RiskDetailList")
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList> riskDetailList;

        public static QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList build(java.util.Map<String, ?> map) throws Exception {
            QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList self = new QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList();
            return TeaModel.build(map, self);
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList setDeadLine(String deadLine) {
            this.deadLine = deadLine;
            return this;
        }
        public String getDeadLine() {
            return this.deadLine;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList setRiskDetailList(java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList> riskDetailList) {
            this.riskDetailList = riskDetailList;
            return this;
        }
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskListRiskDetailList> getRiskDetailList() {
            return this.riskDetailList;
        }

    }

    public static class QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList extends TeaModel {
        @NameInMap("DomainList")
        public java.util.List<String> domainList;

        @NameInMap("ResponsiblePersonName")
        public String responsiblePersonName;

        @NameInMap("SiteName")
        public String siteName;

        @NameInMap("SiteRecordNum")
        public String siteRecordNum;

        public static QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList build(java.util.Map<String, ?> map) throws Exception {
            QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList self = new QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList();
            return TeaModel.build(map, self);
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList setDomainList(java.util.List<String> domainList) {
            this.domainList = domainList;
            return this;
        }
        public java.util.List<String> getDomainList() {
            return this.domainList;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList setResponsiblePersonName(String responsiblePersonName) {
            this.responsiblePersonName = responsiblePersonName;
            return this;
        }
        public String getResponsiblePersonName() {
            return this.responsiblePersonName;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList setSiteRecordNum(String siteRecordNum) {
            this.siteRecordNum = siteRecordNum;
            return this;
        }
        public String getSiteRecordNum() {
            return this.siteRecordNum;
        }

    }

    public static class QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList extends TeaModel {
        @NameInMap("AppList")
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList> appList;

        @NameInMap("IcpNumber")
        public String icpNumber;

        @NameInMap("OrganizersName")
        public String organizersName;

        @NameInMap("OrganizersNature")
        public String organizersNature;

        @NameInMap("ResponsiblePersonName")
        public String responsiblePersonName;

        @NameInMap("RiskList")
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList> riskList;

        @NameInMap("WebsiteList")
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList> websiteList;

        public static QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList build(java.util.Map<String, ?> map) throws Exception {
            QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList self = new QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList();
            return TeaModel.build(map, self);
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList setAppList(java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListAppList> getAppList() {
            return this.appList;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList setIcpNumber(String icpNumber) {
            this.icpNumber = icpNumber;
            return this;
        }
        public String getIcpNumber() {
            return this.icpNumber;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList setOrganizersName(String organizersName) {
            this.organizersName = organizersName;
            return this;
        }
        public String getOrganizersName() {
            return this.organizersName;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList setOrganizersNature(String organizersNature) {
            this.organizersNature = organizersNature;
            return this;
        }
        public String getOrganizersNature() {
            return this.organizersNature;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList setResponsiblePersonName(String responsiblePersonName) {
            this.responsiblePersonName = responsiblePersonName;
            return this;
        }
        public String getResponsiblePersonName() {
            return this.responsiblePersonName;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList setRiskList(java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList> riskList) {
            this.riskList = riskList;
            return this;
        }
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListRiskList> getRiskList() {
            return this.riskList;
        }

        public QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskList setWebsiteList(java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList> websiteList) {
            this.websiteList = websiteList;
            return this;
        }
        public java.util.List<QuerySuccessIcpDataResponseBodyBaSuccessDataWithRiskListWebsiteList> getWebsiteList() {
            return this.websiteList;
        }

    }

}
