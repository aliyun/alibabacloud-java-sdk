// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCrossProjectPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The business response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PipelineRunId&quot;:&quot;fcfd4160-e2ff-4603-9719-09128fe733df&quot;}</p>
     */
    @NameInMap("Data")
    public CreateCrossProjectPipelineRunResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCrossProjectPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCrossProjectPipelineRunResponseBody self = new CreateCrossProjectPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCrossProjectPipelineRunResponseBody setData(CreateCrossProjectPipelineRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCrossProjectPipelineRunResponseBodyData getData() {
        return this.data;
    }

    public CreateCrossProjectPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCrossProjectPipelineRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCrossProjectPipelineRunResponseBodyData extends TeaModel {
        /**
         * <p>The cross-workspace deployment flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fcfd4160-e2ff-4603-9719-09128fe733df</p>
         */
        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static CreateCrossProjectPipelineRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCrossProjectPipelineRunResponseBodyData self = new CreateCrossProjectPipelineRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCrossProjectPipelineRunResponseBodyData setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public CreateCrossProjectPipelineRunResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
