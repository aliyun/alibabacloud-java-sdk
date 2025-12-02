// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMvRecommendSubTasksRequest extends TeaModel {
    /**
     * <p>Fixed system value (non-modifiable).</p>
     */
    @NameInMap("ActionInner")
    public String actionInner;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Fixed system value (non-modifiable).</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The sorting field. Valid values for Type:</p>
     * <ul>
     * <li>Asc.</li>
     * <li>Desc.</li>
     * </ul>
     * <p>Valid values for Field:</p>
     * <ul>
     * <li>StartTime;</li>
     * <li>EndTime;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Type\&quot;: \&quot;ASC\&quot;, \&quot;Field\&quot;: \&quot;StartTime\&quot;}</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The subtask ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SubtaskId")
    public Long subtaskId;

    /**
     * <p>The name of the recommendation task.</p>
     * 
     * <strong>example:</strong>
     * <p>my_task_1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeMvRecommendSubTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMvRecommendSubTasksRequest self = new DescribeMvRecommendSubTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMvRecommendSubTasksRequest setActionInner(String actionInner) {
        this.actionInner = actionInner;
        return this;
    }
    public String getActionInner() {
        return this.actionInner;
    }

    public DescribeMvRecommendSubTasksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeMvRecommendSubTasksRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeMvRecommendSubTasksRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeMvRecommendSubTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMvRecommendSubTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMvRecommendSubTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMvRecommendSubTasksRequest setSubtaskId(Long subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }
    public Long getSubtaskId() {
        return this.subtaskId;
    }

    public DescribeMvRecommendSubTasksRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
