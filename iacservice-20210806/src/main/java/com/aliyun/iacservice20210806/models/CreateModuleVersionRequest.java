// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleVersionRequest extends TeaModel {
    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The version description. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The template version name. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>versionName</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateModuleVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleVersionRequest self = new CreateModuleVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateModuleVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModuleVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModuleVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
