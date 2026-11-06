// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAuthCodeRequest extends TeaModel {
    /**
     * <p>The ID of the application to connect to. When specifying this parameter, you must also provide the matching AppVersionId. If omitted, the application configured in the creation or validation environment is used.</p>
     * 
     * <strong>example:</strong>
     * <p>app-bp1example****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the application version to connect to. This parameter is used together with AppId. This parameter is not the image version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apv-bp1example****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    /**
     * <p>The region compatibility parameter. The destination region of the current connection resource is determined by the execution region of the task. You cannot use this parameter to switch the task region. Omit this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The type of resource to connect to.</p>
     * <ul>
     * <li><strong>BUILDER</strong>: Connects to the creation environment.</li>
     * <li><strong>VALIDATE</strong>: Connects to the validation environment.</li>
     * </ul>
     * <p>The corresponding environment must be created and in a connectable state.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUILDER</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the existing creation or validation task. Create the task and confirm that the corresponding resources are available before calling this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tid-bp1example****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The actual task type. It must match the creation or validation task corresponding to the TaskId. Use the TaskType returned by GetTask. The task must also have connectable creation or validation resources. You cannot obtain an authorization code for distribution or snapshot tasks that do not have connection resources.</p>
     * <p>Recognized task types:</p>
     * <ul>
     * <li><strong>AUTO_CREATE_IMAGE_VHD</strong>: Automatically creates a VHD image.</li>
     * <li><strong>RETRY_CREATE_IMAGE_VHD</strong>: Retries VHD image creation.</li>
     * <li><strong>AUTO_CREATE_VHD</strong>: Automatically creates a VHD.</li>
     * <li><strong>RETRY_VHD</strong>: Retries VHD creation.</li>
     * <li><strong>AUTO_VALIDATE_VHD</strong>: Automatically validates a VHD.</li>
     * <li><strong>RETRY_VALIDATE_VHD</strong>: Retries VHD validation.</li>
     * <li><strong>APPLY_VHD_BUILDER</strong>: Applies for a VHD application recording environment.</li>
     * <li><strong>ADAPT_AUTO</strong>: Automatically creates application adaptation.</li>
     * <li><strong>ADAPT_AUTO_RETRY</strong>: Retries automatic application adaptation creation.</li>
     * <li><strong>ADAPT_MANUAL</strong>: Manually creates application adaptation.</li>
     * <li><strong>ADAPT_MANUAL_RETRY</strong>: Retries manual application adaptation creation.</li>
     * <li><strong>DESKTOP_CUSTOM_IMAGE</strong>: Creates a custom image for cloud desktops.</li>
     * <li><strong>DESKTOP_CUSTOM_IMAGE_RETRY</strong>: Retries custom image creation for cloud desktops.</li>
     * <li><strong>IMAGE_MANUAL</strong>: Manually creates an image.</li>
     * <li><strong>IMAGE_MANUAL_RETRY</strong>: Retries manual image creation.</li>
     * <li><strong>IMAGE_FROM_INSTANCE</strong>: Creates an image based on an instance.</li>
     * <li><strong>IMAGE_FROM_INSTANCE_RETRY</strong>: Retries image creation based on an instance.</li>
     * <li><strong>IMAGE_DISTRIBUTE</strong>: Distributes an image to multiple regions.</li>
     * <li><strong>IMAGE_DISTRIBUTE_RETRY</strong>: Retries image distribution.</li>
     * <li><strong>SNAPSHOT_DISTRIBUTE</strong>: Distributes a snapshot to multiple regions.</li>
     * <li><strong>SNAPSHOT_DISTRIBUTE_RETRY</strong>: Retries snapshot distribution.</li>
     * <li><strong>SNAPSHOT_FROM_DISK</strong>: Creates a snapshot based on a disk.</li>
     * <li><strong>SNAPSHOT_FROM_DISK_RETRY</strong>: Retries snapshot creation based on a disk.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE_MANUAL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetAuthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCodeRequest self = new GetAuthCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAuthCodeRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public GetAuthCodeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetAuthCodeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetAuthCodeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAuthCodeRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
