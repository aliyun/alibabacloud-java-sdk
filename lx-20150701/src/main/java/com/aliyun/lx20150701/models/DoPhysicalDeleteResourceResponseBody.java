// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class DoPhysicalDeleteResourceResponseBody extends TeaModel {
    @NameInMap("Pk")
    public String pk;

    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("GmtWakeup")
    public String gmtWakeup;

    @NameInMap("Hid")
    public Long hid;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Country")
    public String country;

    @NameInMap("Message")
    public Boolean message;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("TaskExtraData")
    public String taskExtraData;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("TaskIdentifier")
    public String taskIdentifier;

    public static DoPhysicalDeleteResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoPhysicalDeleteResourceResponseBody self = new DoPhysicalDeleteResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DoPhysicalDeleteResourceResponseBody setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public DoPhysicalDeleteResourceResponseBody setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public DoPhysicalDeleteResourceResponseBody setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public DoPhysicalDeleteResourceResponseBody setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public DoPhysicalDeleteResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DoPhysicalDeleteResourceResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DoPhysicalDeleteResourceResponseBody setMessage(Boolean message) {
        this.message = message;
        return this;
    }
    public Boolean getMessage() {
        return this.message;
    }

    public DoPhysicalDeleteResourceResponseBody setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public DoPhysicalDeleteResourceResponseBody setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public DoPhysicalDeleteResourceResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DoPhysicalDeleteResourceResponseBody setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

}
