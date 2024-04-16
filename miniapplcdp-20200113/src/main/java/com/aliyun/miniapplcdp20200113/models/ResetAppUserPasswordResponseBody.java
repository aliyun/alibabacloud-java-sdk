// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ResetAppUserPasswordResponseBody extends TeaModel {
    @NameInMap("Data")
    public ResetAppUserPasswordResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ResetAppUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAppUserPasswordResponseBody self = new ResetAppUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAppUserPasswordResponseBody setData(ResetAppUserPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetAppUserPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetAppUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetAppUserPasswordResponseBodyData extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("UserName")
        public String userName;

        public static ResetAppUserPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetAppUserPasswordResponseBodyData self = new ResetAppUserPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetAppUserPasswordResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetAppUserPasswordResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
