// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPipelineResponseBody extends TeaModel {
    /**
     * <p>The information about the MPS queue.</p>
     */
    @NameInMap("Pipeline")
    public GetPipelineResponseBodyPipeline pipeline;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineResponseBody self = new GetPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineResponseBody setPipeline(GetPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public GetPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPipelineResponseBodyPipeline extends TeaModel {
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the template was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-12T16:17:54Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The name of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pipeline</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the MPS queue. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of the MPS queue.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Standard: standard MPS queue.</li>
         * <li>Boost: MPS queue with transcoding speed boosted.</li>
         * <li>NarrowBandHDV2: MPS queue that supports Narrowband HD 2.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("Speed")
        public String speed;

        /**
         * <p>The state of the MPS queue.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Paused</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipeline self = new GetPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipeline setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPipelineResponseBodyPipeline setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineResponseBodyPipeline setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetPipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetPipelineResponseBodyPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public GetPipelineResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
