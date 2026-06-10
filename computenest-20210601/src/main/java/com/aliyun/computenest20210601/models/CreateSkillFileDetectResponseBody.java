// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillFileDetectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2aceb074-fa72-44d2-99d9-45b17cffe0e7</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSkillFileDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillFileDetectResponseBody self = new CreateSkillFileDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillFileDetectResponseBody setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public CreateSkillFileDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
