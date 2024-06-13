// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DataImageRegionDistributeMapValue extends TeaModel {
    @NameInMap("DistributeStatus")
    public String distributeStatus;

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
