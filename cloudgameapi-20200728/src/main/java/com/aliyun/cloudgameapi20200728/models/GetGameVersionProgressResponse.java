// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionProgressResponse extends TeaModel {
    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("Event")
    @Validation(required = true)
    public String event;

    @NameInMap("Extra")
    @Validation(required = true)
    public java.util.Map<String, ?> extra;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static GetGameVersionProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionProgressResponse self = new GetGameVersionProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetGameVersionProgressResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetGameVersionProgressResponse setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public GetGameVersionProgressResponse setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public GetGameVersionProgressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameVersionProgressResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
