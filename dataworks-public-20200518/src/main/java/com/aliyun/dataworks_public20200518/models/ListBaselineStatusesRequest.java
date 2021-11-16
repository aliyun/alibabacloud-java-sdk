// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesRequest extends TeaModel {
    @NameInMap("BaselineTypes")
    public String baselineTypes;

    @NameInMap("Bizdate")
    public String bizdate;

    @NameInMap("FinishStatus")
    public String finishStatus;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("Status")
    public String status;

    @NameInMap("TopicId")
    public Long topicId;

    public static ListBaselineStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineStatusesRequest self = new ListBaselineStatusesRequest();
        return TeaModel.build(map, self);
    }

    public ListBaselineStatusesRequest setBaselineTypes(String baselineTypes) {
        this.baselineTypes = baselineTypes;
        return this;
    }
    public String getBaselineTypes() {
        return this.baselineTypes;
    }

    public ListBaselineStatusesRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public ListBaselineStatusesRequest setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
        return this;
    }
    public String getFinishStatus() {
        return this.finishStatus;
    }

    public ListBaselineStatusesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListBaselineStatusesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBaselineStatusesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBaselineStatusesRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ListBaselineStatusesRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public ListBaselineStatusesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListBaselineStatusesRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

}
