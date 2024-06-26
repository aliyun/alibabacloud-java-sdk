// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ChainPurpose extends TeaModel {
    @NameInMap("Extend")
    public Boolean extend;

    @NameInMap("Id")
    public String id;

    @NameInMap("Item")
    public Boolean item;

    @NameInMap("Key")
    public String key;

    @NameInMap("Name")
    public String name;

    @NameInMap("PurposeItem")
    public String purposeItem;

    @NameInMap("Status")
    public String status;

    @NameInMap("Time")
    public String time;

    public static ChainPurpose build(java.util.Map<String, ?> map) throws Exception {
        ChainPurpose self = new ChainPurpose();
        return TeaModel.build(map, self);
    }

    public ChainPurpose setExtend(Boolean extend) {
        this.extend = extend;
        return this;
    }
    public Boolean getExtend() {
        return this.extend;
    }

    public ChainPurpose setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainPurpose setItem(Boolean item) {
        this.item = item;
        return this;
    }
    public Boolean getItem() {
        return this.item;
    }

    public ChainPurpose setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ChainPurpose setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainPurpose setPurposeItem(String purposeItem) {
        this.purposeItem = purposeItem;
        return this;
    }
    public String getPurposeItem() {
        return this.purposeItem;
    }

    public ChainPurpose setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChainPurpose setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
