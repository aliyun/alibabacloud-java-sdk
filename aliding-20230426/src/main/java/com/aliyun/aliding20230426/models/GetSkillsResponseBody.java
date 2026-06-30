// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillsResponseBody extends TeaModel {
    @NameInMap("Data")
    public Object data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillsResponseBody self = new GetSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
