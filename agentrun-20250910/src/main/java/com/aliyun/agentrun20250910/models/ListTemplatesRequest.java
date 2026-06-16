// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The status of the template. Use this parameter to filter templates.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The name of the template. Use this parameter to filter templates.</p>
     * 
     * <strong>example:</strong>
     * <p>temp-abc</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The type of the template. Use this parameter to filter templates.</p>
     * 
     * <strong>example:</strong>
     * <p>Browser</p>
     */
    @NameInMap("templateType")
    public String templateType;

    /**
     * <p>The ID of the workspace to which the template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>The IDs of the workspaces. You can use this parameter to query templates from multiple workspaces.</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ListTemplatesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListTemplatesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
