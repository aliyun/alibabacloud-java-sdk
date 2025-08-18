// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StopWuyingServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("WuyingServerIdList")
    public java.util.List<String> wuyingServerIdList;

    public static StopWuyingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopWuyingServerRequest self = new StopWuyingServerRequest();
        return TeaModel.build(map, self);
    }

    public StopWuyingServerRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public StopWuyingServerRequest setWuyingServerIdList(java.util.List<String> wuyingServerIdList) {
        this.wuyingServerIdList = wuyingServerIdList;
        return this;
    }
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

}
