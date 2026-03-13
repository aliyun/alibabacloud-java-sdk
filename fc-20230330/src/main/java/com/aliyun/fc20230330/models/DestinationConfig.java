// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DestinationConfig extends TeaModel {
    /**
     * <p>The destination struct of a failed callback.</p>
     */
    @NameInMap("onFailure")
    public Destination onFailure;

    /**
     * <p>The destination struct of a successful callback.</p>
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
