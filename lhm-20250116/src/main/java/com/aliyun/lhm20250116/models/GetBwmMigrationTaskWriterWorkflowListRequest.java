// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationTaskWriterWorkflowListRequest extends TeaModel {
    /**
     * <p>The submit instance identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The workflow name.</p>
     * 
     * <strong>example:</strong>
     * <p>workflow_name</p>
     */
    @NameInMap("workflowName")
    public String workflowName;

    public static GetBwmMigrationTaskWriterWorkflowListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationTaskWriterWorkflowListRequest self = new GetBwmMigrationTaskWriterWorkflowListRequest();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationTaskWriterWorkflowListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetBwmMigrationTaskWriterWorkflowListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetBwmMigrationTaskWriterWorkflowListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetBwmMigrationTaskWriterWorkflowListRequest setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

}
