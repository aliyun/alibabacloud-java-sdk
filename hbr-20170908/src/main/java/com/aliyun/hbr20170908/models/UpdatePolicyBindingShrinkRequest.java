// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyBindingShrinkRequest extends TeaModel {
    /**
     * <p>The advanced options.</p>
     */
    @NameInMap("AdvancedOptions")
    public String advancedOptionsShrink;

    /**
     * <p>The ID of the data source.</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Specifies whether to disable the backup policy for the data source.</p>
     * <br>
     * <p>*   true: disables the backup policy for the data source</p>
     * <p>*   false: enables the backup policy for the data source</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>The description of the association.</p>
     */
    @NameInMap("PolicyBindingDescription")
    public String policyBindingDescription;

    /**
     * <p>The ID of the backup policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **UDM_ECS**: ECS instance backup</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static UpdatePolicyBindingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyBindingShrinkRequest self = new UpdatePolicyBindingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyBindingShrinkRequest setAdvancedOptionsShrink(String advancedOptionsShrink) {
        this.advancedOptionsShrink = advancedOptionsShrink;
        return this;
    }
    public String getAdvancedOptionsShrink() {
        return this.advancedOptionsShrink;
    }

    public UpdatePolicyBindingShrinkRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdatePolicyBindingShrinkRequest setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public UpdatePolicyBindingShrinkRequest setPolicyBindingDescription(String policyBindingDescription) {
        this.policyBindingDescription = policyBindingDescription;
        return this;
    }
    public String getPolicyBindingDescription() {
        return this.policyBindingDescription;
    }

    public UpdatePolicyBindingShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyBindingShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
