// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class DeleteRegistrantProfileRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DeleteRegistrantProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistrantProfileRequest self = new DeleteRegistrantProfileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRegistrantProfileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteRegistrantProfileRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public DeleteRegistrantProfileRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
