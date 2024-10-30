// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopNetConnectionRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <ol>
     * <li>Either DataSourceId or EmrInstanceId must be specified as input, otherwise an error will occur.</li>
     * <li>If both of the above parameters are specified, EmrInstanceId will be used preferentially.</li>
     * <li>If the data source specified by DataSourceId is a self-built Hadoop cluster, an error will occur directly.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>126</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>EMR instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-xxx</p>
     */
    @NameInMap("EmrInstanceId")
    public String emrInstanceId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CheckHadoopNetConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckHadoopNetConnectionRequest self = new CheckHadoopNetConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CheckHadoopNetConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CheckHadoopNetConnectionRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CheckHadoopNetConnectionRequest setEmrInstanceId(String emrInstanceId) {
        this.emrInstanceId = emrInstanceId;
        return this;
    }
    public String getEmrInstanceId() {
        return this.emrInstanceId;
    }

    public CheckHadoopNetConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
