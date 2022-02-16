// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterTypesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 网络连接类型
    @NameInMap("ConnectType")
    public String connectType;

    @NameInMap("RegionId")
    public String regionId;

    public static ListClusterTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterTypesRequest self = new ListClusterTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterTypesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListClusterTypesRequest setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public ListClusterTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
