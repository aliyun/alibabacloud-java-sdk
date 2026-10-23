// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListActionRecordsRequest extends TeaModel {
    /**
     * <p>Filters records by the name of the change operation. Separate multiple names with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>RestartInstance</p>
     */
    @NameInMap("actionNames")
    public String actionNames;

    /**
     * <p>The upper bound of the query range for the change start time. The value is a UNIX timestamp in milliseconds. If you do not specify this parameter, the current time is used.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The display type of change records. Default value: ACTION_RECORD.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTION_RECORD</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The page number of the returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Filters records by the ID of the request that triggered the change.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of records returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The lower bound of the query range for the change start time. The value is a UNIX timestamp in milliseconds.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>Filters records by the ID of the user that triggered the change.</p>
     * 
     * <strong>example:</strong>
     * <p>user-123</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ListActionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActionRecordsRequest self = new ListActionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListActionRecordsRequest setActionNames(String actionNames) {
        this.actionNames = actionNames;
        return this;
    }
    public String getActionNames() {
        return this.actionNames;
    }

    public ListActionRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListActionRecordsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListActionRecordsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListActionRecordsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActionRecordsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListActionRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListActionRecordsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
