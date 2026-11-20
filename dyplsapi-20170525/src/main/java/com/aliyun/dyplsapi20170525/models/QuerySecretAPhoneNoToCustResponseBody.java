// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretAPhoneNoToCustResponseBody extends TeaModel {
    /**
     * <p>Details of the denied access.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Request status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The struct for querying the A number reporting status.</p>
     */
    @NameInMap("Data")
    public QuerySecretAPhoneNoToCustResponseBodyData data;

    /**
     * <p>Error message for a failed operation.</p>
     * 
     * <strong>example:</strong>
     * <p>号码组不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1D73E648-0978-18A5-B089-3BB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: Succeeded.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySecretAPhoneNoToCustResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretAPhoneNoToCustResponseBody self = new QuerySecretAPhoneNoToCustResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecretAPhoneNoToCustResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySecretAPhoneNoToCustResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySecretAPhoneNoToCustResponseBody setData(QuerySecretAPhoneNoToCustResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySecretAPhoneNoToCustResponseBodyData getData() {
        return this.data;
    }

    public QuerySecretAPhoneNoToCustResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecretAPhoneNoToCustResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecretAPhoneNoToCustResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySecretAPhoneNoToCustResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the A number group to which the number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("ANoWhiteGroupId")
        public String ANoWhiteGroupId;

        /**
         * <p>The contact phone number of the handler or legal representative for landline reporting.</p>
         * 
         * <strong>example:</strong>
         * <p>130*****8888</p>
         */
        @NameInMap("CustPhoneNo")
        public String custPhoneNo;

        /**
         * <p>The number type. Valid values:</p>
         * <ul>
         * <li><p>Mobile: Mobile phone number.</p>
         * </li>
         * <li><p>Fixed: Landline number.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Mobile</p>
         */
        @NameInMap("NoType")
        public String noType;

        /**
         * <p>A number.</p>
         * 
         * <strong>example:</strong>
         * <p>130*****1234</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <p>Remarks (user\&quot;s own business notes).</p>
         * 
         * <strong>example:</strong>
         * <p>***报备</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The reason for review failure.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;系统判断为不同人&quot;]</p>
         */
        @NameInMap("ReportResult")
        public String reportResult;

        /**
         * <p>The reporting result. Valid values:</p>
         * <ul>
         * <li><p>REVIEWING: Under review.</p>
         * </li>
         * <li><p>PASS: Review passed.</p>
         * </li>
         * <li><p>FAIL: Review failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REVIEWING</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        public static QuerySecretAPhoneNoToCustResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretAPhoneNoToCustResponseBodyData self = new QuerySecretAPhoneNoToCustResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySecretAPhoneNoToCustResponseBodyData setANoWhiteGroupId(String ANoWhiteGroupId) {
            this.ANoWhiteGroupId = ANoWhiteGroupId;
            return this;
        }
        public String getANoWhiteGroupId() {
            return this.ANoWhiteGroupId;
        }

        public QuerySecretAPhoneNoToCustResponseBodyData setCustPhoneNo(String custPhoneNo) {
            this.custPhoneNo = custPhoneNo;
            return this;
        }
        public String getCustPhoneNo() {
            return this.custPhoneNo;
        }

        public QuerySecretAPhoneNoToCustResponseBodyData setNoType(String noType) {
            this.noType = noType;
            return this;
        }
        public String getNoType() {
            return this.noType;
        }

        public QuerySecretAPhoneNoToCustResponseBodyData setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public QuerySecretAPhoneNoToCustResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QuerySecretAPhoneNoToCustResponseBodyData setReportResult(String reportResult) {
            this.reportResult = reportResult;
            return this;
        }
        public String getReportResult() {
            return this.reportResult;
        }

        public QuerySecretAPhoneNoToCustResponseBodyData setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

    }

}
