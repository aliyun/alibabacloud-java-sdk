// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSchedulesRequest extends TeaModel {
    /**
     * <p>The name of the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChannel</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The time window of the program schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14400</p>
     */
    @NameInMap("WindowDurationSeconds")
    public Long windowDurationSeconds;

    public static ListSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesRequest self = new ListSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSchedulesRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ListSchedulesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSchedulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSchedulesRequest setWindowDurationSeconds(Long windowDurationSeconds) {
        this.windowDurationSeconds = windowDurationSeconds;
        return this;
    }
    public Long getWindowDurationSeconds() {
        return this.windowDurationSeconds;
    }

}
