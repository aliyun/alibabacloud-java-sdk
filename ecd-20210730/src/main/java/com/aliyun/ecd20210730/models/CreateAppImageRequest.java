// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppImageRequest extends TeaModel {
    @NameInMap("AdaptorUidList")
    public java.util.List<String> adaptorUidList;

    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    public static CreateAppImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppImageRequest self = new CreateAppImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppImageRequest setAdaptorUidList(java.util.List<String> adaptorUidList) {
        this.adaptorUidList = adaptorUidList;
        return this;
    }
    public java.util.List<String> getAdaptorUidList() {
        return this.adaptorUidList;
    }

    public CreateAppImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppImageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
