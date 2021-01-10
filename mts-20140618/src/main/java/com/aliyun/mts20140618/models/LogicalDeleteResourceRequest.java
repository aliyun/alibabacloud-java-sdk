// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class LogicalDeleteResourceRequest extends TeaModel {
    @NameInMap("Interrupt")
    public Boolean interrupt;

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

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    public static LogicalDeleteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        LogicalDeleteResourceRequest self = new LogicalDeleteResourceRequest();
        return TeaModel.build(map, self);
    }

    public LogicalDeleteResourceRequest setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public LogicalDeleteResourceRequest setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public LogicalDeleteResourceRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public LogicalDeleteResourceRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public LogicalDeleteResourceRequest setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public LogicalDeleteResourceRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public LogicalDeleteResourceRequest setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public LogicalDeleteResourceRequest setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public LogicalDeleteResourceRequest setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public LogicalDeleteResourceRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LogicalDeleteResourceRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
