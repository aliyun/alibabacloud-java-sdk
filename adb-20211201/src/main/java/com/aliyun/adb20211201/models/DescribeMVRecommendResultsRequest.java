// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMVRecommendResultsRequest extends TeaModel {
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
     * <p>The sorting field.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;AcceleratedQueriesCount&quot;}</p>
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
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SubQueryId")
    public Long subQueryId;

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
     * <p>task_n1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeMVRecommendResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMVRecommendResultsRequest self = new DescribeMVRecommendResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMVRecommendResultsRequest setActionInner(String actionInner) {
        this.actionInner = actionInner;
        return this;
    }
    public String getActionInner() {
        return this.actionInner;
    }

    public DescribeMVRecommendResultsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeMVRecommendResultsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeMVRecommendResultsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeMVRecommendResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMVRecommendResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMVRecommendResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMVRecommendResultsRequest setSubQueryId(Long subQueryId) {
        this.subQueryId = subQueryId;
        return this;
    }
    public Long getSubQueryId() {
        return this.subQueryId;
    }

    public DescribeMVRecommendResultsRequest setSubtaskId(Long subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }
    public Long getSubtaskId() {
        return this.subtaskId;
    }

    public DescribeMVRecommendResultsRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
