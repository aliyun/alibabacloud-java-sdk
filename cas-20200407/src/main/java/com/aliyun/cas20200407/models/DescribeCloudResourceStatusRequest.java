// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceStatusRequest extends TeaModel {
    /**
     * <p>The AccessKey secret used to access cloud resources.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2712219.html">ListCloudAccess</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AKID9*******XX</p>
     */
    @NameInMap("SecretId")
    public String secretId;

    public static DescribeCloudResourceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceStatusRequest self = new DescribeCloudResourceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceStatusRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
