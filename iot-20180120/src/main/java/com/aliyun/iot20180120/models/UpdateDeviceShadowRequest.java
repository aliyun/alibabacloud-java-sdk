// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceShadowRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform an incremental update on the **desired** parameter. Valid values:</p>
     * <br>
     * <p>*   **true**: performs an incremental update.</p>
     * <p>*   **false**: performs a full update. This is the default value.</p>
     */
    @NameInMap("DeltaUpdate")
    public Boolean deltaUpdate;

    /**
     * <p>The name of the device whose shadow information you want to modify.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the elastic container instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.****</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The information that you want to specify for the device shadow.</p>
     * <br>
     * <p>The information includes the following parameters:</p>
     * <br>
     * <p>*   **method**: the type of the operation. Data type: string. Set the value to **update**.</p>
     * <br>
     * <p>*   **state**: the status of the device shadow. Data type: string. The **desired** parameter specifies the expected shadow status.</p>
     * <br>
     * <p>*   **version**: the version of the device shadow. Data type: long.</p>
     * <br>
     * <p>    *   If versioning is not required, set this parameter to 0.</p>
     * <p>    *   If versioning is required, specify a version that is later than the current version.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Important** If versioning is required, do not query the version of a device shadow in the IoT Platform console. If a large number of update and query operations are concurrently performed, multiple update operations may return the same version. In this case, the most recent update operation may first be completed. As a result, the current shadow information is not the latest shadow information. We recommend that you maintain the versions of device shadows on the on-premises device. When you call this operation, use an on-premises application to obtain the latest version of the device shadow.</p>
     */
    @NameInMap("ShadowMessage")
    public String shadowMessage;

    public static UpdateDeviceShadowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceShadowRequest self = new UpdateDeviceShadowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceShadowRequest setDeltaUpdate(Boolean deltaUpdate) {
        this.deltaUpdate = deltaUpdate;
        return this;
    }
    public Boolean getDeltaUpdate() {
        return this.deltaUpdate;
    }

    public UpdateDeviceShadowRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UpdateDeviceShadowRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateDeviceShadowRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateDeviceShadowRequest setShadowMessage(String shadowMessage) {
        this.shadowMessage = shadowMessage;
        return this;
    }
    public String getShadowMessage() {
        return this.shadowMessage;
    }

}
