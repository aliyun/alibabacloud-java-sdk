// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAdvertisementSettleInfoRequest extends TeaModel {
    @NameInMap("MediaSettleDetailId")
    public String mediaSettleDetailId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("SettleNo")
    public String settleNo;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ExtInfo")
    public String extInfo;

    public static QueryAdvertisementSettleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvertisementSettleInfoRequest self = new QueryAdvertisementSettleInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdvertisementSettleInfoRequest setMediaSettleDetailId(String mediaSettleDetailId) {
        this.mediaSettleDetailId = mediaSettleDetailId;
        return this;
    }
    public String getMediaSettleDetailId() {
        return this.mediaSettleDetailId;
    }

    public QueryAdvertisementSettleInfoRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryAdvertisementSettleInfoRequest setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

    public QueryAdvertisementSettleInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAdvertisementSettleInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAdvertisementSettleInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAdvertisementSettleInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryAdvertisementSettleInfoRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
