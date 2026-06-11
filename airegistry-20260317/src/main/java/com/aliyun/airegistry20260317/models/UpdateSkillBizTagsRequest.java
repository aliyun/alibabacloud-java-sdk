// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdateSkillBizTagsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cs&quot;,&quot;qa&quot;,&quot;support&quot;]</p>
     */
    @NameInMap("BizTags")
    public String bizTags;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    public static UpdateSkillBizTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillBizTagsRequest self = new UpdateSkillBizTagsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillBizTagsRequest setBizTags(String bizTags) {
        this.bizTags = bizTags;
        return this;
    }
    public String getBizTags() {
        return this.bizTags;
    }

    public UpdateSkillBizTagsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateSkillBizTagsRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
