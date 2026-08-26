// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEventSubEventRequest extends TeaModel {
    /**
     * <p>The ID of the subscribed application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9qb1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time, expressed as a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1698201013</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The page number. Valid values: 1 and greater.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of records per page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The start time, expressed as a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1698195600</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The subscribe ID. You can obtain the subscribe ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/2848209.html">CreateEventSub</a> operation by using a parameter query.</p>
     * 
     * <strong>example:</strong>
     * <p>ad53276431c****</p>
     */
    @NameInMap("SubscribeId")
    public String subscribeId;

    public static ListEventSubEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventSubEventRequest self = new ListEventSubEventRequest();
        return TeaModel.build(map, self);
    }

    public ListEventSubEventRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListEventSubEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListEventSubEventRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListEventSubEventRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEventSubEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListEventSubEventRequest setSubscribeId(String subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public String getSubscribeId() {
        return this.subscribeId;
    }

}
