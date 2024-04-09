// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to isolate the service instance. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Isolate")
    public Boolean isolate;

    public static UpdateServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceRequest self = new UpdateServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceRequest setIsolate(Boolean isolate) {
        this.isolate = isolate;
        return this;
    }
    public Boolean getIsolate() {
        return this.isolate;
    }

}
