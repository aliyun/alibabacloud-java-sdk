// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaToSearchLibResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static UpdateMediaToSearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaToSearchLibResponseBody self = new UpdateMediaToSearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaToSearchLibResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMediaToSearchLibResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaToSearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMediaToSearchLibResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
