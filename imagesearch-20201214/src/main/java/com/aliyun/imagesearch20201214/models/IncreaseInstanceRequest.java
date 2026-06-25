// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseInstanceRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     * <blockquote>
     * <p>Only a bucket in the same region as the instance is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketName</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The callback URL of the task.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxxx">http://xxxxx</a></p>
     */
    @NameInMap("CallbackAddress")
    public String callbackAddress;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, refer to <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Make sure that you distinguish between the two.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imagesearchName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The absolute path of the increment.meta file in OSS. The path must start with a forward slash (/) and must not end with a forward slash (/).</p>
     * <blockquote>
     * <p>Prepare the increment.meta file in advance. For more information, see <a href="https://help.aliyun.com/document_detail/66580.html">Batch operations</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/xxx/xxx</p>
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
