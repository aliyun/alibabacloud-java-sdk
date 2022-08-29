// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class InviteProjectMemberResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public InviteProjectMemberResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InviteProjectMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InviteProjectMemberResponseBody self = new InviteProjectMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public InviteProjectMemberResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public InviteProjectMemberResponseBody setData(InviteProjectMemberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InviteProjectMemberResponseBodyData getData() {
        return this.data;
    }

    public InviteProjectMemberResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InviteProjectMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InviteProjectMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InviteProjectMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InviteProjectMemberResponseBodyData extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Token")
        public String token;

        public static InviteProjectMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InviteProjectMemberResponseBodyData self = new InviteProjectMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InviteProjectMemberResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public InviteProjectMemberResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public InviteProjectMemberResponseBodyData setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public InviteProjectMemberResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public InviteProjectMemberResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
