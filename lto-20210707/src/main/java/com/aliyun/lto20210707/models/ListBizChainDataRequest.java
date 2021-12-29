// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBizChainDataRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IoTDataDID")
    public String ioTDataDID;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("StartTime")
    public Long startTime;

    public static ListBizChainDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBizChainDataRequest self = new ListBizChainDataRequest();
        return TeaModel.build(map, self);
    }

    public ListBizChainDataRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public ListBizChainDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListBizChainDataRequest setIoTDataDID(String ioTDataDID) {
        this.ioTDataDID = ioTDataDID;
        return this;
    }
    public String getIoTDataDID() {
        return this.ioTDataDID;
    }

    public ListBizChainDataRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ListBizChainDataRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListBizChainDataRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListBizChainDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
