// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class EnableSdlProtectedAssetRequest extends TeaModel {
    /**
     * <p>The list of IP assets. At least one IP address is required to enable protection.</p>
     */
    @NameInMap("IpList")
    public java.util.List<String> ipList;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static EnableSdlProtectedAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSdlProtectedAssetRequest self = new EnableSdlProtectedAssetRequest();
        return TeaModel.build(map, self);
    }

    public EnableSdlProtectedAssetRequest setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public EnableSdlProtectedAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
