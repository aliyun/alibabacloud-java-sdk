// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldUserGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDesktopOversoldUserGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopOversoldUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldUserGroupResponseBody self = new ModifyDesktopOversoldUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldUserGroupResponseBody setData(ModifyDesktopOversoldUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDesktopOversoldUserGroupResponseBodyData getData() {
        return this.data;
    }

    public ModifyDesktopOversoldUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDesktopOversoldUserGroupResponseBodyData extends TeaModel {
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ModifyDesktopOversoldUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopOversoldUserGroupResponseBodyData self = new ModifyDesktopOversoldUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopOversoldUserGroupResponseBodyData setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
