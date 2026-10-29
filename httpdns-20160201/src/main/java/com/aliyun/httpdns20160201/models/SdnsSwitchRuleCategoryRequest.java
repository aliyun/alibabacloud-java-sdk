// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsSwitchRuleCategoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>123456789012345678</p>
     */
    @NameInMap("Id")
    public String id;

    public static SdnsSwitchRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SdnsSwitchRuleCategoryRequest self = new SdnsSwitchRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public SdnsSwitchRuleCategoryRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SdnsSwitchRuleCategoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
