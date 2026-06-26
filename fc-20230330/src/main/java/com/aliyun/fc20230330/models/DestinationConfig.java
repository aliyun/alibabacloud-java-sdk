// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DestinationConfig extends TeaModel {
    /**
     * <p>Structure that defines the destination for failed invocations.</p>
     */
    @NameInMap("onFailure")
    public Destination onFailure;

    /**
     * <p>Structure that defines the destination for successful invocations.</p>
     */
    @NameInMap("onSuccess")
    public Destination onSuccess;

    public static DestinationConfig build(java.util.Map<String, ?> map) throws Exception {
        DestinationConfig self = new DestinationConfig();
        return TeaModel.build(map, self);
    }

    public DestinationConfig setOnFailure(Destination onFailure) {
        this.onFailure = onFailure;
        return this;
    }
    public Destination getOnFailure() {
        return this.onFailure;
    }

    public DestinationConfig setOnSuccess(Destination onSuccess) {
        this.onSuccess = onSuccess;
        return this;
    }
    public Destination getOnSuccess() {
        return this.onSuccess;
    }

}
