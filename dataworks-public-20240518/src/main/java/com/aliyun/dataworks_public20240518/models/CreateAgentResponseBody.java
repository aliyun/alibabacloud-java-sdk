// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentResponseBody extends TeaModel {
    /**
     * <p>Details of the created Agent.</p>
     */
    @NameInMap("Agent")
    public CreateAgentResponseBodyAgent agent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResponseBody self = new CreateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentResponseBody setAgent(CreateAgentResponseBodyAgent agent) {
        this.agent = agent;
        return this;
    }
    public CreateAgentResponseBodyAgent getAgent() {
        return this.agent;
    }

    public CreateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAgentResponseBodyAgent extends TeaModel {
        /**
         * <p>The creation time (millisecond timestamp).</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last modification time (millisecond timestamp).</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The name of the Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateAgentResponseBodyAgent build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResponseBodyAgent self = new CreateAgentResponseBodyAgent();
            return TeaModel.build(map, self);
        }

        public CreateAgentResponseBodyAgent setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public CreateAgentResponseBodyAgent setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public CreateAgentResponseBodyAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
