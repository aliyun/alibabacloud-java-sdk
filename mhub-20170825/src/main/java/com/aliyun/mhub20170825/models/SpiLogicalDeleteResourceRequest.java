// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class SpiLogicalDeleteResourceRequest extends TeaModel {
    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("Invoker")
    @Validation(required = true)
    public String invoker;

    @NameInMap("Pk")
    @Validation(required = true)
    public String pk;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("Hid")
    @Validation(required = true)
    public Long hid;

    @NameInMap("Country")
    @Validation(required = true)
    public String country;

    @NameInMap("TaskIdentifier")
    @Validation(required = true)
    public String taskIdentifier;

    @NameInMap("TaskExtraData")
    @Validation(required = true)
    public String taskExtraData;

    @NameInMap("GmtWakeup")
    @Validation(required = true)
    public String gmtWakeup;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    public static SpiLogicalDeleteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SpiLogicalDeleteResourceRequest self = new SpiLogicalDeleteResourceRequest();
        return TeaModel.build(map, self);
    }

    public SpiLogicalDeleteResourceRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public SpiLogicalDeleteResourceRequest setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public SpiLogicalDeleteResourceRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public SpiLogicalDeleteResourceRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public SpiLogicalDeleteResourceRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public SpiLogicalDeleteResourceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SpiLogicalDeleteResourceRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public SpiLogicalDeleteResourceRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public SpiLogicalDeleteResourceRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public SpiLogicalDeleteResourceRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SpiLogicalDeleteResourceRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
