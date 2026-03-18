// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryStorageMetricRequest extends TeaModel {
    /**
     * <p>The names of the projects.</p>
     */
    @NameInMap("projectList")
    public java.util.List<String> projectList;

    /**
     * <p>The storage class. Valid values include the following:</p>
     * <ul>
     * <li><p>totalStorage</p>
     * </li>
     * <li><p>longTermStorage</p>
     * </li>
     * <li><p>lowFreqStorage</p>
     * </li>
     * <li><p>standardStorage</p>
     * </li>
     * <li><p>recycleBinStorage</p>
     * </li>
     * </ul>
     */
    @NameInMap("typeList")
    public java.util.List<String> typeList;

    /**
     * <p>The end of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735536322</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735534322</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static QueryStorageMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageMetricRequest self = new QueryStorageMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryStorageMetricRequest setProjectList(java.util.List<String> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<String> getProjectList() {
        return this.projectList;
    }

    public QueryStorageMetricRequest setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

    public QueryStorageMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryStorageMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
