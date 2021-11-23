// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AllocateCostUnitResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AllocateCostUnitResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostUnitResourceResponseBody self = new AllocateCostUnitResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateCostUnitResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AllocateCostUnitResourceResponseBody setData(AllocateCostUnitResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AllocateCostUnitResourceResponseBodyData getData() {
        return this.data;
    }

    public AllocateCostUnitResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AllocateCostUnitResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllocateCostUnitResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AllocateCostUnitResourceResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        @NameInMap("ToUnitId")
        public Long toUnitId;

        @NameInMap("ToUnitUserId")
        public Long toUnitUserId;

        public static AllocateCostUnitResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AllocateCostUnitResourceResponseBodyData self = new AllocateCostUnitResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AllocateCostUnitResourceResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public AllocateCostUnitResourceResponseBodyData setToUnitId(Long toUnitId) {
            this.toUnitId = toUnitId;
            return this;
        }
        public Long getToUnitId() {
            return this.toUnitId;
        }

        public AllocateCostUnitResourceResponseBodyData setToUnitUserId(Long toUnitUserId) {
            this.toUnitUserId = toUnitUserId;
            return this;
        }
        public Long getToUnitUserId() {
            return this.toUnitUserId;
        }

    }

}
