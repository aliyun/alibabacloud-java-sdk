// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTransferInListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryTransferInListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInListResponseBody self = new QueryTransferInListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTransferInListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTransferInListResponseBody setData(QueryTransferInListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTransferInListResponseBodyData getData() {
        return this.data;
    }

    public QueryTransferInListResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryTransferInListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTransferInListResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryTransferInListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTransferInListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTransferInListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTransferInListResponseBodyDataTransferInInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        @NameInMap("ExpirationDate")
        public String expirationDate;

        /**
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        @NameInMap("ExpirationDateLong")
        public Long expirationDateLong;

        /**
         * <strong>example:</strong>
         * <p>S20181T0WLI85212</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        @NameInMap("ModificationDate")
        public String modificationDate;

        /**
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        @NameInMap("ModificationDateLong")
        public Long modificationDateLong;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedMailCheck")
        public Boolean needMailCheck;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProgressBarType")
        public Integer progressBarType;

        /**
         * <strong>example:</strong>
         * <p>clientCancelled</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        @NameInMap("ResultDate")
        public String resultDate;

        /**
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        @NameInMap("ResultDateLong")
        public Long resultDateLong;

        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>FAIL</p>
         */
        @NameInMap("SimpleTransferInStatus")
        public String simpleTransferInStatus;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        @NameInMap("SubmissionDate")
        public String submissionDate;

        /**
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        @NameInMap("SubmissionDateLong")
        public Long submissionDateLong;

        /**
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
         */
        @NameInMap("TransferAuthorizationCodeSubmissionDate")
        public String transferAuthorizationCodeSubmissionDate;

        /**
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        @NameInMap("TransferAuthorizationCodeSubmissionDateLong")
        public Long transferAuthorizationCodeSubmissionDateLong;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WhoisMailStatus")
        public Boolean whoisMailStatus;

        public static QueryTransferInListResponseBodyDataTransferInInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryTransferInListResponseBodyDataTransferInInfo self = new QueryTransferInListResponseBodyDataTransferInInfo();
            return TeaModel.build(map, self);
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setExpirationDateLong(Long expirationDateLong) {
            this.expirationDateLong = expirationDateLong;
            return this;
        }
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setModificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }
        public String getModificationDate() {
            return this.modificationDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setModificationDateLong(Long modificationDateLong) {
            this.modificationDateLong = modificationDateLong;
            return this;
        }
        public Long getModificationDateLong() {
            return this.modificationDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setNeedMailCheck(Boolean needMailCheck) {
            this.needMailCheck = needMailCheck;
            return this;
        }
        public Boolean getNeedMailCheck() {
            return this.needMailCheck;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setProgressBarType(Integer progressBarType) {
            this.progressBarType = progressBarType;
            return this;
        }
        public Integer getProgressBarType() {
            return this.progressBarType;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultDate(String resultDate) {
            this.resultDate = resultDate;
            return this;
        }
        public String getResultDate() {
            return this.resultDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultDateLong(Long resultDateLong) {
            this.resultDateLong = resultDateLong;
            return this;
        }
        public Long getResultDateLong() {
            return this.resultDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setSimpleTransferInStatus(String simpleTransferInStatus) {
            this.simpleTransferInStatus = simpleTransferInStatus;
            return this;
        }
        public String getSimpleTransferInStatus() {
            return this.simpleTransferInStatus;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setSubmissionDate(String submissionDate) {
            this.submissionDate = submissionDate;
            return this;
        }
        public String getSubmissionDate() {
            return this.submissionDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setSubmissionDateLong(Long submissionDateLong) {
            this.submissionDateLong = submissionDateLong;
            return this;
        }
        public Long getSubmissionDateLong() {
            return this.submissionDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setTransferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
            this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
            return this;
        }
        public String getTransferAuthorizationCodeSubmissionDate() {
            return this.transferAuthorizationCodeSubmissionDate;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setTransferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
            this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
            return this;
        }
        public Long getTransferAuthorizationCodeSubmissionDateLong() {
            return this.transferAuthorizationCodeSubmissionDateLong;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTransferInListResponseBodyDataTransferInInfo setWhoisMailStatus(Boolean whoisMailStatus) {
            this.whoisMailStatus = whoisMailStatus;
            return this;
        }
        public Boolean getWhoisMailStatus() {
            return this.whoisMailStatus;
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
