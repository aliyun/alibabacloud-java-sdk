// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSnatIpForSnatEntryRequest extends TeaModel {
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    @NameInMap("SnatIp")
    public String snatIp;

    public static DeleteSnatIpForSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatIpForSnatEntryRequest self = new DeleteSnatIpForSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnatIpForSnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public DeleteSnatIpForSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

}
