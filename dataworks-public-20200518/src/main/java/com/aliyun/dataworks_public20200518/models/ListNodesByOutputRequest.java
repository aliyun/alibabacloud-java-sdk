// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputRequest extends TeaModel {
    @NameInMap("Outputs")
    public String outputs;

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
