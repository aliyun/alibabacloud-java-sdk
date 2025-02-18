// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class PageListAppInstanceGroupUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The users.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static PageListAppInstanceGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageListAppInstanceGroupUserResponseBody self = new PageListAppInstanceGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public PageListAppInstanceGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageListAppInstanceGroupUserResponseBody setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
