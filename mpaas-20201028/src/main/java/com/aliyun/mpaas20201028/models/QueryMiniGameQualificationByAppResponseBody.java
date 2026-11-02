// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMiniGameQualificationByAppResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Content")
    public java.util.List<QueryMiniGameQualificationByAppResponseBodyContent> content;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMiniGameQualificationByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniGameQualificationByAppResponseBody self = new QueryMiniGameQualificationByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMiniGameQualificationByAppResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryMiniGameQualificationByAppResponseBody setContent(java.util.List<QueryMiniGameQualificationByAppResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<QueryMiniGameQualificationByAppResponseBodyContent> getContent() {
        return this.content;
    }

    public QueryMiniGameQualificationByAppResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMiniGameQualificationByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMiniGameQualificationByAppResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMiniGameQualificationByAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Url")
        public String url;

        public static QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles build(java.util.Map<String, ?> map) throws Exception {
            QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles self = new QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles();
            return TeaModel.build(map, self);
        }

        public QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Url")
        public String url;

        public static QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles build(java.util.Map<String, ?> map) throws Exception {
            QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles self = new QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles();
            return TeaModel.build(map, self);
        }

        public QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMiniGameQualificationByAppResponseBodyContent extends TeaModel {
        @NameInMap("BusinessLicenseName")
        public String businessLicenseName;

        @NameInMap("BusinessLicenseUrl")
        public String businessLicenseUrl;

        @NameInMap("CopyrightAuthorizationFiles")
        public java.util.List<QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles> copyrightAuthorizationFiles;

        @NameInMap("CopyrightFileName")
        public String copyrightFileName;

        @NameInMap("CopyrightRegistrationNumber")
        public String copyrightRegistrationNumber;

        @NameInMap("CopyrightUrl")
        public String copyrightUrl;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("GameType")
        public String gameType;

        @NameInMap("GameVersionId")
        public String gameVersionId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("IcpFileName")
        public String icpFileName;

        @NameInMap("IcpUrl")
        public String icpUrl;

        @NameInMap("IdCode")
        public String idCode;

        @NameInMap("IpAuthorizationFiles")
        public java.util.List<QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles> ipAuthorizationFiles;

        @NameInMap("MiniProgramCode")
        public String miniProgramCode;

        @NameInMap("MiniProgramId")
        public Long miniProgramId;

        @NameInMap("OnlineGamePubReFileName")
        public String onlineGamePubReFileName;

        @NameInMap("OnlineGamePubReUrl")
        public String onlineGamePubReUrl;

        @NameInMap("PrivacyPolicyUrl")
        public String privacyPolicyUrl;

        @NameInMap("Publisher")
        public String publisher;

        @NameInMap("ReviewStatus")
        public String reviewStatus;

        public static QueryMiniGameQualificationByAppResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMiniGameQualificationByAppResponseBodyContent self = new QueryMiniGameQualificationByAppResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setBusinessLicenseName(String businessLicenseName) {
            this.businessLicenseName = businessLicenseName;
            return this;
        }
        public String getBusinessLicenseName() {
            return this.businessLicenseName;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setBusinessLicenseUrl(String businessLicenseUrl) {
            this.businessLicenseUrl = businessLicenseUrl;
            return this;
        }
        public String getBusinessLicenseUrl() {
            return this.businessLicenseUrl;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setCopyrightAuthorizationFiles(java.util.List<QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles> copyrightAuthorizationFiles) {
            this.copyrightAuthorizationFiles = copyrightAuthorizationFiles;
            return this;
        }
        public java.util.List<QueryMiniGameQualificationByAppResponseBodyContentCopyrightAuthorizationFiles> getCopyrightAuthorizationFiles() {
            return this.copyrightAuthorizationFiles;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setCopyrightFileName(String copyrightFileName) {
            this.copyrightFileName = copyrightFileName;
            return this;
        }
        public String getCopyrightFileName() {
            return this.copyrightFileName;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setCopyrightRegistrationNumber(String copyrightRegistrationNumber) {
            this.copyrightRegistrationNumber = copyrightRegistrationNumber;
            return this;
        }
        public String getCopyrightRegistrationNumber() {
            return this.copyrightRegistrationNumber;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setCopyrightUrl(String copyrightUrl) {
            this.copyrightUrl = copyrightUrl;
            return this;
        }
        public String getCopyrightUrl() {
            return this.copyrightUrl;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setGameType(String gameType) {
            this.gameType = gameType;
            return this;
        }
        public String getGameType() {
            return this.gameType;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setGameVersionId(String gameVersionId) {
            this.gameVersionId = gameVersionId;
            return this;
        }
        public String getGameVersionId() {
            return this.gameVersionId;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setIcpFileName(String icpFileName) {
            this.icpFileName = icpFileName;
            return this;
        }
        public String getIcpFileName() {
            return this.icpFileName;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setIcpUrl(String icpUrl) {
            this.icpUrl = icpUrl;
            return this;
        }
        public String getIcpUrl() {
            return this.icpUrl;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setIdCode(String idCode) {
            this.idCode = idCode;
            return this;
        }
        public String getIdCode() {
            return this.idCode;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setIpAuthorizationFiles(java.util.List<QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles> ipAuthorizationFiles) {
            this.ipAuthorizationFiles = ipAuthorizationFiles;
            return this;
        }
        public java.util.List<QueryMiniGameQualificationByAppResponseBodyContentIpAuthorizationFiles> getIpAuthorizationFiles() {
            return this.ipAuthorizationFiles;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setMiniProgramCode(String miniProgramCode) {
            this.miniProgramCode = miniProgramCode;
            return this;
        }
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setMiniProgramId(Long miniProgramId) {
            this.miniProgramId = miniProgramId;
            return this;
        }
        public Long getMiniProgramId() {
            return this.miniProgramId;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setOnlineGamePubReFileName(String onlineGamePubReFileName) {
            this.onlineGamePubReFileName = onlineGamePubReFileName;
            return this;
        }
        public String getOnlineGamePubReFileName() {
            return this.onlineGamePubReFileName;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setOnlineGamePubReUrl(String onlineGamePubReUrl) {
            this.onlineGamePubReUrl = onlineGamePubReUrl;
            return this;
        }
        public String getOnlineGamePubReUrl() {
            return this.onlineGamePubReUrl;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setPrivacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            return this;
        }
        public String getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
        }

        public QueryMiniGameQualificationByAppResponseBodyContent setReviewStatus(String reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }
        public String getReviewStatus() {
            return this.reviewStatus;
        }

    }

}
