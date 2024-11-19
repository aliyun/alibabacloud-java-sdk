// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceShadowRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform an incremental update on the <strong>desired</strong> parameter. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs an incremental update.</li>
     * <li><strong>false</strong>: performs a full update. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeltaUpdate")
    public Boolean deltaUpdate;

    /**
     * <p>The name of the device whose shadow information you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the elastic container instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1T27vz****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The information that you want to specify for the device shadow.</p>
     * <p>The information includes the following parameters:</p>
     * <ul>
     * <li><p><strong>method</strong>: the type of the operation. Data type: string. Set the value to <strong>update</strong>.</p>
     * </li>
     * <li><p><strong>state</strong>: the status of the device shadow. Data type: string. The <strong>desired</strong> parameter specifies the expected shadow status.</p>
     * </li>
     * <li><p><strong>version</strong>: the version of the device shadow. Data type: long.</p>
     * <ul>
     * <li>If versioning is not required, set this parameter to 0.</li>
     * <li>If versioning is required, specify a version that is later than the current version.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>**</p>
     * <p><strong>Important</strong> If versioning is required, do not query the version of a device shadow in the IoT Platform console. If a large number of update and query operations are concurrently performed, multiple update operations may return the same version. In this case, the most recent update operation may first be completed. As a result, the current shadow information is not the latest shadow information. We recommend that you maintain the versions of device shadows on the on-premises device. When you call this operation, use an on-premises application to obtain the latest version of the device shadow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;method&quot;:&quot;update&quot;,&quot;state&quot;:{&quot;desired&quot;:{&quot;color&quot;:&quot;green&quot;}},&quot;version&quot;:2}</p>
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
