// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class SubmitSkillVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSkillVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSkillVersionResponseBody self = new SubmitSkillVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSkillVersionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitSkillVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
