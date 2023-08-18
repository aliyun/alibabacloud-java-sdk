// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    @NameInMap("actualState")
    public String actualState;

    @NameInMap("apiType")
    public String apiType;

    @NameInMap("endBeginTs")
    public Long endBeginTs;

    @NameInMap("endEndTs")
    public Long endEndTs;

    @NameInMap("expectState")
    public String expectState;

    @NameInMap("isArchived")
    public Boolean isArchived;

    @NameInMap("jobName")
    public String jobName;

    @NameInMap("jobType")
    public String jobType;

    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("startBeginTs")
    public Long startBeginTs;

    @NameInMap("startEndTs")
    public Long startEndTs;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRequest setActualState(String actualState) {
        this.actualState = actualState;
        return this;
    }
    public String getActualState() {
        return this.actualState;
    }

    public ListInstanceRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public ListInstanceRequest setEndBeginTs(Long endBeginTs) {
        this.endBeginTs = endBeginTs;
        return this;
    }
    public Long getEndBeginTs() {
        return this.endBeginTs;
    }

    public ListInstanceRequest setEndEndTs(Long endEndTs) {
        this.endEndTs = endEndTs;
        return this;
    }
    public Long getEndEndTs() {
        return this.endEndTs;
    }

    public ListInstanceRequest setExpectState(String expectState) {
        this.expectState = expectState;
        return this;
    }
    public String getExpectState() {
        return this.expectState;
    }

    public ListInstanceRequest setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }
    public Boolean getIsArchived() {
        return this.isArchived;
    }

    public ListInstanceRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListInstanceRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListInstanceRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceRequest setStartBeginTs(Long startBeginTs) {
        this.startBeginTs = startBeginTs;
        return this;
    }
    public Long getStartBeginTs() {
        return this.startBeginTs;
    }

    public ListInstanceRequest setStartEndTs(Long startEndTs) {
        this.startEndTs = startEndTs;
        return this;
    }
    public Long getStartEndTs() {
        return this.startEndTs;
    }

}
