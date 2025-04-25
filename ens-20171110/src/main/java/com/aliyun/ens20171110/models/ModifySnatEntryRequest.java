// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifySnatEntryRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable IP affinity. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * <blockquote>
     * <p> Description After you enable IP affinity, if multiple EIPs are associated with an SNAT entry, one client uses the same EIP to for communication. If IP affinity is disabled, the client uses a random EIP for communication.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EipAffinity")
    public Boolean eipAffinity;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IspAffinity")
    public Boolean ispAffinity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5tfjp36fsrb36zs36faj0****</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>Separate multiple EIPs in the SNAT entry with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>120.XXX.XXX.71</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    public static ModifySnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryRequest self = new ModifySnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryRequest setEipAffinity(Boolean eipAffinity) {
        this.eipAffinity = eipAffinity;
        return this;
    }
    public Boolean getEipAffinity() {
        return this.eipAffinity;
    }

    public ModifySnatEntryRequest setIspAffinity(Boolean ispAffinity) {
        this.ispAffinity = ispAffinity;
        return this;
    }
    public Boolean getIspAffinity() {
        return this.ispAffinity;
    }

    public ModifySnatEntryRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public ModifySnatEntryRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public ModifySnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

}
