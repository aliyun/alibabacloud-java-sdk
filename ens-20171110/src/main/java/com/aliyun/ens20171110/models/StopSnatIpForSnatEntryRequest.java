// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopSnatIpForSnatEntryRequest extends TeaModel {
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    @NameInMap("SnatIp")
    public String snatIp;

    public static StopSnatIpForSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSnatIpForSnatEntryRequest self = new StopSnatIpForSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public StopSnatIpForSnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public StopSnatIpForSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

}
