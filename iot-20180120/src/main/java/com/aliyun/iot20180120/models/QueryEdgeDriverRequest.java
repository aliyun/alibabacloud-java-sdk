// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1. If you specify a value smaller than 1, pages start from page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the driver whose information is to be queried. If you want to query information about drivers with a specific name, set this parameter.</p>
     */
    @NameInMap("DriverName")
    public String driverName;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for public instances. However, this parameter is required for the instances that you have purchased.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 30. Default value: 10. If you specify a value smaller than 1, a maximum of 10 entries are displayed on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the driver whose information is to be queried. Valid values:</p>
     * <br>
     * <p>*   0: official driver</p>
     * <p>*   1: custom driver</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static QueryEdgeDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverRequest self = new QueryEdgeDriverRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeDriverRequest setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
    public String getDriverName() {
        return this.driverName;
    }

    public QueryEdgeDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeDriverRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEdgeDriverRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
