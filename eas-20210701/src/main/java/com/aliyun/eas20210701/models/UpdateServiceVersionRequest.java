// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionRequest extends TeaModel {
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
