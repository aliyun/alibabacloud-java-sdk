// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCommonAreasRequest extends TeaModel {
    /**
     * <p>The IP version used to connect to the GA instance. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong> (default)</li>
     * <li><strong>IPv6</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>Specifies whether to query regions where endpoint groups of GA can be deployed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong> (default): no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsEpg")
    public Boolean isEpg;

    /**
     * <p>Specifies whether to query regions supported by GA. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
