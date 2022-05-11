// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ReleaseInstanceResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReleaseInstanceResponseBodyData data;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static ReleaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceResponseBody self = new ReleaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReleaseInstanceResponseBody setData(ReleaseInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReleaseInstanceResponseBodyData getData() {
        return this.data;
    }

    public ReleaseInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReleaseInstanceResponseBodyData extends TeaModel {
        // hostId
        @NameInMap("HostId")
        public String hostId;

        // releaseResult
        @NameInMap("ReleaseResult")
        public Boolean releaseResult;

        public static ReleaseInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReleaseInstanceResponseBodyData self = new ReleaseInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReleaseInstanceResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public ReleaseInstanceResponseBodyData setReleaseResult(Boolean releaseResult) {
            this.releaseResult = releaseResult;
            return this;
        }
        public Boolean getReleaseResult() {
            return this.releaseResult;
        }

    }

}
