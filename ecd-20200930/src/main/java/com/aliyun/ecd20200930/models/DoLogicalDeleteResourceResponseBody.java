// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DoLogicalDeleteResourceResponseBody extends TeaModel {
    @NameInMap("GmtWakeup")
    public String gmtWakeup;

    @NameInMap("Hid")
    public Long hid;

    @NameInMap("Message")
    public String message;

    @NameInMap("TaskIdentifier")
    public String taskIdentifier;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("TaskExtraData")
    public String taskExtraData;

    @NameInMap("Country")
    public String country;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    public static DoLogicalDeleteResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoLogicalDeleteResourceResponseBody self = new DoLogicalDeleteResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DoLogicalDeleteResourceResponseBody setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public DoLogicalDeleteResourceResponseBody setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public DoLogicalDeleteResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoLogicalDeleteResourceResponseBody setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public DoLogicalDeleteResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoLogicalDeleteResourceResponseBody setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public DoLogicalDeleteResourceResponseBody setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public DoLogicalDeleteResourceResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DoLogicalDeleteResourceResponseBody setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public DoLogicalDeleteResourceResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DoLogicalDeleteResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DoLogicalDeleteResourceResponseBody setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

}
