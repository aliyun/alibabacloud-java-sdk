// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class LookupTmchNoticeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2017092100/8/2/1/kDfu9htHGEx_y-LJ3XSlKMZ70000020001</p>
     */
    @NameInMap("ClaimKey")
    public String claimKey;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
