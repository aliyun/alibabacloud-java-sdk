// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseInstanceRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("CallbackAddress")
    public String callbackAddress;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Path")
    public String path;

    public static IncreaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseInstanceRequest self = new IncreaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public IncreaseInstanceRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public IncreaseInstanceRequest setCallbackAddress(String callbackAddress) {
        this.callbackAddress = callbackAddress;
        return this;
    }
    public String getCallbackAddress() {
        return this.callbackAddress;
    }

    public IncreaseInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public IncreaseInstanceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
