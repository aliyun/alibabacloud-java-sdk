// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverVersionRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("DriverId")
    @Validation(required = true)
    public String driverId;

    @NameInMap("DriverVersion")
    public String driverVersion;

    @NameInMap("VersionState")
    public Integer versionState;

    public static QueryEdgeDriverVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverVersionRequest self = new QueryEdgeDriverVersionRequest();
        return TeaModel.build(map, self);
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

    public QueryEdgeDriverVersionRequest setVersionState(Integer versionState) {
        this.versionState = versionState;
        return this;
    }
    public Integer getVersionState() {
        return this.versionState;
    }

}
