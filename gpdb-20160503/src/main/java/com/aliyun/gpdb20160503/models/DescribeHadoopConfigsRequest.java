// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopConfigsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigName")
    public String configName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeHadoopConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHadoopConfigsRequest self = new DescribeHadoopConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHadoopConfigsRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public DescribeHadoopConfigsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeHadoopConfigsRequest setEmrInstanceId(String emrInstanceId) {
        this.emrInstanceId = emrInstanceId;
        return this;
    }
    public String getEmrInstanceId() {
        return this.emrInstanceId;
    }

    public DescribeHadoopConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
