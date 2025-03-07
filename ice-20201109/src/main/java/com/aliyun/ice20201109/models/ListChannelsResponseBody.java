// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListChannelsResponseBody extends TeaModel {
    /**
     * <p>The channels.</p>
     */
    @NameInMap("ChannelList")
    public java.util.List<ChannelAssemblyChannel> channelList;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p><strong>Request ID</strong></p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of channels returned.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChannelsResponseBody self = new ListChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChannelsResponseBody setChannelList(java.util.List<ChannelAssemblyChannel> channelList) {
        this.channelList = channelList;
        return this;
    }
    public java.util.List<ChannelAssemblyChannel> getChannelList() {
        return this.channelList;
    }

    public ListChannelsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListChannelsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChannelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
