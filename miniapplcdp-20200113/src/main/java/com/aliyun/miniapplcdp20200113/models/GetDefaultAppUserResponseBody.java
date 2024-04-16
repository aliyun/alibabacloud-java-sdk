// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDefaultAppUserResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDefaultAppUserResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDefaultAppUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAppUserResponseBody self = new GetDefaultAppUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultAppUserResponseBody setData(GetDefaultAppUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDefaultAppUserResponseBodyData getData() {
        return this.data;
    }

    public GetDefaultAppUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDefaultAppUserResponseBodyData extends TeaModel {
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("UserName")
        public String userName;

        public static GetDefaultAppUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultAppUserResponseBodyData self = new GetDefaultAppUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDefaultAppUserResponseBodyData setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        public GetDefaultAppUserResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
