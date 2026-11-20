// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePhoneNoAReportResponseBody extends TeaModel {
    /**
     * <p>Details of denied access.</p>
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
     * <p>The struct of the A-number filing result.</p>
     */
    @NameInMap("Data")
    public CreatePhoneNoAReportResponseBodyData data;

    /**
     * <p>Error message for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>手机号码***已存在</p>
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

    public static CreatePhoneNoAReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneNoAReportResponseBody self = new CreatePhoneNoAReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhoneNoAReportResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreatePhoneNoAReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePhoneNoAReportResponseBody setData(CreatePhoneNoAReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePhoneNoAReportResponseBodyData getData() {
        return this.data;
    }

    public CreatePhoneNoAReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePhoneNoAReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhoneNoAReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePhoneNoAReportResponseBodyData extends TeaModel {
        /**
         * <p>Creation result. Valid values:</p>
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
        @NameInMap("CreateResult")
        public Boolean createResult;

        /**
         * <p>Enumeration of creation types. A value of 1 indicates success, and negative values indicate creation failure. Valid values:</p>
         * <ul>
         * <li><p>1: Succeeded.</p>
         * </li>
         * <li><p>-1: The mobile phone number has already been submitted for filing; no need to submit again.</p>
         * </li>
         * <li><p>-2: The mobile phone number has already been successfully filed; no need to file again.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailType")
        public Long failType;

        public static CreatePhoneNoAReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePhoneNoAReportResponseBodyData self = new CreatePhoneNoAReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePhoneNoAReportResponseBodyData setCreateResult(Boolean createResult) {
            this.createResult = createResult;
            return this;
        }
        public Boolean getCreateResult() {
            return this.createResult;
        }

        public CreatePhoneNoAReportResponseBodyData setFailType(Long failType) {
            this.failType = failType;
            return this;
        }
        public Long getFailType() {
            return this.failType;
        }

    }

}
