// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryAllActivityInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAllActivityInfoResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAllActivityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllActivityInfoResponseBody self = new QueryAllActivityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllActivityInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAllActivityInfoResponseBody setData(java.util.List<QueryAllActivityInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAllActivityInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryAllActivityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllActivityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllActivityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAllActivityInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ActivityId")
        public Long activityId;

        /**
         * <strong>example:</strong>
         * <p>vip</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CustomerName")
        public String customerName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xx@aliyun.com">xx@aliyun.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsVipCustomer")
        public String isVipCustomer;

        /**
         * <strong>example:</strong>
         * <p>12123455</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("QRCode")
        public String QRCode;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ReportFields")
        public String reportFields;

        public static QueryAllActivityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAllActivityInfoResponseBodyData self = new QueryAllActivityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAllActivityInfoResponseBodyData setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QueryAllActivityInfoResponseBodyData setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public QueryAllActivityInfoResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QueryAllActivityInfoResponseBodyData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public QueryAllActivityInfoResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryAllActivityInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAllActivityInfoResponseBodyData setIsVipCustomer(String isVipCustomer) {
            this.isVipCustomer = isVipCustomer;
            return this;
        }
        public String getIsVipCustomer() {
            return this.isVipCustomer;
        }

        public QueryAllActivityInfoResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAllActivityInfoResponseBodyData setQRCode(String QRCode) {
            this.QRCode = QRCode;
            return this;
        }
        public String getQRCode() {
            return this.QRCode;
        }

        public QueryAllActivityInfoResponseBodyData setReportFields(String reportFields) {
            this.reportFields = reportFields;
            return this;
        }
        public String getReportFields() {
            return this.reportFields;
        }

    }

}
