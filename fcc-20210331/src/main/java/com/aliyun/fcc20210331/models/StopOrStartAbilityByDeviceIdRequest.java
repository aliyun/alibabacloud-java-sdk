// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class StopOrStartAbilityByDeviceIdRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Status")
    public String status;

    public static StopOrStartAbilityByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        StopOrStartAbilityByDeviceIdRequest self = new StopOrStartAbilityByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public StopOrStartAbilityByDeviceIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public StopOrStartAbilityByDeviceIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopOrStartAbilityByDeviceIdRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
