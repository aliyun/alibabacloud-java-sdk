// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalAgentSSEResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public MultiModalAgentSSEResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MultiModalAgentSSEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiModalAgentSSEResponseBody self = new MultiModalAgentSSEResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiModalAgentSSEResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MultiModalAgentSSEResponseBody setData(MultiModalAgentSSEResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiModalAgentSSEResponseBodyData getData() {
        return this.data;
    }

    public MultiModalAgentSSEResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiModalAgentSSEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MultiModalAgentSSEResponseBodyDataUsage extends TeaModel {
        /**
         * <p>The number of credits consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>1.23</p>
         */
        @NameInMap("Credits")
        public Double credits;

        public static MultiModalAgentSSEResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            MultiModalAgentSSEResponseBodyDataUsage self = new MultiModalAgentSSEResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public MultiModalAgentSSEResponseBodyDataUsage setCredits(Double credits) {
            this.credits = credits;
            return this;
        }
        public Double getCredits() {
            return this.credits;
        }

    }

    public static class MultiModalAgentSSEResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp when the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1783328536</p>
         */
        @NameInMap("Created")
        public Long created;

        /**
         * <p>The value of dataId passed in the API request. This field is not returned if dataId is not specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>dataId-XXX</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>If streaming output is used, this field is null during generation. When generation ends, this field is set to stop if the generation stopped due to a stop token.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <p>The output result.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;违规，原因XX&quot;</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The credits usage.</p>
         */
        @NameInMap("Usage")
        public MultiModalAgentSSEResponseBodyDataUsage usage;

        public static MultiModalAgentSSEResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiModalAgentSSEResponseBodyData self = new MultiModalAgentSSEResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiModalAgentSSEResponseBodyData setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public MultiModalAgentSSEResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public MultiModalAgentSSEResponseBodyData setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public MultiModalAgentSSEResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public MultiModalAgentSSEResponseBodyData setUsage(MultiModalAgentSSEResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public MultiModalAgentSSEResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
