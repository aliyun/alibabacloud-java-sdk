// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstancePortRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("port")
    public Integer port;

    public static UpdateInstancePortRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstancePortRequest self = new UpdateInstancePortRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstancePortRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
