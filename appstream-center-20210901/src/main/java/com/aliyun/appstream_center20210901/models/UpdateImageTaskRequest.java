// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateImageTaskRequest extends TeaModel {
    /**
     * <p><strong>Not enabled. Do not pass this parameter.</strong> The task region is determined by the associated creation resource. This parameter is not used to switch regions.</p>
     * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Not applicable (not enabled)</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p><strong>Not enabled. Do not pass this parameter.</strong> This parameter is not involved in task status updates.</p>
     * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Not applicable (not enabled)</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status identifier reported by the creation resource. It must match the task type and the current creation stage. You cannot directly use the overall task status from GetTask as a substitute.</p>
     * <p>Valid values for image creation tasks (IMAGE_MANUAL and IMAGE_MANUAL_RETRY):</p>
     * <ul>
     * <li><strong>BUILDER_INIT_SUCCESS</strong>: The creation environment is initialized.</li>
     * <li><strong>DOWNLOAD_SUCCESS</strong>: The creation resources are downloaded.</li>
     * <li><strong>DOWNLOAD_FAILED</strong>: The creation resources fail to be downloaded.</li>
     * <li><strong>BUILD_START</strong>: The image creation starts.</li>
     * <li><strong>BUILD_SUCCESS</strong>: The application installation and image configuration are successful.</li>
     * <li><strong>BUILD_FAILED</strong>: The application installation or image configuration fails.</li>
     * <li><strong>BUILD_COMPLETE</strong>: The creation is completed and the subsequent verification process starts.</li>
     * <li><strong>BUILD_COMPLETE_SKIP_VALIDATE</strong>: The creation is completed in compatibility mode. Whether subsequent verification is performed is subject to the task query result.</li>
     * </ul>
     * <p>Valid values for application adaptation tasks:</p>
     * <ul>
     * <li><strong>BUILDER_INIT_SUCCESS</strong>: The creation environment is initialized.</li>
     * <li><strong>DOWNLOAD_SUCCESS</strong>: The application resources are downloaded.</li>
     * <li><strong>DOWNLOAD_FAILED</strong>: The application resources fail to be downloaded.</li>
     * <li><strong>BUILD_START</strong>: The application recording starts.</li>
     * <li><strong>BUILD_SUCCESS</strong>: The application recording is successful.</li>
     * <li><strong>BUILD_FAILED</strong>: The application recording fails.</li>
     * <li><strong>NAS_DISPATCH_SUCCESS</strong>: The application files are distributed to NAS.</li>
     * <li><strong>NAS_DISPATCH_FAILED</strong>: The application files fail to be distributed to NAS.</li>
     * <li><strong>OSS_UPLOAD_SUCCESS</strong>: The application files are uploaded to OSS.</li>
     * <li><strong>OSS_UPLOAD_FAILED</strong>: The application files fail to be uploaded to OSS.</li>
     * <li><strong>UPLOAD_SUCCESS</strong>: The application files are uploaded.</li>
     * <li><strong>UPLOAD_FAILED</strong>: The application files fail to be uploaded.</li>
     * <li><strong>BUILD_COMPLETE</strong>: The application creation is completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUILD_START</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task to be updated. The task and its creation resource must already exist.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tid-bp1example****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p><strong>Not enabled. Do not pass this parameter.</strong> This parameter is not supported for updating the task step.</p>
     * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Not applicable (not enabled)</p>
     */
    @NameInMap("TaskStep")
    public String taskStep;

    /**
     * <p>The actual type of the task to be updated. It must match the task corresponding to TaskId. Status updates support the following application adaptation and manual image creation tasks:</p>
     * <ul>
     * <li><strong>ADAPT_AUTO</strong>: Creates an application adaptation automatically.</li>
     * <li><strong>ADAPT_AUTO_RETRY</strong>: Retries the automatic application adaptation.</li>
     * <li><strong>ADAPT_MANUAL</strong>: Creates an application adaptation manually.</li>
     * <li><strong>ADAPT_MANUAL_RETRY</strong>: Retries the manual application adaptation.</li>
     * <li><strong>IMAGE_MANUAL</strong>: Creates an image manually.</li>
     * <li><strong>IMAGE_MANUAL_RETRY</strong>: Retries the manual image creation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_MANUAL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p><strong>Not enabled. Do not pass this parameter.</strong> This parameter is not supported for modifying the image version associated with the task.</p>
     * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Not applicable (not enabled)</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static UpdateImageTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageTaskRequest self = new UpdateImageTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageTaskRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public UpdateImageTaskRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateImageTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateImageTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateImageTaskRequest setTaskStep(String taskStep) {
        this.taskStep = taskStep;
        return this;
    }
    public String getTaskStep() {
        return this.taskStep;
    }

    public UpdateImageTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public UpdateImageTaskRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
