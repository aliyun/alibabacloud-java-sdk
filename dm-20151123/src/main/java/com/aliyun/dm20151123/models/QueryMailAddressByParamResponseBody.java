// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryMailAddressByParamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>95A7D497-F8DD-4834-B81E-C1783236E55F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public QueryMailAddressByParamResponseBodyData data;

    public static QueryMailAddressByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMailAddressByParamResponseBody self = new QueryMailAddressByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMailAddressByParamResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryMailAddressByParamResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMailAddressByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMailAddressByParamResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryMailAddressByParamResponseBody setData(QueryMailAddressByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMailAddressByParamResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMailAddressByParamResponseBodyDataMailAddress extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <strong>example:</strong>
         * <p>2019-09-29T13:28Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("DailyCount")
        public String dailyCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DailyReqCount")
        public String dailyReqCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <strong>example:</strong>
         * <p>12122</p>
         */
        @NameInMap("MailAddressId")
        public String mailAddressId;

        /**
         * <strong>example:</strong>
         * <p>300000</p>
         */
        @NameInMap("MonthCount")
        public String monthCount;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("MonthReqCount")
        public String monthReqCount;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:112@aliyun.com">112@aliyun.com</a></p>
         */
        @NameInMap("ReplyAddress")
        public String replyAddress;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReplyStatus")
        public String replyStatus;

        /**
         * <strong>example:</strong>
         * <p>batch</p>
         */
        @NameInMap("Sendtype")
        public String sendtype;

        public static QueryMailAddressByParamResponseBodyDataMailAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryMailAddressByParamResponseBodyDataMailAddress self = new QueryMailAddressByParamResponseBodyDataMailAddress();
            return TeaModel.build(map, self);
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setDailyCount(String dailyCount) {
            this.dailyCount = dailyCount;
            return this;
        }
        public String getDailyCount() {
            return this.dailyCount;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setDailyReqCount(String dailyReqCount) {
            this.dailyReqCount = dailyReqCount;
            return this;
        }
        public String getDailyReqCount() {
            return this.dailyReqCount;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setMailAddressId(String mailAddressId) {
            this.mailAddressId = mailAddressId;
            return this;
        }
        public String getMailAddressId() {
            return this.mailAddressId;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setMonthCount(String monthCount) {
            this.monthCount = monthCount;
            return this;
        }
        public String getMonthCount() {
            return this.monthCount;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setMonthReqCount(String monthReqCount) {
            this.monthReqCount = monthReqCount;
            return this;
        }
        public String getMonthReqCount() {
            return this.monthReqCount;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setReplyAddress(String replyAddress) {
            this.replyAddress = replyAddress;
            return this;
        }
        public String getReplyAddress() {
            return this.replyAddress;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setReplyStatus(String replyStatus) {
            this.replyStatus = replyStatus;
            return this;
        }
        public String getReplyStatus() {
            return this.replyStatus;
        }

        public QueryMailAddressByParamResponseBodyDataMailAddress setSendtype(String sendtype) {
            this.sendtype = sendtype;
            return this;
        }
        public String getSendtype() {
            return this.sendtype;
        }

    }

    public static class QueryMailAddressByParamResponseBodyData extends TeaModel {
        @NameInMap("mailAddress")
        public java.util.List<QueryMailAddressByParamResponseBodyDataMailAddress> mailAddress;

        public static QueryMailAddressByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMailAddressByParamResponseBodyData self = new QueryMailAddressByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMailAddressByParamResponseBodyData setMailAddress(java.util.List<QueryMailAddressByParamResponseBodyDataMailAddress> mailAddress) {
            this.mailAddress = mailAddress;
            return this;
        }
        public java.util.List<QueryMailAddressByParamResponseBodyDataMailAddress> getMailAddress() {
            return this.mailAddress;
        }

    }

}
