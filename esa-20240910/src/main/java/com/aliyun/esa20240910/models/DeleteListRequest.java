// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteListRequest extends TeaModel {
    /**
     * <p>The ID of the custom list, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850217.html">ListLists</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40000001</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteListRequest self = new DeleteListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
