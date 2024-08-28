// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionRequest extends TeaModel {
    /**
     * <p>The destination version of the service. The value must be of the INT type. The value must be greater than 0 and smaller than the current version of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Version")
    public Integer version;

    public static UpdateServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceVersionRequest self = new UpdateServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceVersionRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
