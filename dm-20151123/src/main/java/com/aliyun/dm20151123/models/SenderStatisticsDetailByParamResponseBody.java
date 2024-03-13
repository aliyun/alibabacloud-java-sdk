// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsDetailByParamResponseBody extends TeaModel {
    @NameInMap("NextStart")
    public String nextStart;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public SenderStatisticsDetailByParamResponseBodyData data;

    public static SenderStatisticsDetailByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SenderStatisticsDetailByParamResponseBody self = new SenderStatisticsDetailByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public SenderStatisticsDetailByParamResponseBody setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public SenderStatisticsDetailByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SenderStatisticsDetailByParamResponseBody setData(SenderStatisticsDetailByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SenderStatisticsDetailByParamResponseBodyData getData() {
        return this.data;
    }

    public static class SenderStatisticsDetailByParamResponseBodyDataMailDetail extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("ToAddress")
        public String toAddress;

        @NameInMap("UtcLastUpdateTime")
        public String utcLastUpdateTime;

        public static SenderStatisticsDetailByParamResponseBodyDataMailDetail build(java.util.Map<String, ?> map) throws Exception {
            SenderStatisticsDetailByParamResponseBodyDataMailDetail self = new SenderStatisticsDetailByParamResponseBodyDataMailDetail();
            return TeaModel.build(map, self);
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setToAddress(String toAddress) {
            this.toAddress = toAddress;
            return this;
        }
        public String getToAddress() {
            return this.toAddress;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setUtcLastUpdateTime(String utcLastUpdateTime) {
            this.utcLastUpdateTime = utcLastUpdateTime;
            return this;
        }
        public String getUtcLastUpdateTime() {
            return this.utcLastUpdateTime;
        }

    }

    public static class SenderStatisticsDetailByParamResponseBodyData extends TeaModel {
        @NameInMap("mailDetail")
        public java.util.List<SenderStatisticsDetailByParamResponseBodyDataMailDetail> mailDetail;

        public static SenderStatisticsDetailByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SenderStatisticsDetailByParamResponseBodyData self = new SenderStatisticsDetailByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SenderStatisticsDetailByParamResponseBodyData setMailDetail(java.util.List<SenderStatisticsDetailByParamResponseBodyDataMailDetail> mailDetail) {
            this.mailDetail = mailDetail;
            return this;
        }
        public java.util.List<SenderStatisticsDetailByParamResponseBodyDataMailDetail> getMailDetail() {
            return this.mailDetail;
        }

    }

}
