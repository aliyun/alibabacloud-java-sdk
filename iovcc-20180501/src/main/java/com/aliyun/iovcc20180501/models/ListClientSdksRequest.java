// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientSdksRequest extends TeaModel {
    @NameInMap("OsType")
    public String osType;

    public static ListClientSdksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientSdksRequest self = new ListClientSdksRequest();
        return TeaModel.build(map, self);
    }

    public ListClientSdksRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

}
