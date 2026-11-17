// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateWebFilterTemplateRequest extends TeaModel {
    /**
     * <p>The description of the web filtering template. The description can be up to 128 characters in length and can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Web filtering template for URL access control</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the web filtering template. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces or be empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WebFilterTemplate01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The status of the web filtering template. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: enabled.</li>
     * <li><strong>Disable</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateWebFilterTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFilterTemplateRequest self = new CreateWebFilterTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebFilterTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWebFilterTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWebFilterTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
