// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTaskRequest extends TeaModel {
    /**
     * <p>The ID of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1nti25tc7bq5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a4f5c4494dbd6713185d87a97aa53e8</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeSqlLogTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTaskRequest self = new DescribeSqlLogTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSqlLogTaskRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeSqlLogTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlLogTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
