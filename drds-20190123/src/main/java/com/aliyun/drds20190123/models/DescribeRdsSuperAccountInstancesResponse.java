// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsSuperAccountInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DbInstances")
    @Validation(required = true)
    public DescribeRdsSuperAccountInstancesResponseDbInstances dbInstances;

    public static DescribeRdsSuperAccountInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSuperAccountInstancesResponse self = new DescribeRdsSuperAccountInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSuperAccountInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsSuperAccountInstancesResponse setDbInstances(DescribeRdsSuperAccountInstancesResponseDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeRdsSuperAccountInstancesResponseDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public static class DescribeRdsSuperAccountInstancesResponseDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        @Validation(required = true)
        public java.util.List<String> dbInstance;

        public static DescribeRdsSuperAccountInstancesResponseDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsSuperAccountInstancesResponseDbInstances self = new DescribeRdsSuperAccountInstancesResponseDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRdsSuperAccountInstancesResponseDbInstances setDbInstance(java.util.List<String> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<String> getDbInstance() {
            return this.dbInstance;
        }

    }

}
