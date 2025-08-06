// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aeip-bp1ix34fralt4ykf3****</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The description of the Anycast EIP.</p>
     * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>docdesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the Anycast EIP.</p>
     * <p>The name must be 0 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>docname</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyAnycastEipAddressAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressAttributeRequest self = new ModifyAnycastEipAddressAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressAttributeRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public ModifyAnycastEipAddressAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAnycastEipAddressAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
