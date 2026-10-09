// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The ID of the container. This parameter is used as a filter condition to query nodes in a specified container. If you do not specify this parameter, leave it empty. This parameter is independent of the ResourceGroupId parameter.</p>
     * <blockquote>
     * <p>Notice: Before SDK version 8.0.0, this field is of the Long type. In SDK version 8.0.0 and later, this field is of the String type. <strong>This change does not affect the normal use of the SDK, and the parameter is still returned based on the type defined in the SDK</strong>. However, if you upgrade the SDK across version 8.0.0, the type change may cause project compilation failures. In this case, you must manually correct the data type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The name of the node. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the requested data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The scheduling type. This parameter is used as a filter condition. Valid values: </p>
     * <ul>
     * <li><p>Normal: The node runs as expected.</p>
     * </li>
     * <li><p>Pause: The node is paused, and the execution of its downstream nodes is blocked.</p>
     * </li>
     * <li><p>Skip: The node is set to dry run. The system directly returns a success response with an execution duration of 0 seconds. This does not block the execution of downstream nodes or consume resources.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Recurrence")
    public String recurrence;

    /**
     * <p>The rerun mode. If you do not specify this parameter, leave it empty. Valid values: </p>
     * <ul>
     * <li><p>Allowed: The node can be rerun regardless of whether it is successfully run or fails to run.</p>
     * </li>
     * <li><p>FailureAllowed: The node can be rerun only after it fails to run.</p>
     * </li>
     * <li><p>Denied: The node cannot be rerun regardless of whether it is successfully run or fails to run.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The scenario to which the node belongs. This parameter is used as a filter condition. If you do not specify this parameter, leave it empty. In DataStudio, this parameter corresponds to the partitions in the left-side directory tree. Valid values: </p>
     * <ul>
     * <li><p>DataworksProject: project directory.</p>
     * </li>
     * <li><p>DataworksManualWorkflow: manual workflow. </p>
     * </li>
     * <li><p>DataworksManualTask: manual task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DataworksProject</p>
     */
    @NameInMap("Scene")
    public String scene;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public ListNodesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListNodesRequest setRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public String getRecurrence() {
        return this.recurrence;
    }

    public ListNodesRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public ListNodesRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
