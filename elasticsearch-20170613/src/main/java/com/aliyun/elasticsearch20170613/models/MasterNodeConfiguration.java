// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MasterNodeConfiguration extends TeaModel {
    /**
     * <p>The number of dedicated master nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>The storage space of dedicated master nodes. Unit: GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("disk")
    public Long disk;

    /**
     * <p>The storage type of dedicated master nodes. Valid values:</p>
     * <ul>
     * <li>cloud_ssd: standard SSD</li>
     * <li>cloud_essd (default): Enterprise SSD (ESSD).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>The node specifications of dedicated master nodes. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>elasticsearch.sn2ne.large</p>
     */
    @NameInMap("spec")
    public String spec;

    public static MasterNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        MasterNodeConfiguration self = new MasterNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public MasterNodeConfiguration setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public MasterNodeConfiguration setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

    public MasterNodeConfiguration setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public MasterNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
