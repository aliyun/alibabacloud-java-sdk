// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetVideoCoverResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VideoCoverUrl")
    public String videoCoverUrl;

    @NameInMap("Code")
    public String code;

    public static GetVideoCoverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCoverResponseBody self = new GetVideoCoverResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoCoverResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public GetVideoCoverResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoCoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoCoverResponseBody setVideoCoverUrl(String videoCoverUrl) {
        this.videoCoverUrl = videoCoverUrl;
        return this;
    }
    public String getVideoCoverUrl() {
        return this.videoCoverUrl;
    }

    public GetVideoCoverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
