// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSupportFeaturesResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The features supported by the instance. Valid values:</p>
     * <br>
     * <p>*   sample_data: sample dataset. For more information, see [Sample dataset](~~452278~~).</p>
     * <p>*   diagnose_and_optimize: diagnostics and optimization. For more information, see [Diagnostics and optimization](~~323453~~).</p>
     */
    @NameInMap("SupportFeatureList")
    public String supportFeatureList;

    public static DescribeSupportFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportFeaturesResponseBody self = new DescribeSupportFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportFeaturesResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSupportFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportFeaturesResponseBody setSupportFeatureList(String supportFeatureList) {
        this.supportFeatureList = supportFeatureList;
        return this;
    }
    public String getSupportFeatureList() {
        return this.supportFeatureList;
    }

}
