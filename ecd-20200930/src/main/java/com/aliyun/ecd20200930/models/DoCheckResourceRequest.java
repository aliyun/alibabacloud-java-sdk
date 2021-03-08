// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DoCheckResourceRequest extends TeaModel {
    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("Hid")
    public Long hid;

    @NameInMap("Country")
    public String country;

    @NameInMap("TaskIdentifier")
    public String taskIdentifier;

    @NameInMap("TaskExtraData")
    public String taskExtraData;

    @NameInMap("GmtWakeup")
    public String gmtWakeup;

    @NameInMap("RegionId")
    public String regionId;

    public static DoCheckResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DoCheckResourceRequest self = new DoCheckResourceRequest();
        return TeaModel.build(map, self);
    }

    public DoCheckResourceRequest setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public DoCheckResourceRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public DoCheckResourceRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DoCheckResourceRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public DoCheckResourceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DoCheckResourceRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public DoCheckResourceRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public DoCheckResourceRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public DoCheckResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
