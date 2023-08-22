// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceMembersResponseBody extends TeaModel {
    @NameInMap("NotInOrgList")
    public java.util.List<String> notInOrgList;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AddWorkspaceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMembersResponseBody self = new AddWorkspaceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMembersResponseBody setNotInOrgList(java.util.List<String> notInOrgList) {
        this.notInOrgList = notInOrgList;
        return this;
    }
    public java.util.List<String> getNotInOrgList() {
        return this.notInOrgList;
    }

    public AddWorkspaceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
