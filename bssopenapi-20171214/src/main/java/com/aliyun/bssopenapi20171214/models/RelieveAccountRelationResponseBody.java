// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RelieveAccountRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RelieveAccountRelationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RelieveAccountRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RelieveAccountRelationResponseBody self = new RelieveAccountRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public RelieveAccountRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RelieveAccountRelationResponseBody setData(RelieveAccountRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RelieveAccountRelationResponseBodyData getData() {
        return this.data;
    }

    public RelieveAccountRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RelieveAccountRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RelieveAccountRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RelieveAccountRelationResponseBodyData extends TeaModel {
        @NameInMap("HostId")
        public String hostId;

        public static RelieveAccountRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RelieveAccountRelationResponseBodyData self = new RelieveAccountRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RelieveAccountRelationResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
