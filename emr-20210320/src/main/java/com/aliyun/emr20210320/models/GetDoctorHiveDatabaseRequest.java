// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorHiveDatabaseRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The database name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The query date.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDoctorHiveDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorHiveDatabaseRequest self = new GetDoctorHiveDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorHiveDatabaseRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorHiveDatabaseRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetDoctorHiveDatabaseRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorHiveDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
