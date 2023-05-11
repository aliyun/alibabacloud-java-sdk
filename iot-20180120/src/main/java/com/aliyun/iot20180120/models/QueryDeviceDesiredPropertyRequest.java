// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDesiredPropertyRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, you must configure the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <br>
     * <p>If you do not configure this parameter, the system queries the data of the default module.</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("Identifier")
    public java.util.List<String> identifier;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, you do not need to configure the **ProductKey** or **DeviceName** parameter. The **IotId** parameter specifies a GUID for the device. The value of the IotId parameter is equivalent to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify values for the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or ID is generated for your instance, you do not need configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, you must configure the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDeviceDesiredPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDesiredPropertyRequest self = new QueryDeviceDesiredPropertyRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDesiredPropertyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceDesiredPropertyRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public QueryDeviceDesiredPropertyRequest setIdentifier(java.util.List<String> identifier) {
        this.identifier = identifier;
        return this;
    }
    public java.util.List<String> getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceDesiredPropertyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceDesiredPropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceDesiredPropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
