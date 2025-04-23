// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SceneTestingTask</p>
     */
    @NameInMap("type")
    public String type;

    public static GetTaskPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskPolicyRequest self = new GetTaskPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
