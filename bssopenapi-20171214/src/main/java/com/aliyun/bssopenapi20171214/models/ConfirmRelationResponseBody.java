// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConfirmRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ConfirmRelationResponseBodyData data;

    public static ConfirmRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRelationResponseBody self = new ConfirmRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfirmRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConfirmRelationResponseBody setData(ConfirmRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfirmRelationResponseBodyData getData() {
        return this.data;
    }

    public static class ConfirmRelationResponseBodyData extends TeaModel {
        @NameInMap("HostId")
        public String hostId;

        public static ConfirmRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfirmRelationResponseBodyData self = new ConfirmRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfirmRelationResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
