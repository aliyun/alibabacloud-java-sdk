// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class UpdateSessionBizStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSessionBizStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSessionBizStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionBizStatusResponseBody self = new UpdateSessionBizStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSessionBizStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSessionBizStatusResponseBody setData(UpdateSessionBizStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSessionBizStatusResponseBodyData getData() {
        return this.data;
    }

    public UpdateSessionBizStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSessionBizStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSessionBizStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSessionBizStatusResponseBodyData extends TeaModel {
        @NameInMap("CustomSessionId")
        public String customSessionId;

        @NameInMap("PlatformSessionId")
        public String platformSessionId;

        public static UpdateSessionBizStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSessionBizStatusResponseBodyData self = new UpdateSessionBizStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSessionBizStatusResponseBodyData setCustomSessionId(String customSessionId) {
            this.customSessionId = customSessionId;
            return this;
        }
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        public UpdateSessionBizStatusResponseBodyData setPlatformSessionId(String platformSessionId) {
            this.platformSessionId = platformSessionId;
            return this;
        }
        public String getPlatformSessionId() {
            return this.platformSessionId;
        }

    }

}
