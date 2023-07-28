// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRoleAclOnObjectResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetRoleAclOnObjectResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRoleAclOnObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoleAclOnObjectResponseBody self = new GetRoleAclOnObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoleAclOnObjectResponseBody setData(GetRoleAclOnObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRoleAclOnObjectResponseBodyData getData() {
        return this.data;
    }

    public GetRoleAclOnObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRoleAclOnObjectResponseBodyData extends TeaModel {
        /**
         * <p>The operations that were performed on the object.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the object.</p>
         */
        @NameInMap("name")
        public String name;

        public static GetRoleAclOnObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclOnObjectResponseBodyData self = new GetRoleAclOnObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRoleAclOnObjectResponseBodyData setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetRoleAclOnObjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
