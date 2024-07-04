// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartSnatIpForSnatEntryRequest extends TeaModel {
    /**
     * <p>The ID of the SNAT entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5tfi6f8gds82mjmlofeym****</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>The EIP specified in the SNAT entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>219.152.82.143</p>
     */
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
