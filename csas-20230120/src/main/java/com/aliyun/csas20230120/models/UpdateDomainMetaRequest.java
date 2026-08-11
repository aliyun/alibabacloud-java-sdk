// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateDomainMetaRequest extends TeaModel {
    /**
     * <p>The list ID. This is a unique business identifier used for policy references and add, delete, or modify operations.</p>
     * 
     * <strong>example:</strong>
     * <p>ladl-6f1exxxxx6ab59</p>
     */
    @NameInMap("ListId")
    public String listId;

    /**
     * <p>The list type.</p>
     * 
     * <strong>example:</strong>
     * <p>la_domain_white_list</p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>The list name. Maximum length: 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>new_office_domain</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateDomainMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainMetaRequest self = new UpdateDomainMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainMetaRequest setListId(String listId) {
        this.listId = listId;
        return this;
    }
    public String getListId() {
        return this.listId;
    }

    public UpdateDomainMetaRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public UpdateDomainMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
