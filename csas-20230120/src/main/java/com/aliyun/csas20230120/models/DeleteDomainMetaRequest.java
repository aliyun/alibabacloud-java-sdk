// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDomainMetaRequest extends TeaModel {
    /**
     * <p>The list ID, which is a unique business identifier used for policy references and create, update, and delete operations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ladl-6f1exxxxx6ab59</p>
     */
    @NameInMap("ListId")
    public String listId;

    /**
     * <p>The list type. Valid values:</p>
     * <ul>
     * <li>la_domain_white_list: domain name whitelist.</li>
     * <li>la_domain_black_list: domain name blacklist.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>la_domain_white_list</p>
     */
    @NameInMap("ListType")
    public String listType;

    public static DeleteDomainMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainMetaRequest self = new DeleteDomainMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainMetaRequest setListId(String listId) {
        this.listId = listId;
        return this;
    }
    public String getListId() {
        return this.listId;
    }

    public DeleteDomainMetaRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

}
