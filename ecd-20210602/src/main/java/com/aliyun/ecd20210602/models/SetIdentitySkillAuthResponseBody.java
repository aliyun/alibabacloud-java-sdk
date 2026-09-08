// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class SetIdentitySkillAuthResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A87DBB05-653A-5E4B-B72B-5F4A1E07****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetIdentitySkillAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetIdentitySkillAuthResponseBody self = new SetIdentitySkillAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public SetIdentitySkillAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
