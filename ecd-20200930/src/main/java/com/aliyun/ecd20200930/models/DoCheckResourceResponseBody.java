// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DoCheckResourceResponseBody extends TeaModel {
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

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Url")
    public String url;

    @NameInMap("Interrupt")
    public Boolean interrupt;

    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("TaskExtraData")
    public String taskExtraData;

    @NameInMap("Country")
    public String country;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Bid")
    public String bid;

    public static DoCheckResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoCheckResourceResponseBody self = new DoCheckResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DoCheckResourceResponseBody setGmtWakeup(String gmtWakeup) {
        this.gmtWakeup = gmtWakeup;
        return this;
    }
    public String getGmtWakeup() {
        return this.gmtWakeup;
    }

    public DoCheckResourceResponseBody setHid(Long hid) {
        this.hid = hid;
        return this;
    }
    public Long getHid() {
        return this.hid;
    }

    public DoCheckResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoCheckResourceResponseBody setTaskIdentifier(String taskIdentifier) {
        this.taskIdentifier = taskIdentifier;
        return this;
    }
    public String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public DoCheckResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoCheckResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DoCheckResourceResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DoCheckResourceResponseBody setInterrupt(Boolean interrupt) {
        this.interrupt = interrupt;
        return this;
    }
    public Boolean getInterrupt() {
        return this.interrupt;
    }

    public DoCheckResourceResponseBody setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public DoCheckResourceResponseBody setTaskExtraData(String taskExtraData) {
        this.taskExtraData = taskExtraData;
        return this;
    }
    public String getTaskExtraData() {
        return this.taskExtraData;
    }

    public DoCheckResourceResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DoCheckResourceResponseBody setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public DoCheckResourceResponseBody setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public DoCheckResourceResponseBody setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public DoCheckResourceResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

}
