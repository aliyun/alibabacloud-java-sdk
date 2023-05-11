// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedDeviceRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The DeviceName of the device.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The number of entries to return on each page. Maximum value: 200.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The **ProductKey** of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the source instance to which the device belongs.</p>
     * <br>
     * <p>*   The IDs of public instances in different regions:</p>
     * <br>
     * <p>    *   China (Shanghai): iotx-oxssharez200.</p>
     * <p>    *   Japan (Tokyo): iotx-oxssharez300.</p>
     * <p>    *   Singapore (Singapore): iotx-oxssharez400.</p>
     * <p>    *   US (Silicon Valley): iotx-oxssharez500.</p>
     * <p>    *   US (Virginia): iotx-oxssharez600.</p>
     * <p>    *   Germany (Frankfurt): iotx-oxssharez700.</p>
     * <br>
     * <p>*   The IDs of Enterprise Edition instances:</p>
     * <br>
     * <p>    1\. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
     * <br>
     * <p>    2\. On the **Overview** page, click the instance name. On the **Instance Details** page, view the instance ID in the **Basic Information** section.</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account. You can log on to the IoT Platform console, click the profile picture, and then view **Account ID** on the **Security Settings** page.</p>
     */
    @NameInMap("TargetUid")
    public String targetUid;

    public static ListDistributedDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedDeviceRequest self = new ListDistributedDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributedDeviceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDistributedDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ListDistributedDeviceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistributedDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListDistributedDeviceRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListDistributedDeviceRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

}
