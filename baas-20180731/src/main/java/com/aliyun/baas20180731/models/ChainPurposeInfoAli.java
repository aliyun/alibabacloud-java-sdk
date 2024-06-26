// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ChainPurposeInfoAli extends TeaModel {
    @NameInMap("ChainPurposeExtend")
    public String chainPurposeExtend;

    @NameInMap("ChainPurposeItem")
    public String chainPurposeItem;

    @NameInMap("Id")
    public String id;

    @NameInMap("Key")
    public String key;

    @NameInMap("Purpose")
    public String purpose;

    @NameInMap("Status")
    public String status;

    @NameInMap("Time")
    public String time;

    public static ChainPurposeInfoAli build(java.util.Map<String, ?> map) throws Exception {
        ChainPurposeInfoAli self = new ChainPurposeInfoAli();
        return TeaModel.build(map, self);
    }

    public ChainPurposeInfoAli setChainPurposeExtend(String chainPurposeExtend) {
        this.chainPurposeExtend = chainPurposeExtend;
        return this;
    }
    public String getChainPurposeExtend() {
        return this.chainPurposeExtend;
    }

    public ChainPurposeInfoAli setChainPurposeItem(String chainPurposeItem) {
        this.chainPurposeItem = chainPurposeItem;
        return this;
    }
    public String getChainPurposeItem() {
        return this.chainPurposeItem;
    }

    public ChainPurposeInfoAli setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainPurposeInfoAli setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ChainPurposeInfoAli setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public ChainPurposeInfoAli setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChainPurposeInfoAli setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
