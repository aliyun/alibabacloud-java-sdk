// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReinitInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the image file that is used to reset the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-5wn1dhz5syoo9b48f440ntvad</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5vn4n3y4laeb2ii9zxxltlvzi</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The password of the instance.</p>
     * <p>It must be 8 to 30 characters in length. It must include at least three of the following characters types: uppercase letters, lowercase letters, digits, and special characters. The following special character are supported: <code>()\\&quot;~! @#$%^&amp;*-_+={}[]:;\\&quot;&lt;&gt;,.?/</code></p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    public static ReinitInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitInstanceRequest self = new ReinitInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReinitInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ReinitInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReinitInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
