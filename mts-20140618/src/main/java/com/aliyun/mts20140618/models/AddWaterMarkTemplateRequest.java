// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddWaterMarkTemplateRequest extends TeaModel {
    /**
     * <p>The configuration of the watermark template. The value is a JSON object. For more information, see the &quot;WaterMarks&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
     * <blockquote>
     * <p>If you do not require a positive correlation between the size of text in the watermark and the resolution, you can enable adaptation for the watermark. To do so, add <code>[\\&quot;adaptive\\&quot;]=true</code> to the TextWaterMark parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Width&quot;:&quot;10&quot;,&quot;Height&quot;:&quot;30&quot;,&quot;Dx&quot;:&quot;10&quot;,&quot;Dy&quot;:&quot;5&quot;,&quot;ReferPos&quot;:&quot;TopRight&quot;,&quot;Type&quot;:&quot;Image&quot;,&quot;Timeline&quot;:{&quot;Start&quot;:&quot;0&quot;,&quot;Duration&quot;:&quot;10&quot;}}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The name of the watermark template. The value can contain letters and digits and can be up to 128 bytes in size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-watermark-****</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddWaterMarkTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWaterMarkTemplateRequest self = new AddWaterMarkTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddWaterMarkTemplateRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AddWaterMarkTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddWaterMarkTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddWaterMarkTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddWaterMarkTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddWaterMarkTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
