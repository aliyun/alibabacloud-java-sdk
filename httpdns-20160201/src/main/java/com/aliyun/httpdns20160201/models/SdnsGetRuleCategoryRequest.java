// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsGetRuleCategoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456789012345678</p>
     */
    @NameInMap("Id")
    public String id;

    public static SdnsGetRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SdnsGetRuleCategoryRequest self = new SdnsGetRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public SdnsGetRuleCategoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
