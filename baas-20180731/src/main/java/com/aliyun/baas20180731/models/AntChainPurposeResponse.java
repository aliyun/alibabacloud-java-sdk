// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AntChainPurposeResponse extends TeaModel {
    @NameInMap("ChainPurposeExtend")
    public String chainPurposeExtend;

    @NameInMap("ChainPurposeItem")
    public String chainPurposeItem;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Purpose")
    public String purpose;

    @NameInMap("RecordList")
    public java.util.List<ChainPurpose> recordList;

    @NameInMap("Status")
    public String status;

    public static AntChainPurposeResponse build(java.util.Map<String, ?> map) throws Exception {
        AntChainPurposeResponse self = new AntChainPurposeResponse();
        return TeaModel.build(map, self);
    }

    public AntChainPurposeResponse setChainPurposeExtend(String chainPurposeExtend) {
        this.chainPurposeExtend = chainPurposeExtend;
        return this;
    }
    public String getChainPurposeExtend() {
        return this.chainPurposeExtend;
    }

    public AntChainPurposeResponse setChainPurposeItem(String chainPurposeItem) {
        this.chainPurposeItem = chainPurposeItem;
        return this;
    }
    public String getChainPurposeItem() {
        return this.chainPurposeItem;
    }

    public AntChainPurposeResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AntChainPurposeResponse setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public AntChainPurposeResponse setRecordList(java.util.List<ChainPurpose> recordList) {
        this.recordList = recordList;
        return this;
    }
    public java.util.List<ChainPurpose> getRecordList() {
        return this.recordList;
    }

    public AntChainPurposeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
