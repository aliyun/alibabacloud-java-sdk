// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputRequest extends TeaModel {
    /**
     * <p>The output name of the node. You can specify multiple output names. In this case, separate them with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <p>The environment type. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
     * <br>
     * <p>This parameter is required.</p>
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
