// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddSnatIpForSnatEntryRequest extends TeaModel {
    /**
     * <p>The ID of the SNAT entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5xkzf89dndkzh8yg9stzqz9m4</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>The EIP that you want to add to the SNAT entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>219.152.82.144</p>
     */
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
