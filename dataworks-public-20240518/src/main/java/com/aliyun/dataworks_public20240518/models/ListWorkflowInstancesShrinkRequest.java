// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListWorkflowInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The business date. This is generally 00:00:00 of the day before the scheduled instance trigger time, in millisecond-level timestamp format, such as 1743350400000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("BizDate")
    public Long bizDate;

    /**
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The filter. In JSON format, multiple filter conditions have an AND relationship. Currently supported fields are: <code>status, executionDate</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{<br>    &quot;status&quot;: &quot;Success&quot;,
     *     &quot;executionDate&quot;: &quot;1763481600000&quot;
     * }</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The list of workflow instance IDs. You can use this parameter to query multiple workflow instances at a time.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>The name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowInstance1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The account ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number, starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of sort fields. Sorting by trigger time, start time, and other fields is supported. The format is &quot;sort field + sort order (Desc/Asc)&quot; (Asc can be omitted). Valid values of the sort field:</p>
     * <ul>
     * <li><p>TriggerTime (Desc/Asc)</p>
     * </li>
     * <li><p>StartedTime (Desc/Asc)</p>
     * </li>
     * <li><p>FinishedTime (Desc/Asc)</p>
     * </li>
     * <li><p>CreateTime (Desc/Asc)</p>
     * </li>
     * <li><p>Id (Desc/Asc)</p>
     * </li>
     * </ul>
     * <p>Default value: Id Desc</p>
     * 
     * <strong>example:</strong>
     * <p>Id Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The list of tags. Results are returned if any one of the specified tags is matched.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The type of the workflow instance.</p>
     * <ul>
     * <li><p>Normal: Periodic scheduling</p>
     * </li>
     * <li><p>Manual: Manual task</p>
     * </li>
     * <li><p>SmokeTest: Testing</p>
     * </li>
     * <li><p>SupplementData: Backfill data</p>
     * </li>
     * <li><p>ManualWorkflow: Manual workflow</p>
     * </li>
     * <li><p>TriggerWorkflow: Trigger-based workflow</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The unified workflow instance ID. All workflow instances within the same business date of a single trigger share the same value for this field.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("UnifiedWorkflowInstanceId")
    public Long unifiedWorkflowInstanceId;

    /**
     * <p>The ID of the workflow to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static ListWorkflowInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstancesShrinkRequest self = new ListWorkflowInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstancesShrinkRequest setBizDate(Long bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public Long getBizDate() {
        return this.bizDate;
    }

    public ListWorkflowInstancesShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListWorkflowInstancesShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListWorkflowInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public ListWorkflowInstancesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWorkflowInstancesShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListWorkflowInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkflowInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkflowInstancesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListWorkflowInstancesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListWorkflowInstancesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListWorkflowInstancesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListWorkflowInstancesShrinkRequest setUnifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
        this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
        return this;
    }
    public Long getUnifiedWorkflowInstanceId() {
        return this.unifiedWorkflowInstanceId;
    }

    public ListWorkflowInstancesShrinkRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}
