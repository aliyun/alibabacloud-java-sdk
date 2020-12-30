// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInListResponseBody extends TeaModel {
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public QueryTransferInListResponseBodyData data;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static QueryTransferInListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInListResponseBody self = new QueryTransferInListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTransferInListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTransferInListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTransferInListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTransferInListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTransferInListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryTransferInListResponseBody setData(QueryTransferInListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTransferInListResponseBodyData getData() {
        return this.data;
    }

    public QueryTransferInListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTransferInListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class QueryTransferInListResponseBodyDataTransferInInfo extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ModificationDate")
        public String modificationDate;

        @NameInMap("TransferAuthorizationCodeSubmissionDateLong")
        public Long transferAuthorizationCodeSubmissionDateLong;

        @NameInMap("SubmissionDateLong")
        public Long submissionDateLong;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("NeedMailCheck")
        public Boolean needMailCheck;

        @NameInMap("ModificationDateLong")
        public Long modificationDateLong;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ProgressBarType")
        public Integer progressBarType;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("ResultDateLong")
        public Long resultDateLong;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("Email")
        public String email;

        @NameInMap("WhoisMailStatus")
        public Boolean whoisMailStatus;

        @NameInMap("TransferAuthorizationCodeSubmissionDate")
        public String transferAuthorizationCodeSubmissionDate;

        @NameInMap("SubmissionDate")
        public String submissionDate;

        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        @NameInMap("SimpleTransferInStatus")
        public String simpleTransferInStatus;

        @NameInMap("ResultDate")
        public String resultDate;

        public static QueryTransferInListResponseBodyDataTransferInInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTransferInListResponseBodyDataTransferInInfo self = new QueryTransferInListResponseBodyDataTransferInInfo();
            return TeaModel.build(map, self);
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setModificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }
        public String getModificationDate() {
            return this.modificationDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setTransferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
            this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
            return this;
        }
        public Long getTransferAuthorizationCodeSubmissionDateLong() {
            return this.transferAuthorizationCodeSubmissionDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setSubmissionDateLong(Long submissionDateLong) {
            this.submissionDateLong = submissionDateLong;
            return this;
        }
        public Long getSubmissionDateLong() {
            return this.submissionDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setNeedMailCheck(Boolean needMailCheck) {
            this.needMailCheck = needMailCheck;
            return this;
        }
        public Boolean getNeedMailCheck() {
            return this.needMailCheck;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setModificationDateLong(Long modificationDateLong) {
            this.modificationDateLong = modificationDateLong;
            return this;
        }
        public Long getModificationDateLong() {
            return this.modificationDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setProgressBarType(Integer progressBarType) {
            this.progressBarType = progressBarType;
            return this;
        }
        public Integer getProgressBarType() {
            return this.progressBarType;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultDateLong(Long resultDateLong) {
            this.resultDateLong = resultDateLong;
            return this;
        }
        public Long getResultDateLong() {
            return this.resultDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setWhoisMailStatus(Boolean whoisMailStatus) {
            this.whoisMailStatus = whoisMailStatus;
            return this;
        }
        public Boolean getWhoisMailStatus() {
            return this.whoisMailStatus;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setTransferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
            this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
            return this;
        }
        public String getTransferAuthorizationCodeSubmissionDate() {
            return this.transferAuthorizationCodeSubmissionDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setSubmissionDate(String submissionDate) {
            this.submissionDate = submissionDate;
            return this;
        }
        public String getSubmissionDate() {
            return this.submissionDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setSimpleTransferInStatus(String simpleTransferInStatus) {
            this.simpleTransferInStatus = simpleTransferInStatus;
            return this;
        }
        public String getSimpleTransferInStatus() {
            return this.simpleTransferInStatus;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultDate(String resultDate) {
            this.resultDate = resultDate;
            return this;
        }
        public String getResultDate() {
            return this.resultDate;
        }

    }

    public static class QueryTransferInListResponseBodyData extends TeaModel {
        @NameInMap("TransferInInfo")
        public java.util.List<QueryTransferInListResponseBodyDataTransferInInfo> transferInInfo;

        public static QueryTransferInListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTransferInListResponseBodyData self = new QueryTransferInListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTransferInListResponseBodyData setTransferInInfo(java.util.List<QueryTransferInListResponseBodyDataTransferInInfo> transferInInfo) {
            this.transferInInfo = transferInInfo;
            return this;
        }
        public java.util.List<QueryTransferInListResponseBodyDataTransferInInfo> getTransferInInfo() {
            return this.transferInInfo;
        }

    }

}
