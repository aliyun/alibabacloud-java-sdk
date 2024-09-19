// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDeploymentResponseBody extends TeaModel {
    @NameInMap("Pipeline")
    public GetDeploymentResponseBodyPipeline pipeline;

    /**
     * <strong>example:</strong>
     * <p>08468352-032C-5262-AEDC-68C9FA05XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponseBody self = new GetDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponseBody setPipeline(GetDeploymentResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetDeploymentResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public GetDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeploymentResponseBodyPipelineStages extends TeaModel {
        /**
         * <p>阶段代号</p>
         * 
         * <strong>example:</strong>
         * <p>DEV_CHECK</p>
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
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>步骤</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        /**
         * <p>阶段类型</p>
         * 
         * <strong>example:</strong>
         * <p>BUILD</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDeploymentResponseBodyPipelineStages build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseBodyPipelineStages self = new GetDeploymentResponseBodyPipelineStages();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseBodyPipelineStages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDeploymentResponseBodyPipelineStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDeploymentResponseBodyPipelineStages setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public GetDeploymentResponseBodyPipelineStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDeploymentResponseBodyPipelineStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeploymentResponseBodyPipelineStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeploymentResponseBodyPipelineStages setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public GetDeploymentResponseBodyPipelineStages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDeploymentResponseBodyPipeline extends TeaModel {
        /**
         * <p>发布包创建时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1724984066000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>创建人</p>
         * 
         * <strong>example:</strong>
         * <p>137946317766XXXX</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>发布流程Id</p>
         * 
         * <strong>example:</strong>
         * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        /**
         * <p>修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1724984066000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>56160</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>步骤详情</p>
         */
        @NameInMap("Stages")
        public java.util.List<GetDeploymentResponseBodyPipelineStages> stages;

        /**
         * <p>发布流程状态</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetDeploymentResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseBodyPipeline self = new GetDeploymentResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseBodyPipeline setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeploymentResponseBodyPipeline setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDeploymentResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeploymentResponseBodyPipeline setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDeploymentResponseBodyPipeline setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDeploymentResponseBodyPipeline setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetDeploymentResponseBodyPipeline setStages(java.util.List<GetDeploymentResponseBodyPipelineStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetDeploymentResponseBodyPipelineStages> getStages() {
            return this.stages;
        }

        public GetDeploymentResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
