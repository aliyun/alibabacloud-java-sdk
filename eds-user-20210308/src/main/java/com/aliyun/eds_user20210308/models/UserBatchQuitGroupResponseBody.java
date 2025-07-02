// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UserBatchQuitGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>890JNJNF-SADASSDFS-SDFSDF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UserBatchQuitGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserBatchQuitGroupResponseBody self = new UserBatchQuitGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UserBatchQuitGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
