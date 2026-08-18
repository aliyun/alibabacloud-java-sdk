// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The information about the deployment process.</p>
     */
    @NameInMap("Pipeline")
    public GetPipelineRunResponseBodyPipeline pipeline;

    /**
     * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>08468352-032C-5262-AEDC-68C9FA05XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunResponseBody self = new GetPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunResponseBody setPipeline(GetPipelineRunResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetPipelineRunResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public GetPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPipelineRunResponseBodyPipelineStages extends TeaModel {
        /**
         * <p>The code of the deployment stage.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV_CHECK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Phase description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The detailed information about the stage.</p>
         */
        @NameInMap("Detail")
        public java.util.Map<String, ?> detail;

        /**
         * <p>The exception message of the deployment stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Exception information XXX</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Publish package build</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the deployment stage.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Init: Initialization.</li>
         * <li>Running: Running.</li>
         * <li>Success: Succeeded.</li>
         * <li>Fail: Failed.</li>
         * <li>Termination: Terminated.</li>
         * <li>Cancel: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The step number of the deployment stage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        /**
         * <p>The type of the deployment stage.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Deploy: deploy operation</li>
         * <li>Check: check operation</li>
         * <li>Offline: offline operation</li>
         * <li>Build: build operation</li>
         * <li>Delete: delete operation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Check</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetPipelineRunResponseBodyPipelineStages build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipelineStages self = new GetPipelineRunResponseBodyPipelineStages();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipelineStages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPipelineRunResponseBodyPipelineStages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPipelineRunResponseBodyPipelineStages setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public GetPipelineRunResponseBodyPipelineStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetPipelineRunResponseBodyPipelineStages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineRunResponseBodyPipelineStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineRunResponseBodyPipelineStages setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public GetPipelineRunResponseBodyPipelineStages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineRunResponseBodyPipeline extends TeaModel {
        /**
         * <p>The timestamp when the deployment package was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1724984066000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the deployment process.</p>
         * 
         * <strong>example:</strong>
         * <p>137946317766XXXX</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description of the deployment process.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployment process description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the deployment process.</p>
         * 
         * <strong>example:</strong>
         * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The error message returned when the deployment fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Error message</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The modification time.</p>
         * <p>The value is a 13-digit number, such as <code>1724984066000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1724984066000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>56160</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The stage details.</p>
         */
        @NameInMap("Stages")
        public java.util.List<GetPipelineRunResponseBodyPipelineStages> stages;

        /**
         * <p>The status of the deployment process.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Init: Initialization.</li>
         * <li>Running: Running.</li>
         * <li>Success: Succeeded.</li>
         * <li>Fail: Failed.</li>
         * <li>Termination: Terminated.</li>
         * <li>Cancel: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetPipelineRunResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunResponseBodyPipeline self = new GetPipelineRunResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunResponseBodyPipeline setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineRunResponseBodyPipeline setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetPipelineRunResponseBodyPipeline setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPipelineRunResponseBodyPipeline setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPipelineRunResponseBodyPipeline setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetPipelineRunResponseBodyPipeline setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetPipelineRunResponseBodyPipeline setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetPipelineRunResponseBodyPipeline setStages(java.util.List<GetPipelineRunResponseBodyPipelineStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetPipelineRunResponseBodyPipelineStages> getStages() {
            return this.stages;
        }

        public GetPipelineRunResponseBodyPipeline setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
