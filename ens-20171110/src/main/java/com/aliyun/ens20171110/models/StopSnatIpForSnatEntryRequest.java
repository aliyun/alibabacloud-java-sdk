// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopSnatIpForSnatEntryRequest extends TeaModel {
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
     * <p>221.178.103.143</p>
     */
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
