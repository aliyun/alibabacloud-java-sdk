// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class FlussResourceSpec extends TeaModel {
    /**
     * <p>Disk size per node, in GB.</p>
     */
    @NameInMap("DiskSizeInGB")
    public Long diskSizeInGB;

    /**
     * <p>Instance type of the slave nodes.</p>
     */
    @NameInMap("SlaveModel")
    public String slaveModel;

    /**
     * <p>Number of slave nodes.</p>
     */
    @NameInMap("SlaveNum")
    public Long slaveNum;

    /**
     * <p>Number of CUs for the post-tiering stage.</p>
     */
    @NameInMap("TieringPostCu")
    public Long tieringPostCu;

    /**
     * <p>Number of compute units (CUs) for the pre-tiering stage.</p>
     */
    @NameInMap("TieringPreCu")
    public Long tieringPreCu;

    public static FlussResourceSpec build(java.util.Map<String, ?> map) throws Exception {
        FlussResourceSpec self = new FlussResourceSpec();
        return TeaModel.build(map, self);
    }

    public FlussResourceSpec setDiskSizeInGB(Long diskSizeInGB) {
        this.diskSizeInGB = diskSizeInGB;
        return this;
    }
    public Long getDiskSizeInGB() {
        return this.diskSizeInGB;
    }

    public FlussResourceSpec setSlaveModel(String slaveModel) {
        this.slaveModel = slaveModel;
        return this;
    }
    public String getSlaveModel() {
        return this.slaveModel;
    }

    public FlussResourceSpec setSlaveNum(Long slaveNum) {
        this.slaveNum = slaveNum;
        return this;
    }
    public Long getSlaveNum() {
        return this.slaveNum;
    }

    public FlussResourceSpec setTieringPostCu(Long tieringPostCu) {
        this.tieringPostCu = tieringPostCu;
        return this;
    }
    public Long getTieringPostCu() {
        return this.tieringPostCu;
    }

    public FlussResourceSpec setTieringPreCu(Long tieringPreCu) {
        this.tieringPreCu = tieringPreCu;
        return this;
    }
    public Long getTieringPreCu() {
        return this.tieringPreCu;
    }

}
