// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class FlussResourceSpec extends TeaModel {
    /**
     * <p>The disk capacity of a single TabletServer node, in GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("DiskSizeInGB")
    public Long diskSizeInGB;

    /**
     * <p>The node specifications of the TabletServer.</p>
     * 
     * <strong>example:</strong>
     * <p>4 RCU</p>
     */
    @NameInMap("SlaveModel")
    public String slaveModel;

    /**
     * <p>The number of TabletServer nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SlaveNum")
    public Long slaveNum;

    /**
     * <p>The maximum number of elastic compute resources for the lake-stream synchronization service, in CUs.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TieringPostCu")
    public Long tieringPostCu;

    /**
     * <p>The baseline resource count of the lake-stream synchronization service, in CUs.</p>
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
