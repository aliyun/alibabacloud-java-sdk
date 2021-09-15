// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAppUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GenerateAppUserPasswordResponseBodyData data;

    public static GenerateAppUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAppUserPasswordResponseBody self = new GenerateAppUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAppUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateAppUserPasswordResponseBody setData(GenerateAppUserPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateAppUserPasswordResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateAppUserPasswordResponseBodyData extends TeaModel {
        @NameInMap("UserName")
        public String userName;

        @NameInMap("Password")
        public String password;

        public static GenerateAppUserPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateAppUserPasswordResponseBodyData self = new GenerateAppUserPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateAppUserPasswordResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GenerateAppUserPasswordResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
