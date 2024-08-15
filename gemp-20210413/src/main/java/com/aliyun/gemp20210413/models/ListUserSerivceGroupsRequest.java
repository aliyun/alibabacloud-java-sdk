// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUserSerivceGroupsRequest extends TeaModel {
    /**
     * <p>clientToken</p>
     * 
     * <strong>example:</strong>
     * <p>2b63cdef-7ac3-4892-a76d-0f3389ef729f</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static ListUserSerivceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserSerivceGroupsRequest self = new ListUserSerivceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserSerivceGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListUserSerivceGroupsRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
