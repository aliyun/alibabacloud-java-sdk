// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class TestGetUserByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TestGetUserByIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static TestGetUserByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestGetUserByIdResponseBody self = new TestGetUserByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public TestGetUserByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestGetUserByIdResponseBody setData(TestGetUserByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestGetUserByIdResponseBodyData getData() {
        return this.data;
    }

    public TestGetUserByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestGetUserByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestGetUserByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestGetUserByIdResponseBodyData extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("ForeignId")
        public String foreignId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("Telephone")
        public String telephone;

        @NameInMap("Type")
        public String type;

        public static TestGetUserByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestGetUserByIdResponseBodyData self = new TestGetUserByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestGetUserByIdResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public TestGetUserByIdResponseBodyData setForeignId(String foreignId) {
            this.foreignId = foreignId;
            return this;
        }
        public String getForeignId() {
            return this.foreignId;
        }

        public TestGetUserByIdResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TestGetUserByIdResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public TestGetUserByIdResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public TestGetUserByIdResponseBodyData setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public TestGetUserByIdResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
