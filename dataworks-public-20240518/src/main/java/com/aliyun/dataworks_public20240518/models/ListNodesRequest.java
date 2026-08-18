// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>Leave this parameter empty if not specified. The filter condition: within the specified container. Specify the container ID. This parameter is not related to the resource group (ResourceGroupId).</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The node name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Filter condition: scheduling type. Valid values:</p>
     * <ul>
     * <li><p>Normal: The node is executed normally.</p>
     * </li>
     * <li><p>Pause: The node status is set to paused, and downstream nodes that depend on the current node are blocked from execution.</p>
     * </li>
     * <li><p>Skip: The node status is set to dry run. The system directly returns a success result (with an execution duration of 0 seconds), does not block downstream node execution, and does not consume resources.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Recurrence")
    public String recurrence;

    /**
     * <p>The rerun property. If not specified, this parameter is left empty. Valid values:</p>
     * <ul>
     * <li><p>Allowed: The node can be rerun regardless of whether it runs successfully or fails.</p>
     * </li>
     * <li><p>FailureAllowed: The node can be rerun only after a failed run, not after a successful run.</p>
     * </li>
     * <li><p>Denied: The node cannot be rerun regardless of whether it runs successfully or fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The scene in which the node resides. Leave this parameter empty if not specified. This parameter corresponds to the partition of the left-side navigation pane in DataStudio. Valid values:</p>
     * <ul>
     * <li><p>DataworksProject: project folder.</p>
     * </li>
     * <li><p>DataworksManualWorkflow: manual workflow.</p>
     * </li>
     * <li><p>DataworksManualTask: manual node.</p>
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
