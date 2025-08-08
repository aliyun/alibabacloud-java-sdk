// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CreateCatalogRequest extends TeaModel {
    @NameInMap("isShared")
    public Boolean isShared;

    /**
     * <strong>example:</strong>
     * <p>catalog_demo</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("options")
    public java.util.Map<String, String> options;

    @NameInMap("shareId")
    public String shareId;

    @NameInMap("type")
    public String type;

    public static CreateCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCatalogRequest self = new CreateCatalogRequest();
        return TeaModel.build(map, self);
    }

    public CreateCatalogRequest setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public CreateCatalogRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCatalogRequest setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public CreateCatalogRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public CreateCatalogRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
