// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SenderStatisticsDetailByParamResponseBody extends TeaModel {
    /**
     * <p>Used for pagination. If there are more results, set this returned value to the NextStart in the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>90f0243616#203#a***@example.net-1658817689#a***@example.net.247141122178</p>
     */
    @NameInMap("NextStart")
    public String nextStart;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>B5AB8EBB-EE64-4BB2-B085-B92CC5DEDC41</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Detailed records</p>
     */
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
        /**
         * <p>Sending address</p>
         * 
         * <strong>example:</strong>
         * <p>s***@example.net</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigSetId")
        public String configSetId;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigSetName")
        public String configSetName;

        /**
         * <p>Detailed classification of error reasons: - SendOk - SmtpNxBox
         * etc.</p>
         * 
         * <strong>example:</strong>
         * <p>SendOk</p>
         */
        @NameInMap("ErrorClassification")
        public String errorClassification;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("IpPoolId")
        public String ipPoolId;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("IpPoolName")
        public String ipPoolName;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-28T17:11Z</p>
         */
        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        /**
         * <p>Delivery detail information</p>
         * 
         * <strong>example:</strong>
         * <p>250 Send Mail OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Delivery status: 0 Success, 2 Invalid Address, 3 Spam, 4 Other Failures</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Email subject</p>
         * 
         * <strong>example:</strong>
         * <p>test subject</p>
         */
        @NameInMap("Subject")
        public String subject;

        /**
         * <p>Recipient address</p>
         * 
         * <strong>example:</strong>
         * <p>b***@example.net</p>
         */
        @NameInMap("ToAddress")
        public String toAddress;

        /**
         * <p>UTC formatted update time</p>
         * 
         * <strong>example:</strong>
         * <p>1619601108</p>
         */
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

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setConfigSetId(String configSetId) {
            this.configSetId = configSetId;
            return this;
        }
        public String getConfigSetId() {
            return this.configSetId;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setConfigSetName(String configSetName) {
            this.configSetName = configSetName;
            return this;
        }
        public String getConfigSetName() {
            return this.configSetName;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setErrorClassification(String errorClassification) {
            this.errorClassification = errorClassification;
            return this;
        }
        public String getErrorClassification() {
            return this.errorClassification;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setIpPoolId(String ipPoolId) {
            this.ipPoolId = ipPoolId;
            return this;
        }
        public String getIpPoolId() {
            return this.ipPoolId;
        }

        public SenderStatisticsDetailByParamResponseBodyDataMailDetail setIpPoolName(String ipPoolName) {
            this.ipPoolName = ipPoolName;
            return this;
        }
        public String getIpPoolName() {
            return this.ipPoolName;
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
