// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCommonAreasRequest extends TeaModel {
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("IsEpg")
    public Boolean isEpg;

    @NameInMap("IsIpSet")
    public Boolean isIpSet;

    public static ListCommonAreasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommonAreasRequest self = new ListCommonAreasRequest();
        return TeaModel.build(map, self);
    }

    public ListCommonAreasRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public ListCommonAreasRequest setIsEpg(Boolean isEpg) {
        this.isEpg = isEpg;
        return this;
    }
    public Boolean getIsEpg() {
        return this.isEpg;
    }

    public ListCommonAreasRequest setIsIpSet(Boolean isIpSet) {
        this.isIpSet = isIpSet;
        return this;
    }
    public Boolean getIsIpSet() {
        return this.isIpSet;
    }

}
