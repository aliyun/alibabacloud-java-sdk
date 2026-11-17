// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateWebFilterTemplateRequest extends TeaModel {
    /**
     * <p>The description of the web filtering template. The description can be up to 128 characters in length. If this parameter is not specified, the original value is retained. If an empty string is specified, the description is cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>Web filtering template for URL access control</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the web filtering template. The name must be 1 to 64 characters in length and can contain Chinese characters, English letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces. If this parameter is not specified or is left empty, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Web filtering template 02</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The status of the web filtering template. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disable</strong>: Disabled.
     * If this parameter is not specified or is left empty, the original value is retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the web filtering template to be modified. The template must exist within the current Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wft-3f2a9c1d4b5e6f70</p>
     */
    @NameInMap("WebFilterTemplateId")
    public String webFilterTemplateId;

    public static UpdateWebFilterTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFilterTemplateRequest self = new UpdateWebFilterTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebFilterTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWebFilterTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateWebFilterTemplateRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateWebFilterTemplateRequest setWebFilterTemplateId(String webFilterTemplateId) {
        this.webFilterTemplateId = webFilterTemplateId;
        return this;
    }
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

}
