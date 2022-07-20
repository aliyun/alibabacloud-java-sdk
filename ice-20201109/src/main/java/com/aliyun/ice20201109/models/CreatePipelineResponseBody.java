// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreatePipelineResponseBody extends TeaModel {
    // 管道信息
    @NameInMap("Pipeline")
    public CreatePipelineResponseBodyPipeline pipeline;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineResponseBody self = new CreatePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineResponseBody setPipeline(CreatePipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public CreatePipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public CreatePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePipelineResponseBodyPipeline extends TeaModel {
        // 模板创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 模板修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 管道名称
        @NameInMap("Name")
        public String name;

        // 管道Id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 管道优先级
        @NameInMap("Priority")
        public Integer priority;

        // 管道类型
        @NameInMap("Speed")
        public String speed;

        // 管道状态
        @NameInMap("Status")
        public String status;

        public static CreatePipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineResponseBodyPipeline self = new CreatePipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public CreatePipelineResponseBodyPipeline setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreatePipelineResponseBodyPipeline setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreatePipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePipelineResponseBodyPipeline setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public CreatePipelineResponseBodyPipeline setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreatePipelineResponseBodyPipeline setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public CreatePipelineResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
