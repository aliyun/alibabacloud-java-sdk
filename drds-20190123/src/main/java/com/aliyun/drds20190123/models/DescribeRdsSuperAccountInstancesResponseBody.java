// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsSuperAccountInstancesResponseBody extends TeaModel {
    /**
     * <p>The privileged accounts.</p>
     */
    @NameInMap("DbInstances")
    public DescribeRdsSuperAccountInstancesResponseBodyDbInstances dbInstances;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRdsSuperAccountInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSuperAccountInstancesResponseBody self = new DescribeRdsSuperAccountInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSuperAccountInstancesResponseBody setDbInstances(DescribeRdsSuperAccountInstancesResponseBodyDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeRdsSuperAccountInstancesResponseBodyDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public DescribeRdsSuperAccountInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRdsSuperAccountInstancesResponseBodyDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        public java.util.List<String> dbInstance;

        public static DescribeRdsSuperAccountInstancesResponseBodyDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsSuperAccountInstancesResponseBodyDbInstances self = new DescribeRdsSuperAccountInstancesResponseBodyDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRdsSuperAccountInstancesResponseBodyDbInstances setDbInstance(java.util.List<String> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<String> getDbInstance() {
            return this.dbInstance;
        }

    }

}
