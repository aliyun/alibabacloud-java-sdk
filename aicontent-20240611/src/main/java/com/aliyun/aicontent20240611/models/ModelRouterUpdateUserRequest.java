// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateUserRequest extends TeaModel {
    /**
     * <p>The name of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>John</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The phone number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>13800000000</p>
     */
    @NameInMap("phone")
    public String phone;

    public static ModelRouterUpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateUserRequest self = new ModelRouterUpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelRouterUpdateUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
