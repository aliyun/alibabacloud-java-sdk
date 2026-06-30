// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCommonAreasRequest extends TeaModel {
    /**
     * <p>The IP address protocol used to connect to Global Accelerator (GA). Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong> (default): IPv4 address protocol. Queries regions that support IPv4.</li>
     * <li><strong>IPv6</strong>: IPv6 address protocol. Queries regions that support IPv6.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>Specifies whether the region is an endpoint group region supported by Global Accelerator.</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong> (default): No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsEpg")
    public Boolean isEpg;

    /**
     * <p>Specifies whether the region is an acceleration area supported by Global Accelerator.</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong> (default): No.</li>
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
