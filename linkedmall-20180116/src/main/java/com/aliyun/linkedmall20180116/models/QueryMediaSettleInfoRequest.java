// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMediaSettleInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LMALL20******005</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>2021-08-01 01:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("MediaName")
    public String mediaName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SettleNo")
    public String settleNo;

    /**
     * <strong>example:</strong>
     * <p>2021-08-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryMediaSettleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaSettleInfoRequest self = new QueryMediaSettleInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaSettleInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMediaSettleInfoRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryMediaSettleInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryMediaSettleInfoRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryMediaSettleInfoRequest setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public QueryMediaSettleInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryMediaSettleInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMediaSettleInfoRequest setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

    public QueryMediaSettleInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
