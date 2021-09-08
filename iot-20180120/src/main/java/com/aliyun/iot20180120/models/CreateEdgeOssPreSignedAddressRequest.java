// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Type")
    public String type;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceVersion")
    public String resourceVersion;

    public static CreateEdgeOssPreSignedAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeOssPreSignedAddressRequest self = new CreateEdgeOssPreSignedAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeOssPreSignedAddressRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateEdgeOssPreSignedAddressRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateEdgeOssPreSignedAddressRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeOssPreSignedAddressRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateEdgeOssPreSignedAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEdgeOssPreSignedAddressRequest setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

}
