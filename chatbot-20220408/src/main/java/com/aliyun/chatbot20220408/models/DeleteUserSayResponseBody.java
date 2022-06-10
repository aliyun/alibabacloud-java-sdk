// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteUserSayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserSayId")
    public Long userSayId;

    public static DeleteUserSayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserSayResponseBody self = new DeleteUserSayResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserSayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserSayResponseBody setUserSayId(Long userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public Long getUserSayId() {
        return this.userSayId;
    }

}
