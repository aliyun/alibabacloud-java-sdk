// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210622.models;

import com.aliyun.tea.*;

public class GetUserByTokenResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("User")
    public GetUserByTokenResponseBodyUser user;

    public static GetUserByTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserByTokenResponseBody self = new GetUserByTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserByTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserByTokenResponseBody setUser(GetUserByTokenResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserByTokenResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserByTokenResponseBodyUser extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Email")
        public String email;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetUserByTokenResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserByTokenResponseBodyUser self = new GetUserByTokenResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserByTokenResponseBodyUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserByTokenResponseBodyUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserByTokenResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserByTokenResponseBodyUser setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
