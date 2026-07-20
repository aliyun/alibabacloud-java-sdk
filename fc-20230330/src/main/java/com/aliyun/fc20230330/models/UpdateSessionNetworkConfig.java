// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateSessionNetworkConfig extends TeaModel {
    @NameInMap("allowOut")
    public java.util.List<String> allowOut;

    @NameInMap("denyOut")
    public java.util.List<String> denyOut;

    public static UpdateSessionNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionNetworkConfig self = new UpdateSessionNetworkConfig();
        return TeaModel.build(map, self);
    }

    public UpdateSessionNetworkConfig setAllowOut(java.util.List<String> allowOut) {
        this.allowOut = allowOut;
        return this;
    }
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    public UpdateSessionNetworkConfig setDenyOut(java.util.List<String> denyOut) {
        this.denyOut = denyOut;
        return this;
    }
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

}
