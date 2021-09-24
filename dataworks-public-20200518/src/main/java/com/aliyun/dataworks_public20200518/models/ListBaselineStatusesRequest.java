// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Bizdate")
    @Validation(required = true)
    public String bizdate;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("TopicId")
    public Long topicId;

    @NameInMap("FinishStatus")
    public String finishStatus;

    @NameInMap("Status")
    public String status;

    @NameInMap("BaselineTypes")
    public String baselineTypes;

    public static ListBaselineStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineStatusesRequest self = new ListBaselineStatusesRequest();
        return TeaModel.build(map, self);
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

    public ListBaselineStatusesRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
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

    public ListBaselineStatusesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListBaselineStatusesRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public ListBaselineStatusesRequest setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
        return this;
    }
    public String getFinishStatus() {
        return this.finishStatus;
    }

    public ListBaselineStatusesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListBaselineStatusesRequest setBaselineTypes(String baselineTypes) {
        this.baselineTypes = baselineTypes;
        return this;
    }
    public String getBaselineTypes() {
        return this.baselineTypes;
    }

}
