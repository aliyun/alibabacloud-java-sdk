// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretAPhoneNoToCustResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>请求状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A号码报备状态查询结构体</p>
     */
    @NameInMap("Data")
    public QuerySecretAPhoneNoToCustResponseBodyData data;

    /**
     * <p>失败错误提示</p>
     * 
     * <strong>example:</strong>
     * <p>号码组不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回id</p>
     * 
     * <strong>example:</strong>
     * <p>1D73E648-0978-18A5-B089-3BB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>请求是否成功</p>
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
         * <p>所属a号码组id</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("ANoWhiteGroupId")
        public String ANoWhiteGroupId;

        /**
         * <p>固话报备的经办人/法人电话</p>
         * 
         * <strong>example:</strong>
         * <p>130*****8888</p>
         */
        @NameInMap("CustPhoneNo")
        public String custPhoneNo;

        /**
         * <p>号码类型</p>
         * 
         * <strong>example:</strong>
         * <p>Mobile</p>
         */
        @NameInMap("NoType")
        public String noType;

        /**
         * <p>A号码</p>
         * 
         * <strong>example:</strong>
         * <p>130*****1234</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <p>备注（客户自己的业务备注，可编辑）</p>
         * 
         * <strong>example:</strong>
         * <p>***报备</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>报备失败原因</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;系统判断为不同人&quot;]</p>
         */
        @NameInMap("ReportResult")
        public String reportResult;

        /**
         * <p>报备结果</p>
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
