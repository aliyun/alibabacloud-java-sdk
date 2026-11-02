// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListChannelsRequest extends TeaModel {
    /**
     * <p>The channel name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChannel</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The channel tier.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("ChannelTier")
    public String channelTier;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The playback mode.</p>
     * 
     * <strong>example:</strong>
     * <p>loop</p>
     */
    @NameInMap("PlaybackMode")
    public String playbackMode;

    /**
     * <p>Sorts the results by creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Sorts the results by modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortByModifiedTime")
    public String sortByModifiedTime;

    /**
     * <p>The channel state. Valid values: 0: Stopped. 1: Started.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("State")
    public Integer state;

    public static ListChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChannelsRequest self = new ListChannelsRequest();
        return TeaModel.build(map, self);
    }

    public ListChannelsRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ListChannelsRequest setChannelTier(String channelTier) {
        this.channelTier = channelTier;
        return this;
    }
    public String getChannelTier() {
        return this.channelTier;
    }

    public ListChannelsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChannelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChannelsRequest setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
        return this;
    }
    public String getPlaybackMode() {
        return this.playbackMode;
    }

    public ListChannelsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListChannelsRequest setSortByModifiedTime(String sortByModifiedTime) {
        this.sortByModifiedTime = sortByModifiedTime;
        return this;
    }
    public String getSortByModifiedTime() {
        return this.sortByModifiedTime;
    }

    public ListChannelsRequest setState(Integer state) {
        this.state = state;
        return this;
    }
    public Integer getState() {
        return this.state;
    }

}
