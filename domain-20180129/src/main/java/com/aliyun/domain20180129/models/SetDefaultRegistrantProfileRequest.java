// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetDefaultRegistrantProfileRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    public static SetDefaultRegistrantProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultRegistrantProfileRequest self = new SetDefaultRegistrantProfileRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultRegistrantProfileRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SetDefaultRegistrantProfileRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

}
