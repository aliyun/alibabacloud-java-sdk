// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAppUserPasswordResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateAppUserPasswordResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateAppUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAppUserPasswordResponseBody self = new GenerateAppUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAppUserPasswordResponseBody setData(GenerateAppUserPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateAppUserPasswordResponseBodyData getData() {
        return this.data;
    }

    public GenerateAppUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateAppUserPasswordResponseBodyData extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("UserName")
        public String userName;

        public static GenerateAppUserPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateAppUserPasswordResponseBodyData self = new GenerateAppUserPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateAppUserPasswordResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GenerateAppUserPasswordResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
