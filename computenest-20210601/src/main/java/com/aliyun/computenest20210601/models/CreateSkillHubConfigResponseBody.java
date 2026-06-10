// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillHubConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSkillHubConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillHubConfigResponseBody self = new CreateSkillHubConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillHubConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
