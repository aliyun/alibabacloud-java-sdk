// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetDeviceInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the application. To obtain the application ID, call the ListApplications operation. For more information, see the API documentation of ListApplications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d0639abf-789a-4527-b420-031d2cd9ad9b</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-5si16wo6simkt267p8b7hcmy3</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5sfdblzjqf3zvjnr7oh0bhhj2</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ResetDeviceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceInstanceRequest self = new ResetDeviceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResetDeviceInstanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ResetDeviceInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ResetDeviceInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
