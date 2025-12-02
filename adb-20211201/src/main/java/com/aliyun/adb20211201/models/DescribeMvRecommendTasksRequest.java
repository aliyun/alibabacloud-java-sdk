// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeMvRecommendTasksRequest extends TeaModel {
    /**
     * <p>Fixed system value (non-modifiable).</p>
     */
    @NameInMap("ActionInner")
    public String actionInner;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Fixed system value (non-modifiable).</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
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
     * <p>The name of the recommendation task.</p>
     * 
     * <strong>example:</strong>
     * <p>my_task_1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeMvRecommendTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMvRecommendTasksRequest self = new DescribeMvRecommendTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMvRecommendTasksRequest setActionInner(String actionInner) {
        this.actionInner = actionInner;
        return this;
    }
    public String getActionInner() {
        return this.actionInner;
    }

    public DescribeMvRecommendTasksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeMvRecommendTasksRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeMvRecommendTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMvRecommendTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMvRecommendTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMvRecommendTasksRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
