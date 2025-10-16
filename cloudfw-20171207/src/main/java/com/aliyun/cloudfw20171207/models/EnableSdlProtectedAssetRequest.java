// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class EnableSdlProtectedAssetRequest extends TeaModel {
    @NameInMap("IpList")
    public java.util.List<String> ipList;

    /**
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
