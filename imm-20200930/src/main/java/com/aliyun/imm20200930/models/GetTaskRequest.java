// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetTaskRequest extends TeaModel {
    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Specifies whether to return the original request parameters used to create the task. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * <p>This parameter takes effect only for the following task types:</p>
     * <ul>
     * <li>MediaConvert</li>
     * <li>VideoLabelClassification</li>
     * <li>FaceClustering</li>
     * <li>FileCompression</li>
     * <li>ArchiveFileInspection</li>
     * <li>FileUncompression</li>
     * <li>PointCloudCompress</li>
     * <li>ImageToPDF</li>
     * <li>StoryCreation</li>
     * <li>LocationDateClustering</li>
     * <li>ImageSplicing</li>
     * <li>FacesSearching.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RequestDefinition")
    public Boolean requestDefinition;

    /**
     * <p>The ID of the task that you want to query. This value is returned when you create the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FileCompression-2f157087-91df-4fda-8c3e-232407ec*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the task. For valid values, see <a href="https://help.aliyun.com/document_detail/2743993.html">Task type list</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FileCompression</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRequest self = new GetTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetTaskRequest setRequestDefinition(Boolean requestDefinition) {
        this.requestDefinition = requestDefinition;
        return this;
    }
    public Boolean getRequestDefinition() {
        return this.requestDefinition;
    }

    public GetTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
