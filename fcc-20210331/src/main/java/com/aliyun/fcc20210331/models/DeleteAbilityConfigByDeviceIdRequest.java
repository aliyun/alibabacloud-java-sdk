// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteAbilityConfigByDeviceIdRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Id")
    public String id;

    public static DeleteAbilityConfigByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAbilityConfigByDeviceIdRequest self = new DeleteAbilityConfigByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAbilityConfigByDeviceIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteAbilityConfigByDeviceIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
