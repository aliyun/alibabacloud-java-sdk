// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class LinkInstanceCategoryRequest extends TeaModel {
    /**
     * <p>The category\&quot;s ability type. Valid values: <code>FAQ</code> and <code>MRC</code> (machine reading comprehension). Defaults to <code>FAQ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>FAQ,MRC</p>
     */
    @NameInMap("AbilityType")
    public String abilityType;

    /**
     * <p>The key for the business space. If you do not specify this parameter, the default business space is used. You can obtain the key on the Business Management page of your primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>An array of FAQ category IDs to link to the chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;30000065789\&quot;]</p>
     */
    @NameInMap("CategoryIds")
    public String categoryIds;

    /**
     * <p>The unique identifier of the chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static LinkInstanceCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        LinkInstanceCategoryRequest self = new LinkInstanceCategoryRequest();
        return TeaModel.build(map, self);
    }

    public LinkInstanceCategoryRequest setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public LinkInstanceCategoryRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public LinkInstanceCategoryRequest setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public String getCategoryIds() {
        return this.categoryIds;
    }

    public LinkInstanceCategoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
