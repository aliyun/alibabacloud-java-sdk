// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateConferenceResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateConferenceResponseBodyResult result;

    public static CreateConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConferenceResponseBody self = new CreateConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConferenceResponseBody setResult(CreateConferenceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateConferenceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateConferenceResponseBodyResult extends TeaModel {
        // 会议的唯一标识ID。
        @NameInMap("ConferenceId")
        public String conferenceId;

        public static CreateConferenceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateConferenceResponseBodyResult self = new CreateConferenceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateConferenceResponseBodyResult setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

    }

}
