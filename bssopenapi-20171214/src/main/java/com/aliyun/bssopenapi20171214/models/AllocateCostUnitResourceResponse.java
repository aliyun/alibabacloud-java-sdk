// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public AllocateCostUnitResourceResponseData data;

    public static AllocateCostUnitResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostUnitResourceResponse self = new AllocateCostUnitResourceResponse();
        return TeaModel.build(map, self);
    }

    public AllocateCostUnitResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateCostUnitResourceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AllocateCostUnitResourceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AllocateCostUnitResourceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AllocateCostUnitResourceResponse setData(AllocateCostUnitResourceResponseData data) {
        this.data = data;
        return this;
    }
    public AllocateCostUnitResourceResponseData getData() {
        return this.data;
    }

    public static class AllocateCostUnitResourceResponseData extends TeaModel {
        @NameInMap("ToUnitUserId")
        @Validation(required = true)
        public Long toUnitUserId;

        @NameInMap("ToUnitId")
        @Validation(required = true)
        public Long toUnitId;

        @NameInMap("IsSuccess")
        @Validation(required = true)
        public Boolean isSuccess;

        public static AllocateCostUnitResourceResponseData build(java.util.Map<String, ?> map) throws Exception {
            AllocateCostUnitResourceResponseData self = new AllocateCostUnitResourceResponseData();
            return TeaModel.build(map, self);
        }

        public AllocateCostUnitResourceResponseData setToUnitUserId(Long toUnitUserId) {
            this.toUnitUserId = toUnitUserId;
            return this;
        }
        public Long getToUnitUserId() {
            return this.toUnitUserId;
        }

        public AllocateCostUnitResourceResponseData setToUnitId(Long toUnitId) {
            this.toUnitId = toUnitId;
            return this;
        }
        public Long getToUnitId() {
            return this.toUnitId;
        }

        public AllocateCostUnitResourceResponseData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
