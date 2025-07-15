// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeChannelUsersResponseBody extends TeaModel {
    /**
     * <p>The list of streamers/co-streamers.</p>
     */
    @NameInMap("InteractiveUserList")
    public java.util.List<String> interactiveUserList;

    /**
     * <p>The number of co-streamers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InteractiveUserNumber")
    public Integer interactiveUserNumber;

    /**
     * <p>Indicates whether the channel exists. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p>After all users leave the channel, the system requires a few seconds to clear the cache. If you call the operation during this period, the value of this parameter is true, and the value of InteractiveUserNumber and LiveUserNumber is 0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsChannelExists")
    public Boolean isChannelExists;

    /**
     * <p>The list of viewers.</p>
     */
    @NameInMap("LiveUserList")
    public java.util.List<String> liveUserList;

    /**
     * <p>The number of viewers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LiveUserNumber")
    public Integer liveUserNumber;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AD86847D-1F36-18C8-A995-5EEA340B3202</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The UTC timestamp when the response is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1691027655</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static DescribeChannelUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUsersResponseBody self = new DescribeChannelUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUsersResponseBody setInteractiveUserList(java.util.List<String> interactiveUserList) {
        this.interactiveUserList = interactiveUserList;
        return this;
    }
    public java.util.List<String> getInteractiveUserList() {
        return this.interactiveUserList;
    }

    public DescribeChannelUsersResponseBody setInteractiveUserNumber(Integer interactiveUserNumber) {
        this.interactiveUserNumber = interactiveUserNumber;
        return this;
    }
    public Integer getInteractiveUserNumber() {
        return this.interactiveUserNumber;
    }

    public DescribeChannelUsersResponseBody setIsChannelExists(Boolean isChannelExists) {
        this.isChannelExists = isChannelExists;
        return this;
    }
    public Boolean getIsChannelExists() {
        return this.isChannelExists;
    }

    public DescribeChannelUsersResponseBody setLiveUserList(java.util.List<String> liveUserList) {
        this.liveUserList = liveUserList;
        return this;
    }
    public java.util.List<String> getLiveUserList() {
        return this.liveUserList;
    }

    public DescribeChannelUsersResponseBody setLiveUserNumber(Integer liveUserNumber) {
        this.liveUserNumber = liveUserNumber;
        return this;
    }
    public Integer getLiveUserNumber() {
        return this.liveUserNumber;
    }

    public DescribeChannelUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelUsersResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
