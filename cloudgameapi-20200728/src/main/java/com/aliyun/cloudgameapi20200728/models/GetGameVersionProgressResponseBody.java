// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionProgressResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Event")
    public String event;

    @NameInMap("Extra")
    public java.util.Map<String, ?> extra;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetGameVersionProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionProgressResponseBody self = new GetGameVersionProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameVersionProgressResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetGameVersionProgressResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public GetGameVersionProgressResponseBody setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public GetGameVersionProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameVersionProgressResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
