// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListNodesRequest extends TeaModel {
    /**
     * <p>The container ID. This parameter specifies a filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("ContainerId")
    public Long containerId;

    /**
     * <p>The page number.</p>
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
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Recurrence")
    public String recurrence;

    /**
     * <p>The rerun mode. Valid values:</p>
     * <ul>
     * <li>Allowed: The nodes can be rerun regardless of whether they are successfully run or fail to run.</li>
     * <li>FailureAllowed: The nodes can be rerun only after they fail to run.</li>
     * <li>Denied: The nodes cannot be rerun regardless of whether they are successfully run or fail to run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allowed</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <p>The scene of nodes. This parameter specifies a filter condition.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DATAWORKS_PROJECT</li>
     * <li>MANUAL_WORKFLOW</li>
     * <li>MANUAL_NODE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DATAWORKS_PROJECT</p>
     */
    @NameInMap("Scene")
    public String scene;

    public static ListNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesRequest self = new ListNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesRequest setContainerId(Long containerId) {
        this.containerId = containerId;
        return this;
    }
    public Long getContainerId() {
        return this.containerId;
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
