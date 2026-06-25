// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateExperimentRequest extends TeaModel {
    /**
     * <p>The visibility of the experiment in the workspace. Valid values:</p>
     * <ul>
     * <li><p>PRIVATE: The experiment is visible only to you and the administrator in the workspace.</p>
     * </li>
     * <li><p>PUBLIC: The experiment is visible to everyone in the workspace.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The name of the experiment. The naming convention is as follows:</p>
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

    public static UpdateExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentRequest self = new UpdateExperimentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
