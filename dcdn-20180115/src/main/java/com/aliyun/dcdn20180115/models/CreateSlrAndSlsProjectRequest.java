// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateSlrAndSlsProjectRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Region")
    public String region;

    public static CreateSlrAndSlsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrAndSlsProjectRequest self = new CreateSlrAndSlsProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlrAndSlsProjectRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSlrAndSlsProjectRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
