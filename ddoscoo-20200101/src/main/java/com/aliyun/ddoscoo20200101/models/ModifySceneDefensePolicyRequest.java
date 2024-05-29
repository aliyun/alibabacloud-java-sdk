// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySceneDefensePolicyRequest extends TeaModel {
    /**
     * <p>The end time of the policy. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the policy that you want to modify.</p>
     * <br>
     * <p>> You can call the [DescribeSceneDefensePolicies](https://help.aliyun.com/document_detail/159382.html) operation to query the IDs of all policies.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The start time of the policy. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The template of the policy. Valid values:</p>
     * <br>
     * <p>*   **promotion**: important activity</p>
     * <p>*   **bypass**: all traffic forwarded</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Template")
    public String template;

    public static ModifySceneDefensePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySceneDefensePolicyRequest self = new ModifySceneDefensePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySceneDefensePolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModifySceneDefensePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySceneDefensePolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ModifySceneDefensePolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ModifySceneDefensePolicyRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
