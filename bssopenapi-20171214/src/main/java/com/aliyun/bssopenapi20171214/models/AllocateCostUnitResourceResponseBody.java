// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AllocateCostUnitResourceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AllocateCostUnitResourceResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>845C629F-47A7-4F46-A470-ED5047C4C250</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
        /**
         * <p>Indicates whether resources are allocated to the specified cost center. Valid values:</p>
         * <ul>
         * <li>true: The resources are allocated to the specified cost center.</li>
         * <li>false: The resources fail to be allocated to the specified cost center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        /**
         * <p>The ID of the destination cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>32857346527</p>
         */
        @NameInMap("ToUnitId")
        public Long toUnitId;

        /**
         * <p>The user ID of the owner of the destination cost center.</p>
         * 
         * <strong>example:</strong>
         * <p>34857693874</p>
         */
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
