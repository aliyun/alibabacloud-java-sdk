// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisDimensionsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDiagnosisDimensionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisDimensionsRequest self = new DescribeDiagnosisDimensionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisDimensionsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
