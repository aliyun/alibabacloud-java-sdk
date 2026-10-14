// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PrepareUploadRequest extends TeaModel {
    /**
     * <p>The bucket name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The client\&quot;s IP address. Use this parameter when the client\&quot;s IP address differs from the IP address used to call the API. For example, a server obtains authorization and then sends it to a client.</p>
     * 
     * <strong>example:</strong>
     * <p>180.166.XX.XX</p>
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
