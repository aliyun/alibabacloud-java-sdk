// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyCostUnitResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ModifyCostUnitResponseBodyData> data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyCostUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostUnitResponseBody self = new ModifyCostUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCostUnitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyCostUnitResponseBody setData(java.util.List<ModifyCostUnitResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ModifyCostUnitResponseBodyData> getData() {
        return this.data;
    }

    public ModifyCostUnitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCostUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCostUnitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyCostUnitResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the cost center was modified.</p>
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

        public static ModifyCostUnitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyCostUnitResponseBodyData self = new ModifyCostUnitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyCostUnitResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        public ModifyCostUnitResponseBodyData setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public ModifyCostUnitResponseBodyData setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

    }

}
