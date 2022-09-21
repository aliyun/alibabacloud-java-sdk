// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Pod extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("PodName")
    public String podName;

    @NameInMap("PodStatus")
    public String podStatus;

    @NameInMap("Reason")
    public String reason;

    public static Pod build(java.util.Map<String, ?> map) throws Exception {
        Pod self = new Pod();
        return TeaModel.build(map, self);
    }

    public Pod setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Pod setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public Pod setPodStatus(String podStatus) {
        this.podStatus = podStatus;
        return this;
    }
    public String getPodStatus() {
        return this.podStatus;
    }

    public Pod setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
