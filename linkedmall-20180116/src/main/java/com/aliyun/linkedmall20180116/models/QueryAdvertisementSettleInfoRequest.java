// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAdvertisementSettleInfoRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("MediaSettleDetailId")
    public String mediaSettleDetailId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SettleNo")
    public String settleNo;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryAdvertisementSettleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvertisementSettleInfoRequest self = new QueryAdvertisementSettleInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdvertisementSettleInfoRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryAdvertisementSettleInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAdvertisementSettleInfoRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryAdvertisementSettleInfoRequest setMediaSettleDetailId(String mediaSettleDetailId) {
        this.mediaSettleDetailId = mediaSettleDetailId;
        return this;
    }
    public String getMediaSettleDetailId() {
        return this.mediaSettleDetailId;
    }

    public QueryAdvertisementSettleInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryAdvertisementSettleInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

}
