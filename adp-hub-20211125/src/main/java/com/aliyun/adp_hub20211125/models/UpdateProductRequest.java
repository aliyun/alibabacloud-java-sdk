// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("isPublic")
    public String isPublic;

    @NameInMap("title")
    public String title;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductRequest setIsPublic(String isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public String getIsPublic() {
        return this.isPublic;
    }

    public UpdateProductRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
