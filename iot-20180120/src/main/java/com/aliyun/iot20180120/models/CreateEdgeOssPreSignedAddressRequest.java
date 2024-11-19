// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressRequest extends TeaModel {
    /**
     * <p>The name of the object whose URL is to be obtained. The format is <code>&lt;File name&gt;.&lt;File name extension&gt;</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testfile.zip</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance that uses the driver and obtain the instance ID.</p>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
     * <blockquote>
     * <p> When the <strong>Type</strong> parameter is set to <strong>INSTANCE_DRIVER_VERSION_CONFIG</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>F3APY0tPLhmgGtx0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the resource for which the object URL is to be obtained. Only driver resources are supported. Set this parameter to the ID of the corresponding driver.</p>
     * <p>To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver for which the object URL you want to obtain and obtain the driver ID. You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df9b9f441*********4c90d0c21d14</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The version number of the resource. Only driver resources are supported. Set this parameter to the version number of the corresponding driver.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("ResourceVersion")
    public String resourceVersion;

    /**
     * <p>The content type of the object. Valid values:</p>
     * <ul>
     * <li>DRIVER_VERSION_CONTENT: the code of a specific driver version.</li>
     * <li>DRIVER_VERSION_DEFAULT_CONFIG: the default configuration of a specific driver version.</li>
     * <li>INSTANCE_DRIVER_VERSION_CONFIG: the configuration of a specific driver version that is used in an edge instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DRIVER_VERSION_CONTENT</p>
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
