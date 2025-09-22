// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySingleActivityInfoResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySingleActivityInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

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

    public static QuerySingleActivityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleActivityInfoResponseBody self = new QuerySingleActivityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySingleActivityInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySingleActivityInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySingleActivityInfoResponseBody setData(java.util.List<QuerySingleActivityInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySingleActivityInfoResponseBodyData> getData() {
        return this.data;
    }

    public QuerySingleActivityInfoResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySingleActivityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySingleActivityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySingleActivityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySingleActivityInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ActivityId")
        public Long activityId;

        /**
         * <strong>example:</strong>
         * <p>vip</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerName")
        public String customerName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xx@aliyun.com">xx@aliyun.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
         * <p>234355**</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.com?a=xx">http://xxx.com?a=xx</a></p>
         */
        @NameInMap("QRCode")
        public String QRCode;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ReportFields")
        public String reportFields;

        public static QuerySingleActivityInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySingleActivityInfoResponseBodyData self = new QuerySingleActivityInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySingleActivityInfoResponseBodyData setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public QuerySingleActivityInfoResponseBodyData setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public QuerySingleActivityInfoResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QuerySingleActivityInfoResponseBodyData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public QuerySingleActivityInfoResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QuerySingleActivityInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySingleActivityInfoResponseBodyData setIsVipCustomer(String isVipCustomer) {
            this.isVipCustomer = isVipCustomer;
            return this;
        }
        public String getIsVipCustomer() {
            return this.isVipCustomer;
        }

        public QuerySingleActivityInfoResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QuerySingleActivityInfoResponseBodyData setQRCode(String QRCode) {
            this.QRCode = QRCode;
            return this;
        }
        public String getQRCode() {
            return this.QRCode;
        }

        public QuerySingleActivityInfoResponseBodyData setReportFields(String reportFields) {
            this.reportFields = reportFields;
            return this;
        }
        public String getReportFields() {
            return this.reportFields;
        }

    }

}
