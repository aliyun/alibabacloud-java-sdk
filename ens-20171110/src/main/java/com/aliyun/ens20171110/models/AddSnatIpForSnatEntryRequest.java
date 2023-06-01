// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddSnatIpForSnatEntryRequest extends TeaModel {
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    @NameInMap("SnatIp")
    public String snatIp;

    public static AddSnatIpForSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSnatIpForSnatEntryRequest self = new AddSnatIpForSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public AddSnatIpForSnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public AddSnatIpForSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

}
