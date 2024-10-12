// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateRunRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Params")
    public java.util.List<RunParam> params;

    public static UpdateRunRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRunRequest self = new UpdateRunRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRunRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public UpdateRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRunRequest setParams(java.util.List<RunParam> params) {
        this.params = params;
        return this;
    }
    public java.util.List<RunParam> getParams() {
        return this.params;
    }

}
