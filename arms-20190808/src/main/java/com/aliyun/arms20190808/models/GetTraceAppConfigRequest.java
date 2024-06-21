// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2n80plglh@745eddxxx</p>
     */
    @NameInMap("Pid")
    public String pid;

    public static GetTraceAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppConfigRequest self = new GetTraceAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceAppConfigRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
