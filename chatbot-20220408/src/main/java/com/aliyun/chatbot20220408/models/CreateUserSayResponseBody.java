// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateUserSayResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8g4n8bnd236fg79</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unique ID of the intent-user say pair.</p>
     * 
     * <strong>example:</strong>
     * <p>46456176856</p>
     */
    @NameInMap("UserSayId")
    public Long userSayId;

    public static CreateUserSayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSayResponseBody self = new CreateUserSayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserSayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserSayResponseBody setUserSayId(Long userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public Long getUserSayId() {
        return this.userSayId;
    }

}
