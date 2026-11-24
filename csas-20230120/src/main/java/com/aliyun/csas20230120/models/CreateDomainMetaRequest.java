// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDomainMetaRequest extends TeaModel {
    /**
     * <p>The list type.</p>
     * 
     * <strong>example:</strong>
     * <p>la_domain_black_list</p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>The name of the list. The name can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>office_domain</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateDomainMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainMetaRequest self = new CreateDomainMetaRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainMetaRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public CreateDomainMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
