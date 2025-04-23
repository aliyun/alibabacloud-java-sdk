// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateExperimentRequest extends TeaModel {
    /**
     * <p>The accessibility of the experiment in the workspace. Valid values:</p>
     * <ul>
     * <li>PRIVATE: The experiment is accessible only to you and the administrator of the workspace.</li>
     * <li>PUBLIC: The experiment is accessible to all users in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The experiment name. The name must meet the following requirements:</p>
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
