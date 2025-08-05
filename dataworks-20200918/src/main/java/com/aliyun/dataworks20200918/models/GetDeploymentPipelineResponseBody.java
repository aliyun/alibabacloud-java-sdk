// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDeploymentPipelineResponseBody extends TeaModel {
    @NameInMap("Pipeline")
    public GetDeploymentPipelineResponseBodyPipeline pipeline;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeploymentPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentPipelineResponseBody self = new GetDeploymentPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentPipelineResponseBody setPipeline(GetDeploymentPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetDeploymentPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public GetDeploymentPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeploymentPipelineResponseBodyPipelineStages extends TeaModel {
        /**
         * <p>阶段代号</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>阶段描述</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>阶段信息</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>阶段名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>阶段状态</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>步骤</p>
         */
        @NameInMap("Step")
        public Integer step;

        /**
         * <p>阶段类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDeploymentPipelineResponseBodyPipelineStages build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentPipelineResponseBodyPipelineStages self = new GetDeploymentPipelineResponseBodyPipelineStages();
            return TeaModel.build(map, self);
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public GetDeploymentPipelineResponseBodyPipelineStages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDeploymentPipelineResponseBodyPipeline extends TeaModel {
        /**
         * <p>发布包创建时间戳</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>创建人</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>发布流程Id</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        /**
         * <p>修改时间</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>步骤详情</p>
         */
        @NameInMap("Stages")
        public java.util.List<GetDeploymentPipelineResponseBodyPipelineStages> stages;

        /**
         * <p>发布流程状态</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDeploymentPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentPipelineResponseBodyPipeline self = new GetDeploymentPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public GetDeploymentPipelineResponseBodyPipeline setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeploymentPipelineResponseBodyPipeline setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDeploymentPipelineResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeploymentPipelineResponseBodyPipeline setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDeploymentPipelineResponseBodyPipeline setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDeploymentPipelineResponseBodyPipeline setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDeploymentPipelineResponseBodyPipeline setStages(java.util.List<GetDeploymentPipelineResponseBodyPipelineStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetDeploymentPipelineResponseBodyPipelineStages> getStages() {
            return this.stages;
        }

        public GetDeploymentPipelineResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
