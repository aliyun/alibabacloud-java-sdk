// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseInstanceRequest extends TeaModel {
    /**
     * <p>The name of the Object Storage Service (OSS) bucket.</p>
     * <br>
     * <p>>  The bucket must be in the same region as the Image Search instance.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The callback address.</p>
     */
    @NameInMap("CallbackAddress")
    public String callbackAddress;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The absolute path to the increment.meta file in the bucket. The path must start with a forward slash (/) and cannot end with a forward slash (/).</p>
     */
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
