// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyResourcePermissionResponseBody extends TeaModel {
    /**
     * <p>The error code of the request. A value of OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The application result.</p>
     */
    @NameInMap("Data")
    public ApplyResourcePermissionResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ApplyResourcePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourcePermissionResponseBody self = new ApplyResourcePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyResourcePermissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyResourcePermissionResponseBody setData(ApplyResourcePermissionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyResourcePermissionResponseBodyData getData() {
        return this.data;
    }

    public ApplyResourcePermissionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ApplyResourcePermissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyResourcePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyResourcePermissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyResourcePermissionResponseBodyData extends TeaModel {
        /**
         * <p>The list of application IDs.</p>
         */
        @NameInMap("ApplyIds")
        public java.util.List<String> applyIds;

        /**
         * <p>The list of approval IDs.</p>
         */
        @NameInMap("BpmsIds")
        public java.util.List<String> bpmsIds;

        public static ApplyResourcePermissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyResourcePermissionResponseBodyData self = new ApplyResourcePermissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyResourcePermissionResponseBodyData setApplyIds(java.util.List<String> applyIds) {
            this.applyIds = applyIds;
            return this;
        }
        public java.util.List<String> getApplyIds() {
            return this.applyIds;
        }

        public ApplyResourcePermissionResponseBodyData setBpmsIds(java.util.List<String> bpmsIds) {
            this.bpmsIds = bpmsIds;
            return this;
        }
        public java.util.List<String> getBpmsIds() {
            return this.bpmsIds;
        }

    }

}
