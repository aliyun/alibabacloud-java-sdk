// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllMemberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllMemberResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllMemberResponseBody self = new ListAllMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllMemberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllMemberResponseBody setData(java.util.List<ListAllMemberResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllMemberResponseBodyData> getData() {
        return this.data;
    }

    public ListAllMemberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllMemberResponseBodyData extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("Name")
        public String name;

        public static ListAllMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllMemberResponseBodyData self = new ListAllMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllMemberResponseBodyData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListAllMemberResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
