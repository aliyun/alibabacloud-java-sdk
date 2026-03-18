// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ApiKeyUpdateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MyApiKey</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    public static ApiKeyUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        ApiKeyUpdateCmd self = new ApiKeyUpdateCmd();
        return TeaModel.build(map, self);
    }

    public ApiKeyUpdateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiKeyUpdateCmd setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
