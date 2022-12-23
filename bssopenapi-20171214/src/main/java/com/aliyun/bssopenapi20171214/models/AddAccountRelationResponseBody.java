// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class AddAccountRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddAccountRelationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddAccountRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAccountRelationResponseBody self = new AddAccountRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAccountRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAccountRelationResponseBody setData(AddAccountRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddAccountRelationResponseBodyData getData() {
        return this.data;
    }

    public AddAccountRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAccountRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAccountRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddAccountRelationResponseBodyData extends TeaModel {
        // HostId
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("RelationId")
        public Long relationId;

        public static AddAccountRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddAccountRelationResponseBodyData self = new AddAccountRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddAccountRelationResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public AddAccountRelationResponseBodyData setRelationId(Long relationId) {
            this.relationId = relationId;
            return this;
        }
        public Long getRelationId() {
            return this.relationId;
        }

    }

}
