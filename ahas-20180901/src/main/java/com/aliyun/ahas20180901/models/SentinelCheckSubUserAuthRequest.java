// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelCheckSubUserAuthRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    public static SentinelCheckSubUserAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelCheckSubUserAuthRequest self = new SentinelCheckSubUserAuthRequest();
        return TeaModel.build(map, self);
    }

    public SentinelCheckSubUserAuthRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelCheckSubUserAuthRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
