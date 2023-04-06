// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCommonAreasRequest extends TeaModel {
    /**
     * <p>The IP version used to connect to the GA instance. Valid values:</p>
     * <br>
     * <p>*   **IPv4** (default): queries regions that support IPv4.</p>
     * <p>*   **IPv6** :queries regions that support IPv6.</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>Specifies whether to query regions where endpoint groups can be deployed.</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     */
    @NameInMap("IsEpg")
    public Boolean isEpg;

    /**
     * <p>Specifies whether to query regions supported by GA.</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     */
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
