// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListWorkflowDefinitionsRequest extends TeaModel {
    /**
     * <p>The name of the workflow. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the owner, which is the UID of the workspace administrator account. You can log on to the Alibaba Cloud Management Console and view the account UID on the Security Settings page of Account Management.</p>
     * 
     * <strong>example:</strong>
     * <p>110755000425XXXX</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of the page to return.</p>
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
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Configuration page to obtain the workspace ID.</p>
     * <p>This parameter specifies the DataWorks workspace for the current API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the workflow. This parameter is used as a filter condition. If you do not specify this parameter, the default value is CycleWorkflow. Valid values:</p>
     * <ul>
     * <li>CycleWorkflow</li>
     * <li>ManualWorkflow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CycleWorkflow</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListWorkflowDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowDefinitionsRequest self = new ListWorkflowDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowDefinitionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWorkflowDefinitionsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListWorkflowDefinitionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkflowDefinitionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowDefinitionsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListWorkflowDefinitionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
