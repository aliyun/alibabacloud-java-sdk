// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddProductComponentRequest extends TeaModel {
    @NameInMap("releaseName")
    public String releaseName;

    public static AddProductComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductComponentRequest self = new AddProductComponentRequest();
        return TeaModel.build(map, self);
    }

    public AddProductComponentRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
