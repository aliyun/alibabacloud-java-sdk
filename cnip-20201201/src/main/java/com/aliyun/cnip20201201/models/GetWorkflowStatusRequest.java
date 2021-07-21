// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetWorkflowStatusRequest extends TeaModel {
    @NameInMap("xUID")
    public String xUID;

    public static GetWorkflowStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowStatusRequest self = new GetWorkflowStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowStatusRequest setXUID(String xUID) {
        this.xUID = xUID;
        return this;
    }
    public String getXUID() {
        return this.xUID;
    }

}
