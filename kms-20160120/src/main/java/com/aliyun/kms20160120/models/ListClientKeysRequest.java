// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListClientKeysRequest extends TeaModel {
    @NameInMap("AapName")
    public String aapName;

    public static ListClientKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientKeysRequest self = new ListClientKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListClientKeysRequest setAapName(String aapName) {
        this.aapName = aapName;
        return this;
    }
    public String getAapName() {
        return this.aapName;
    }

}
