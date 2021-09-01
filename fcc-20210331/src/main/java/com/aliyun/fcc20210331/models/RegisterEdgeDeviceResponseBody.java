// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RegisterEdgeDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RegisterEdgeDeviceResponseBodyData data;

    public static RegisterEdgeDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterEdgeDeviceResponseBody self = new RegisterEdgeDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterEdgeDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterEdgeDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterEdgeDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterEdgeDeviceResponseBody setData(RegisterEdgeDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterEdgeDeviceResponseBodyData getData() {
        return this.data;
    }

    public static class RegisterEdgeDeviceResponseBodyData extends TeaModel {
        @NameInMap("EdgeDeviceId")
        public String edgeDeviceId;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsvId")
        public String isvId;

        public static RegisterEdgeDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterEdgeDeviceResponseBodyData self = new RegisterEdgeDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterEdgeDeviceResponseBodyData setEdgeDeviceId(String edgeDeviceId) {
            this.edgeDeviceId = edgeDeviceId;
            return this;
        }
        public String getEdgeDeviceId() {
            return this.edgeDeviceId;
        }

        public RegisterEdgeDeviceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RegisterEdgeDeviceResponseBodyData setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

    }

}
