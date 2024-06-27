// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHadoopConfigsRequest extends TeaModel {
    /**
     * <p>The name of the configuration file. Valid values:</p>
     * <ul>
     * <li>hdfs-site</li>
     * <li>core-site</li>
     * <li>yarn-site</li>
     * <li>mapred-site</li>
     * <li>hive-site</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdfs-site</p>
     */
    @NameInMap("ConfigName")
    public String configName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The E-MapReduce (EMR) Hadoop cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-xxx</p>
     */
    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
