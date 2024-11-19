// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedDeviceRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The DeviceName of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>mydevice</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The number of entries to return on each page. Maximum value: 200.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the source instance to which the device belongs.</p>
     * <ul>
     * <li><p>The IDs of public instances in different regions:</p>
     * <ul>
     * <li>China (Shanghai): iotx-oxssharez200.</li>
     * <li>Japan (Tokyo): iotx-oxssharez300.</li>
     * <li>Singapore (Singapore): iotx-oxssharez400.</li>
     * <li>US (Silicon Valley): iotx-oxssharez500.</li>
     * <li>US (Virginia): iotx-oxssharez600.</li>
     * <li>Germany (Frankfurt): iotx-oxssharez700.</li>
     * </ul>
     * </li>
     * <li><p>The IDs of Enterprise Edition instances:</p>
     * <p>1\. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
     * <p>2\. On the <strong>Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the instance ID in the <strong>Basic Information</strong> section.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iot-060***</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account. You can log on to the IoT Platform console, click the profile picture, and then view <strong>Account ID</strong> on the <strong>Security Settings</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>198***</p>
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
