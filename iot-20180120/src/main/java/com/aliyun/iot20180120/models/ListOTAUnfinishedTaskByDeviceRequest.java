// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAUnfinishedTaskByDeviceRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>> If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device.</p>
     * <br>
     * <p>> If you specify this parameter, you do not need to specify **ProductKey** or **DeviceName**. The **IotId** parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of **ProductKey** and **DeviceName**. If you specify both **IotId** and the combination of **ProductKey** and **DeviceName**, **IotId** takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

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
     * <p>The name of the OTA module.</p>
     * <br>
     * <p>*   If you specify this parameter, update tasks of the specified module are queried.</p>
     * <p>*   If you do not specify this parameter, update tasks of all modules are queried.</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>> If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The status of the update task.</p>
     * <br>
     * <p>*   **CONFIRM**: The update task is pending confirmation.</p>
     * <p>*   **QUEUED**: The update notification is to be pushed.</p>
     * <p>*   **NOTIFIED**: The update notification is pushed to the device.</p>
     * <p>*   **IN_PROGRESS**: The update task is in progress.</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static ListOTAUnfinishedTaskByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOTAUnfinishedTaskByDeviceRequest self = new ListOTAUnfinishedTaskByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListOTAUnfinishedTaskByDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ListOTAUnfinishedTaskByDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public ListOTAUnfinishedTaskByDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListOTAUnfinishedTaskByDeviceRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListOTAUnfinishedTaskByDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ListOTAUnfinishedTaskByDeviceRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
