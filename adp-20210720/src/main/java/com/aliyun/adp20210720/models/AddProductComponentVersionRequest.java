// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductComponentVersionRequest extends TeaModel {
    @NameInMap("releaseName")
    public String releaseName;

    public static AddProductComponentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductComponentVersionRequest self = new AddProductComponentVersionRequest();
        return TeaModel.build(map, self);
    }

    public AddProductComponentVersionRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
