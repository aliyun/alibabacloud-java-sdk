// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAdvertisementSettleInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LMALL20******006</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>5781******561</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>2021-08-01 01:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("MediaSettleDetailId")
    public String mediaSettleDetailId;

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

    /**
     * <strong>example:</strong>
     * <p>TEST000000</p>
     */
    @NameInMap("SettleNo")
    public String settleNo;

    /**
     * <strong>example:</strong>
     * <p>2021-08-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryAdvertisementSettleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvertisementSettleInfoRequest self = new QueryAdvertisementSettleInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdvertisementSettleInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
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
