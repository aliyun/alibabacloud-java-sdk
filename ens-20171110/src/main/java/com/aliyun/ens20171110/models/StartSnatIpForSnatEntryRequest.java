// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartSnatIpForSnatEntryRequest extends TeaModel {
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    @NameInMap("SnatIp")
    public String snatIp;

    public static StartSnatIpForSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSnatIpForSnatEntryRequest self = new StartSnatIpForSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public StartSnatIpForSnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public StartSnatIpForSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

}
