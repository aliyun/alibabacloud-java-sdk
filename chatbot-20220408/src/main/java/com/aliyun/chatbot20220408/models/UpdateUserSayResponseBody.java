// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateUserSayResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2356fg3wf34634vdt23wef2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>34512323</p>
     */
    @NameInMap("UserSayId")
    public Long userSayId;

    public static UpdateUserSayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserSayResponseBody self = new UpdateUserSayResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserSayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserSayResponseBody setUserSayId(Long userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public Long getUserSayId() {
        return this.userSayId;
    }

}
