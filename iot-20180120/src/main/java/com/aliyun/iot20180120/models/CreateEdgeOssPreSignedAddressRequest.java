// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceVersion")
    public String resourceVersion;

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
