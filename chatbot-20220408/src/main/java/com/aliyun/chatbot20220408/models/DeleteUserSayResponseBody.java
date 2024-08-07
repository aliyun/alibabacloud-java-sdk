// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteUserSayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dfgdg324gf34t34g34g3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>4562121234</p>
     */
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
