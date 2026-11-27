// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddInboundNumberResponseBody extends TeaModel {
    /**
     * <p>The detailed reason for the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<AddInboundNumberResponseBodyData> data;

    /**
     * <p>The status code description.</p>
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
     * <p>D6A51251-F7C4-596A-9F45-3C3219A5450D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddInboundNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddInboundNumberResponseBody self = new AddInboundNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddInboundNumberResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddInboundNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddInboundNumberResponseBody setData(java.util.List<AddInboundNumberResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddInboundNumberResponseBodyData> getData() {
        return this.data;
    }

    public AddInboundNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddInboundNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddInboundNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddInboundNumberResponseBodyData extends TeaModel {
        /**
         * <p>The inbound phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>234234238**33</p>
         */
        @NameInMap("InboundNumber")
        public String inboundNumber;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid number</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the inbound number was added successfully. Valid values:</p>
         * <ul>
         * <li>true: Added successfully.</li>
         * <li>false: Failed to add.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Result")
        public Boolean result;

        public static AddInboundNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddInboundNumberResponseBodyData self = new AddInboundNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddInboundNumberResponseBodyData setInboundNumber(String inboundNumber) {
            this.inboundNumber = inboundNumber;
            return this;
        }
        public String getInboundNumber() {
            return this.inboundNumber;
        }

        public AddInboundNumberResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddInboundNumberResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
