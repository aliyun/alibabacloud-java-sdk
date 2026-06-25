// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DataImageRegionDistributeMapValue extends TeaModel {
    /**
     * <p>The distribution status.</p>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("DistributeStatus")
    public String distributeStatus;

    /**
     * <p>The distribution progress.</p>
     * 
     * <strong>example:</strong>
     * <p>100%</p>
     */
    @NameInMap("Progress")
    public String progress;

    public static DataImageRegionDistributeMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataImageRegionDistributeMapValue self = new DataImageRegionDistributeMapValue();
        return TeaModel.build(map, self);
    }

    public DataImageRegionDistributeMapValue setDistributeStatus(String distributeStatus) {
        this.distributeStatus = distributeStatus;
        return this;
    }
    public String getDistributeStatus() {
        return this.distributeStatus;
    }

    public DataImageRegionDistributeMapValue setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

}
