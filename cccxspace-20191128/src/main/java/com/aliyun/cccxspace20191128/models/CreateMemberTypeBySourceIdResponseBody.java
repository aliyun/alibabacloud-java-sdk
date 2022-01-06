// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateMemberTypeBySourceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateMemberTypeBySourceIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMemberTypeBySourceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberTypeBySourceIdResponseBody self = new CreateMemberTypeBySourceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemberTypeBySourceIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMemberTypeBySourceIdResponseBody setData(CreateMemberTypeBySourceIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMemberTypeBySourceIdResponseBodyData getData() {
        return this.data;
    }

    public CreateMemberTypeBySourceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMemberTypeBySourceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMemberTypeBySourceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMemberTypeBySourceIdResponseBodyData extends TeaModel {
        @NameInMap("BindResult")
        public Boolean bindResult;

        @NameInMap("MemberType")
        public String memberType;

        public static CreateMemberTypeBySourceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMemberTypeBySourceIdResponseBodyData self = new CreateMemberTypeBySourceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMemberTypeBySourceIdResponseBodyData setBindResult(Boolean bindResult) {
            this.bindResult = bindResult;
            return this;
        }
        public Boolean getBindResult() {
            return this.bindResult;
        }

        public CreateMemberTypeBySourceIdResponseBodyData setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

    }

}
