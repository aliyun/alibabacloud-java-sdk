// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCustomAttributeRequest extends TeaModel {
    /**
     * <p>The custom attribute ID. The ID must match the regular expression <code>^custom-attribute:[A-Za-z][A-Za-z0-9_]{0,98}$</code>. The part after \&quot;custom-attribute:\&quot; must be less than 100 characters long.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-attribute:biz_owner</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetCustomAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAttributeRequest self = new GetCustomAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomAttributeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
