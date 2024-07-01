// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class LookupTmchNoticeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClaimKey")
    public String claimKey;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static LookupTmchNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupTmchNoticeRequest self = new LookupTmchNoticeRequest();
        return TeaModel.build(map, self);
    }

    public LookupTmchNoticeRequest setClaimKey(String claimKey) {
        this.claimKey = claimKey;
        return this;
    }
    public String getClaimKey() {
        return this.claimKey;
    }

    public LookupTmchNoticeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public LookupTmchNoticeRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
