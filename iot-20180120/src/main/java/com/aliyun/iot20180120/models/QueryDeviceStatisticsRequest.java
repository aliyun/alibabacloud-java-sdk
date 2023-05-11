// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the group to which the devices belong.</p>
     * <br>
     * <p>*   If you specify this parameter, the statistics of the devices that are added to the group is returned. If you also specify **ProductKey**, the statistics of the devices that are created under the product and added to the group is returned.</p>
     * <p>*   If you do not specify this parameter and **ProductKey**, the statistics of all devices within the current account is returned.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the devices belong.</p>
     * <br>
     * <p>*   If you specify this parameter, the statistics of the devices under the product is returned. If you also specify **GroupId**, the statistics of the devices that are created under the product and added to the group is returned.</p>
     * <p>*   If you do not specify this parameter and **GroupId**, the statistics of all devices within the current account is returned.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDeviceStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatisticsRequest self = new QueryDeviceStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatisticsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryDeviceStatisticsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceStatisticsRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
