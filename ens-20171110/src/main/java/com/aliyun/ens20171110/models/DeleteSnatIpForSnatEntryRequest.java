// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSnatIpForSnatEntryRequest extends TeaModel {
    /**
     * <p>The ID of the SNAT entry.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>The EIP that you want to delete from the SNAT entry.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
