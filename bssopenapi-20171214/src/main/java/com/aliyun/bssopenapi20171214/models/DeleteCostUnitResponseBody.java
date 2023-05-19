// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DeleteCostUnitResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DeleteCostUnitResponseBodyData data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCostUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostUnitResponseBody self = new DeleteCostUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCostUnitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCostUnitResponseBody setData(DeleteCostUnitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteCostUnitResponseBodyData getData() {
        return this.data;
    }

    public DeleteCostUnitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCostUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCostUnitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteCostUnitResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the call is complete.</p>
         */
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        /**
         * <p>The user ID of the cost center owner.</p>
         */
        @NameInMap("OwnerUid")
        public Long ownerUid;

        /**
         * <p>The ID of the cost center.</p>
         */
        @NameInMap("UnitId")
        public Long unitId;

        public static DeleteCostUnitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCostUnitResponseBodyData self = new DeleteCostUnitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteCostUnitResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public DeleteCostUnitResponseBodyData setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public DeleteCostUnitResponseBodyData setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

    }

}
