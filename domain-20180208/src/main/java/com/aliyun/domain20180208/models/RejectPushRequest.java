// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RejectPushRequest extends TeaModel {
    /**
     * <p>Push编号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>push_20250101_abc123</p>
     */
    @NameInMap("PushNo")
    public String pushNo;

    public static RejectPushRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectPushRequest self = new RejectPushRequest();
        return TeaModel.build(map, self);
    }

    public RejectPushRequest setPushNo(String pushNo) {
        this.pushNo = pushNo;
        return this;
    }
    public String getPushNo() {
        return this.pushNo;
    }

}
