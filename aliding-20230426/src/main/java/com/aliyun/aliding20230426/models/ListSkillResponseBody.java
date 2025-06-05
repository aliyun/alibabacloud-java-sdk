// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListSkillResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>2715B4D3-A3FB-5FC7-AFA0-4471687B1EC6</p>
     */
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
