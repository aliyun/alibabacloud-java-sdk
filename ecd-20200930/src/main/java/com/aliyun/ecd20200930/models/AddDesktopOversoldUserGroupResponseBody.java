// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddDesktopOversoldUserGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddDesktopOversoldUserGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddDesktopOversoldUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDesktopOversoldUserGroupResponseBody self = new AddDesktopOversoldUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDesktopOversoldUserGroupResponseBody setData(AddDesktopOversoldUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddDesktopOversoldUserGroupResponseBodyData getData() {
        return this.data;
    }

    public AddDesktopOversoldUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddDesktopOversoldUserGroupResponseBodyData extends TeaModel {
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static AddDesktopOversoldUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDesktopOversoldUserGroupResponseBodyData self = new AddDesktopOversoldUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDesktopOversoldUserGroupResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
