// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The ID of the container. If you specify this parameter, only nodes in the specified container are returned. This parameter is independent of the resource group (ResourceGroupId).</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is of the Long type in SDK versions earlier than 8.0.0 and of the String type in SDK 8.0.0 and later. <strong>This change does not affect SDK usage. The parameter is returned in the type defined for your SDK version.</strong> The type change may cause compilation errors only when you upgrade the SDK across version 8.0.0. In this case, you must manually correct the data type.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The node name. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. To find this ID, log in to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Filters nodes by their scheduling type. Valid values:</p>
     * <ul>
     * <li><p>Normal: The node runs as scheduled.</p>
     * </li>
     * <li><p>Pause: The node is paused and blocks its dependent downstream nodes.</p>
     * </li>
     * <li><p>Skip: The node is skipped, and the system immediately returns a success status with a 0-second execution time. This action does not block downstream nodes or consume resources.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Recurrence")
    public String recurrence;

    /**
     * <p>The rerun mode. Valid values:</p>
     * <ul>
     * <li><p>Allowed: The node can be rerun regardless of whether it succeeded or failed.</p>
     * </li>
     * <li><p>FailureAllowed: The node can be rerun only if its previous run failed.</p>
     * </li>
     * <li><p>Denied: The node cannot be rerun regardless of whether it succeeded or failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The context for filtering nodes. In data development, this corresponds to the sections in the directory tree on the left. If you omit this parameter, no filtering is applied. Valid values:</p>
     * <ul>
     * <li><p>DataworksProject: Nodes in the project directory.</p>
     * </li>
     * <li><p>DataworksManualWorkflow: manual workflow</p>
     * </li>
     * <li><p>DataworksManualTask: manual task</p>
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
