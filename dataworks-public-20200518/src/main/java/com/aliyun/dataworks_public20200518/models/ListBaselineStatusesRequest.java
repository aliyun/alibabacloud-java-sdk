// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesRequest extends TeaModel {
    /**
     * <p>The type of the baseline. Valid values: DAILY and HOURLY. The value DAILY indicates that the baseline is scheduled by day. The value HOURLY indicates that the baseline is scheduled by hour. Multiple types are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY,HOURLY</p>
     */
    @NameInMap("BaselineTypes")
    public String baselineTypes;

    /**
     * <p>The data timestamp of the baseline instance. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-07T00:00:00+0800</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The status of the baseline instance. Valid values: UNFINISH and FINISH. The value UNFINISH indicates that the baseline instance is still running. The value FINISH indicates that the baseline instance finishes running. Multiple states are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>FINISH,UNFINISH</p>
     */
    @NameInMap("FinishStatus")
    public String finishStatus;

    /**
     * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
     * 
     * <strong>example:</strong>
     * <p>9527952795****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of the page to return. Valid values: 1 to 30. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8. Multiple priorities are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,3,5,7,8</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The keyword of the baseline name used to search for the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>Keyword of the baseline name</p>
     */
    @NameInMap("SearchText")
    public String searchText;

    /**
     * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes finish running before the alerting time. The value DANGEROUS indicates that nodes are still running after the alerting time but before the committed completion time. The value OVER indicates that nodes are still running after the committed completion time. Multiple states are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>SAFE,DANGROUS,OVER</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
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
