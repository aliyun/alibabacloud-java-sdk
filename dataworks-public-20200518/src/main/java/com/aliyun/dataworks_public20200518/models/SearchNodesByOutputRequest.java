// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchNodesByOutputRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("Outputs")
    public String outputs;

    public static SearchNodesByOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchNodesByOutputRequest self = new SearchNodesByOutputRequest();
        return TeaModel.build(map, self);
    }

    public SearchNodesByOutputRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public SearchNodesByOutputRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

}
