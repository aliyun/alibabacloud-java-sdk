// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetStudentsDesktopGroupPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetStudentsDesktopGroupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetStudentsDesktopGroupPolicyResponseBody self = new SetStudentsDesktopGroupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetStudentsDesktopGroupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
