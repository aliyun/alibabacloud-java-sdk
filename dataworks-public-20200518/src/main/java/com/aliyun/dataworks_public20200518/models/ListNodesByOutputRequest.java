// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    @NameInMap("Outputs")
    @Validation(required = true)
    public String outputs;

    @NameInMap("OutputNodeListAsMap")
    public Boolean outputNodeListAsMap;

    public static ListNodesByOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByOutputRequest self = new ListNodesByOutputRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesByOutputRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListNodesByOutputRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public ListNodesByOutputRequest setOutputNodeListAsMap(Boolean outputNodeListAsMap) {
        this.outputNodeListAsMap = outputNodeListAsMap;
        return this;
    }
    public Boolean getOutputNodeListAsMap() {
        return this.outputNodeListAsMap;
    }

}
