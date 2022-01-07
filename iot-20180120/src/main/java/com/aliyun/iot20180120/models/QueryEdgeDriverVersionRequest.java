// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverVersionRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("DriverVersion")
    public String driverVersion;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VersionState")
    public Integer versionState;

    public static QueryEdgeDriverVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverVersionRequest self = new QueryEdgeDriverVersionRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverVersionRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeDriverVersionRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public QueryEdgeDriverVersionRequest setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }
    public String getDriverVersion() {
        return this.driverVersion;
    }

    public QueryEdgeDriverVersionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeDriverVersionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEdgeDriverVersionRequest setVersionState(Integer versionState) {
        this.versionState = versionState;
        return this;
    }
    public Integer getVersionState() {
        return this.versionState;
    }

}
