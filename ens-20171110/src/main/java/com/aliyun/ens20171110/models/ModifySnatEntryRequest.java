// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifySnatEntryRequest extends TeaModel {
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
