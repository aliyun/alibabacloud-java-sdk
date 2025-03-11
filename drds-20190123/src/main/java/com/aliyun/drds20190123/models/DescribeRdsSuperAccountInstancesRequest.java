// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsSuperAccountInstancesRequest extends TeaModel {
    /**
     * <p>The type of the ApsaraDB RDS for MySQL instances. Default value: <strong>RDS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("DbInstType")
    public String dbInstType;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds************</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;rm-<em><strong><strong><strong><strong><strong><strong><strong><strong>\&quot;,\&quot;rm-</strong></strong></strong></strong></strong></strong></strong></strong></em>\&quot;]</p>
     */
    @NameInMap("RdsInstance")
    public java.util.List<String> rdsInstance;

    public static DescribeRdsSuperAccountInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsSuperAccountInstancesRequest self = new DescribeRdsSuperAccountInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsSuperAccountInstancesRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public DescribeRdsSuperAccountInstancesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRdsSuperAccountInstancesRequest setRdsInstance(java.util.List<String> rdsInstance) {
        this.rdsInstance = rdsInstance;
        return this;
    }
    public java.util.List<String> getRdsInstance() {
        return this.rdsInstance;
    }

}
