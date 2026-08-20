// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedTagRequest extends TeaModel {
    /**
     * <p>The description of the disabled software tag. The description can be up to 128 characters in length and can contain letters, digits, spaces, periods (.), underscores (_), and hyphens (-). Chinese characters are supported. This parameter can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the disabled software tag. Fuzzy match is supported. The name can be up to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported. Spaces are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest_616bcc13</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateProhibitedTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedTagRequest self = new CreateProhibitedTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedTagRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProhibitedTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
