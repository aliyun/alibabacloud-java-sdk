// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDefaultAppUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDefaultAppUserResponseBodyData data;

    public static GetDefaultAppUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAppUserResponseBody self = new GetDefaultAppUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultAppUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDefaultAppUserResponseBody setData(GetDefaultAppUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDefaultAppUserResponseBodyData getData() {
        return this.data;
    }

    public static class GetDefaultAppUserResponseBodyData extends TeaModel {
        @NameInMap("UserName")
        public String userName;

        @NameInMap("HasPassword")
        public Boolean hasPassword;

        public static GetDefaultAppUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAppUserResponseBodyData self = new GetDefaultAppUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDefaultAppUserResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetDefaultAppUserResponseBodyData setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

    }

}
