// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDiskWarningLineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp1bl7iqzkahmyxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeDiskWarningLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskWarningLineRequest self = new DescribeDiskWarningLineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskWarningLineRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
