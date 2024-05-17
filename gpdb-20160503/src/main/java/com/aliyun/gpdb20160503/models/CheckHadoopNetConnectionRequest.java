// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckHadoopNetConnectionRequest extends TeaModel {
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
