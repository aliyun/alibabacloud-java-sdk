// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BatchConfigRuntimeChannelResponseBody extends TeaModel {
    /**
     * <p>The list of batch configuration results. Each channel configuration item corresponds to one result.</p>
     */
    @NameInMap("Data")
    public java.util.List<BatchConfigRuntimeChannelResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of configuration results, which is the same as the number of configuration items in ChannelConfigs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static BatchConfigRuntimeChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchConfigRuntimeChannelResponseBody self = new BatchConfigRuntimeChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchConfigRuntimeChannelResponseBody setData(java.util.List<BatchConfigRuntimeChannelResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchConfigRuntimeChannelResponseBodyData> getData() {
        return this.data;
    }

    public BatchConfigRuntimeChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchConfigRuntimeChannelResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class BatchConfigRuntimeChannelResponseBodyData extends TeaModel {
        /**
         * <p>The third-party channel code.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk-connector</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error code returned when the configuration fails. This parameter is returned only when Success is false.</p>
         * 
         * <strong>example:</strong>
         * <p>ConfigFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the configuration fails. This parameter is returned only when Success is false.</p>
         * 
         * <strong>example:</strong>
         * <p>The runtime is not found.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The agent runtime ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xgads</p>
         */
        @NameInMap("RuntimeId")
        public String runtimeId;

        /**
         * <p>Specifies whether the channel configuration item is configured successfully. Valid values:</p>
         * <ul>
         * <li>true: The configuration is successful.</li>
         * <li>false: The configuration failed. For the cause of the failure, see ErrorCode and Message.</li>
         * </ul>
         */
        @NameInMap("Success")
        public Boolean success;

        public static BatchConfigRuntimeChannelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchConfigRuntimeChannelResponseBodyData self = new BatchConfigRuntimeChannelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchConfigRuntimeChannelResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchConfigRuntimeChannelResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchConfigRuntimeChannelResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchConfigRuntimeChannelResponseBodyData setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public BatchConfigRuntimeChannelResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
