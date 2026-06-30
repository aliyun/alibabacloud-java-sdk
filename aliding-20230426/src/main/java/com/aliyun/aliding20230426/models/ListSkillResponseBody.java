// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListSkillResponseBody extends TeaModel {
    @NameInMap("Data")
    public Object data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillResponseBody self = new ListSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
