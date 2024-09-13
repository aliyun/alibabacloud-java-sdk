// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PrepareUploadRequest extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The specified IP address. This parameter is applicable to scenarios where the user IP address is inconsistent with the operation calling IP address, such as the scenario where the server obtains authorization and sends the authorization to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>180.166.XX.XXX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    public static PrepareUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        PrepareUploadRequest self = new PrepareUploadRequest();
        return TeaModel.build(map, self);
    }

    public PrepareUploadRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public PrepareUploadRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

}
