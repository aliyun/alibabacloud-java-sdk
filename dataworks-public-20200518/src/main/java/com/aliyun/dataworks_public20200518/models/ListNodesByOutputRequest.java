// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputRequest extends TeaModel {
    /**
     * <p>The output name of the node. You can specify multiple output names. Separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaaaa.1231412_out,bbbb.12313123_out</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <p>The environment of Operation Center. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static ListNodesByOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByOutputRequest self = new ListNodesByOutputRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesByOutputRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public ListNodesByOutputRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
