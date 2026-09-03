// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeFeatureTrialInfoRequest extends TeaModel {
    /**
     * <p>The feature type. Currently, only the free trial information of Tablestore backup can be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OTS_BACKUP</p>
     */
    @NameInMap("FeatureType")
    public String featureType;

    public static DescribeFeatureTrialInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFeatureTrialInfoRequest self = new DescribeFeatureTrialInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFeatureTrialInfoRequest setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }
    public String getFeatureType() {
        return this.featureType;
    }

}
