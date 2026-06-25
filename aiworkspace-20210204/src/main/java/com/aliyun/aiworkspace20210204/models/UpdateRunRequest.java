// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateRunRequest extends TeaModel {
    /**
     * <p>A list of labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The name of the run. The naming conventions are as follows:</p>
     * <ul>
     * <li><p>Must start with a lowercase or uppercase letter.</p>
     * </li>
     * <li><p>Can contain lowercase letters, uppercase letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>The length must be 1 to 63 characters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A list of parameters.</p>
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
