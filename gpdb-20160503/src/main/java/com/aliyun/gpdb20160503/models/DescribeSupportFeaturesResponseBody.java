// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSupportFeaturesResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RequestId")
    public String requestId;

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
