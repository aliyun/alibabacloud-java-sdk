// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeSkillResponseBody extends TeaModel {
    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>2715B4D3-A3FB-5FC7-AFA0-4471687B1EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    public static InvokeSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeSkillResponseBody self = new InvokeSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeSkillResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
