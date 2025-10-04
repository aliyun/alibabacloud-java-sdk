// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteWuyingServerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0bw2f11****dial</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static DeleteWuyingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWuyingServerRequest self = new DeleteWuyingServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWuyingServerRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
