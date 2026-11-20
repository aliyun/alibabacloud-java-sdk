// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateFixedNoAReportResponseBody extends TeaModel {
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
     * <p>The struct of the reporting result for number A.</p>
     */
    @NameInMap("Data")
    public CreateFixedNoAReportResponseBodyData data;

    /**
     * <p>Error message for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>固话号码***已存在</p>
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

    public static CreateFixedNoAReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFixedNoAReportResponseBody self = new CreateFixedNoAReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFixedNoAReportResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateFixedNoAReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFixedNoAReportResponseBody setData(CreateFixedNoAReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateFixedNoAReportResponseBodyData getData() {
        return this.data;
    }

    public CreateFixedNoAReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFixedNoAReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFixedNoAReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateFixedNoAReportResponseBodyData extends TeaModel {
        /**
         * <p>Creation result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CreateResult")
        public Boolean createResult;

        /**
         * <p>Enumeration of creation types. The value 1 indicates success, and negative numbers indicate creation failure. Valid values:</p>
         * <ul>
         * <li><p>1: Succeeded.</p>
         * </li>
         * <li><p>-1: The phone number has already been submitted for reporting; no need to submit again.</p>
         * </li>
         * <li><p>-2: The phone number has already been successfully reported; no need to report again.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailType")
        public Long failType;

        public static CreateFixedNoAReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateFixedNoAReportResponseBodyData self = new CreateFixedNoAReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateFixedNoAReportResponseBodyData setCreateResult(Boolean createResult) {
            this.createResult = createResult;
            return this;
        }
        public Boolean getCreateResult() {
            return this.createResult;
        }

        public CreateFixedNoAReportResponseBodyData setFailType(Long failType) {
            this.failType = failType;
            return this;
        }
        public Long getFailType() {
            return this.failType;
        }

    }

}
