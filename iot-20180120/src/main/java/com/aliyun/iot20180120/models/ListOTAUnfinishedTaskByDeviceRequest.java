// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAUnfinishedTaskByDeviceRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <blockquote>
     * <p>If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device.</p>
     * <blockquote>
     * <p>If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TfmUAeJjQQhCPH84UVNn0010c6****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-c3j***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The name of the OTA module.</p>
     * <ul>
     * <li>If you specify this parameter, update tasks of the specified module are queried.</li>
     * <li>If you do not specify this parameter, update tasks of all modules are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WifiConfigModify</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <blockquote>
     * <p>If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a19mzPZ****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The status of the update task.</p>
     * <ul>
     * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
     * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
     * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
     * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CONFIRM</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TaskStatusList")
    public java.util.List<String> taskStatusList;

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

    public ListOTAUnfinishedTaskByDeviceRequest setTaskStatusList(java.util.List<String> taskStatusList) {
        this.taskStatusList = taskStatusList;
        return this;
    }
    public java.util.List<String> getTaskStatusList() {
        return this.taskStatusList;
    }

}
