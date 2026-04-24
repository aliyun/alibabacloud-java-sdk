// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageAssociatedProjectsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    public static ListImageAssociatedProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageAssociatedProjectsRequest self = new ListImageAssociatedProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListImageAssociatedProjectsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
