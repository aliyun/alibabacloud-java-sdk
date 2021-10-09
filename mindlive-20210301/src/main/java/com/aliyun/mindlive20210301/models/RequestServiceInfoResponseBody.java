// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestServiceInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Service pack info
    @NameInMap("Data")
    public RequestServiceInfoResponseBodyData data;

    // Error code
    @NameInMap("ErrorCode")
    public String errorCode;

    // Error message
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Whether request succeeds
    @NameInMap("Success")
    public Boolean success;

    public static RequestServiceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestServiceInfoResponseBody self = new RequestServiceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestServiceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestServiceInfoResponseBody setData(RequestServiceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestServiceInfoResponseBodyData getData() {
        return this.data;
    }

    public RequestServiceInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestServiceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestServiceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RequestServiceInfoResponseBodyData extends TeaModel {
        // Service start time
        @NameInMap("ServiceEffectAt")
        public Long serviceEffectAt;

        // Service end time
        @NameInMap("ServiceExpireAt")
        public Long serviceExpireAt;

        // Name of service
        @NameInMap("ServicePackName")
        public String servicePackName;

        public static RequestServiceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestServiceInfoResponseBodyData self = new RequestServiceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestServiceInfoResponseBodyData setServiceEffectAt(Long serviceEffectAt) {
            this.serviceEffectAt = serviceEffectAt;
            return this;
        }
        public Long getServiceEffectAt() {
            return this.serviceEffectAt;
        }

        public RequestServiceInfoResponseBodyData setServiceExpireAt(Long serviceExpireAt) {
            this.serviceExpireAt = serviceExpireAt;
            return this;
        }
        public Long getServiceExpireAt() {
            return this.serviceExpireAt;
        }

        public RequestServiceInfoResponseBodyData setServicePackName(String servicePackName) {
            this.servicePackName = servicePackName;
            return this;
        }
        public String getServicePackName() {
            return this.servicePackName;
        }

    }

}
