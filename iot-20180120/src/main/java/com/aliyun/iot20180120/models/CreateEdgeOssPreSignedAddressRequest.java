// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressRequest extends TeaModel {
    /**
     * <p>The name of the object whose URL is to be obtained. The format is `<File name>.<File name extension>`.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance that uses the driver and obtain the instance ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeInstance](~~135214~~) operation to query the instance ID.</p>
     * <br>
     * <p>>  When the **Type** parameter is set to **INSTANCE_DRIVER_VERSION_CONFIG**, this parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the resource for which the object URL is to be obtained. Only driver resources are supported. Set this parameter to the ID of the corresponding driver.</p>
     * <br>
     * <p>To obtain the driver ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Drivers** page, move the pointer over the name of the driver for which the object URL you want to obtain and obtain the driver ID. You can also call the [QueryEdgeDriver](~~155776~~) operation to query the driver ID.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The version number of the resource. Only driver resources are supported. Set this parameter to the version number of the corresponding driver.</p>
     */
    @NameInMap("ResourceVersion")
    public String resourceVersion;

    /**
     * <p>The content type of the object. Valid values:</p>
     * <br>
     * <p>*   DRIVER_VERSION_CONTENT: the code of a specific driver version.</p>
     * <p>*   DRIVER_VERSION_DEFAULT_CONFIG: the default configuration of a specific driver version.</p>
     * <p>*   INSTANCE_DRIVER_VERSION_CONFIG: the configuration of a specific driver version that is used in an edge instance.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateEdgeOssPreSignedAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeOssPreSignedAddressRequest self = new CreateEdgeOssPreSignedAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeOssPreSignedAddressRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateEdgeOssPreSignedAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEdgeOssPreSignedAddressRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeOssPreSignedAddressRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateEdgeOssPreSignedAddressRequest setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public CreateEdgeOssPreSignedAddressRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
