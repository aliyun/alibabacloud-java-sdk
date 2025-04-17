// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateRunRequest extends TeaModel {
    /**
     * <p>The labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The run name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must start with a letter.</li>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must be 1 to 63 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parameters.</p>
     */
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
