// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DoInsightsActionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QueryTopo</p>
     */
    @NameInMap("Module")
    public String module;

    public static DoInsightsActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DoInsightsActionRequest self = new DoInsightsActionRequest();
        return TeaModel.build(map, self);
    }

    public DoInsightsActionRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DoInsightsActionRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

}
