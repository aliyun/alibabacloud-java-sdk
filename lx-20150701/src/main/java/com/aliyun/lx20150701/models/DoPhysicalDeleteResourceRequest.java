// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class DoPhysicalDeleteResourceRequest extends TeaModel {
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

    public static DoPhysicalDeleteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DoPhysicalDeleteResourceRequest self = new DoPhysicalDeleteResourceRequest();
        return TeaModel.build(map, self);
    }

    public DoPhysicalDeleteResourceRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public DoPhysicalDeleteResourceRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DoPhysicalDeleteResourceRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public DoPhysicalDeleteResourceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DoPhysicalDeleteResourceRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public DoPhysicalDeleteResourceRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public DoPhysicalDeleteResourceRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

}
