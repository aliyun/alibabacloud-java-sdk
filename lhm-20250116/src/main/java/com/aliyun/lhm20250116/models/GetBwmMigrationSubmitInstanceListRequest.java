// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationSubmitInstanceListRequest extends TeaModel {
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
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>The conversion task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetBwmMigrationSubmitInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationSubmitInstanceListRequest self = new GetBwmMigrationSubmitInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationSubmitInstanceListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetBwmMigrationSubmitInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetBwmMigrationSubmitInstanceListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetBwmMigrationSubmitInstanceListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
