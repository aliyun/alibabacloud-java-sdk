// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingSkillJobPageRequest extends TeaModel {
    /**
     * <p>The list of component IDs used to filter profiling tasks by multiple data source components.</p>
     */
    @NameInMap("componentIds")
    public java.util.List<Long> componentIds;

    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3001</p>
     */
    @NameInMap("dsId")
    public Long dsId;

    /**
     * <p>The data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_source_01</p>
     */
    @NameInMap("dsName")
    public String dsName;

    /**
     * <p>The data source type identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>MYSQL</p>
     */
    @NameInMap("dsType")
    public String dsType;

    /**
     * <p>The name of the grouping field used for aggregation.</p>
     * 
     * <strong>example:</strong>
     * <p>dbName</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    /**
     * <p>Specifies whether to display system built-in tasks.</p>
     */
    @NameInMap("isDisplaySystemTask")
    public Boolean isDisplaySystemTask;

    /**
     * <p>The profiling task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100256</p>
     */
    @NameInMap("jobId")
    public Long jobId;

    /**
     * <p>The profiling task name.</p>
     * 
     * <strong>example:</strong>
     * <p>profiling_daily</p>
     */
    @NameInMap("jobName")
    public String jobName;

    /**
     * <p>Specifies whether to return the total number of records.</p>
     */
    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <p>The name of the sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort direction, such as ascending (ASC) or descending (DESC).</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The current page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of records to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListMetaProfilingSkillJobPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingSkillJobPageRequest self = new ListMetaProfilingSkillJobPageRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingSkillJobPageRequest setComponentIds(java.util.List<Long> componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public java.util.List<Long> getComponentIds() {
        return this.componentIds;
    }

    public ListMetaProfilingSkillJobPageRequest setDsId(Long dsId) {
        this.dsId = dsId;
        return this;
    }
    public Long getDsId() {
        return this.dsId;
    }

    public ListMetaProfilingSkillJobPageRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public ListMetaProfilingSkillJobPageRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public ListMetaProfilingSkillJobPageRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ListMetaProfilingSkillJobPageRequest setIsDisplaySystemTask(Boolean isDisplaySystemTask) {
        this.isDisplaySystemTask = isDisplaySystemTask;
        return this;
    }
    public Boolean getIsDisplaySystemTask() {
        return this.isDisplaySystemTask;
    }

    public ListMetaProfilingSkillJobPageRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListMetaProfilingSkillJobPageRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListMetaProfilingSkillJobPageRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ListMetaProfilingSkillJobPageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMetaProfilingSkillJobPageRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListMetaProfilingSkillJobPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingSkillJobPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
