// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddNumbersToSkillGroupRequest extends TeaModel {
    /**
     * <p>The list of phone number group IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;38f5b191-b764-45b8-bd93-4b65f839e13a&quot;]</p>
     */
    @NameInMap("InstNumberGroupIdList")
    public String instNumberGroupIdList;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of phone numbers. Ensure that the phone numbers already exist in the current instance.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;0103182****&quot;,&quot;0102387****&quot;]</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>The skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static AddNumbersToSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNumbersToSkillGroupRequest self = new AddNumbersToSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddNumbersToSkillGroupRequest setInstNumberGroupIdList(String instNumberGroupIdList) {
        this.instNumberGroupIdList = instNumberGroupIdList;
        return this;
    }
    public String getInstNumberGroupIdList() {
        return this.instNumberGroupIdList;
    }

    public AddNumbersToSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddNumbersToSkillGroupRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public AddNumbersToSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
