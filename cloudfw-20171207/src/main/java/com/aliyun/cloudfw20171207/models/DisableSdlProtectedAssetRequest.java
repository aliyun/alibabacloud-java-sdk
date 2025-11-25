// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DisableSdlProtectedAssetRequest extends TeaModel {
    @NameInMap("IpList")
    public java.util.List<String> ipList;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DisableSdlProtectedAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSdlProtectedAssetRequest self = new DisableSdlProtectedAssetRequest();
        return TeaModel.build(map, self);
    }

    public DisableSdlProtectedAssetRequest setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public DisableSdlProtectedAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
