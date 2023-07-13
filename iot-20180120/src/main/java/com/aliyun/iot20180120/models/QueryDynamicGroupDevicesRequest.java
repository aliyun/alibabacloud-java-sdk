// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDynamicGroupDevicesRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>If you specify this parameter and set **FuzzyName** to **true**, the value you specified is used as the prefix to fuzzy match the DeviceName. The value must be at least 4 characters in length.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>Specifies whether to fuzzy match devices by the value of the **DeviceName** parameter. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("FuzzyName")
    public Boolean fuzzyName;

    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     * <br>
     * <p>You can call the [QueryDeviceGroupList](~~93356~~) operation to query the **GroupId** parameter.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page. Valid values: 1 to 200. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The **ProductKey** of the product to which the devices belong.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The device status. Valid values:</p>
     * <br>
     * <p>*   **ONLINE**: The device is online.</p>
     * <p>*   **OFFLINE**: The device is offline.</p>
     * <p>*   **UNACTIVE**: The device is not activated.</p>
     * <p>*   **DISABLE**: The device is deactivated.</p>
     */
    @NameInMap("Status")
    public String status;

    public static QueryDynamicGroupDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDynamicGroupDevicesRequest self = new QueryDynamicGroupDevicesRequest();
        return TeaModel.build(map, self);
    }

    public QueryDynamicGroupDevicesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryDynamicGroupDevicesRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDynamicGroupDevicesRequest setFuzzyName(Boolean fuzzyName) {
        this.fuzzyName = fuzzyName;
        return this;
    }
    public Boolean getFuzzyName() {
        return this.fuzzyName;
    }

    public QueryDynamicGroupDevicesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryDynamicGroupDevicesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDynamicGroupDevicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryDynamicGroupDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDynamicGroupDevicesRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDynamicGroupDevicesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
