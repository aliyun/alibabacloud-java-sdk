// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverVersionRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from Page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Drivers** page, move the pointer over the name of the driver whose versions you want to query and obtain the driver ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeDriver](~~155776~~) operation to query the driver ID.</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>The version number of the driver. To query information about a specific driver version, set this parameter to the specific version number.</p>
     */
    @NameInMap("DriverVersion")
    public String driverVersion;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 30. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the driver version. Valid values:</p>
     * <br>
     * <p>*   0: The driver version to be queried is not published.</p>
     * <p>*   1: The driver version to be queried is published.</p>
     */
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
