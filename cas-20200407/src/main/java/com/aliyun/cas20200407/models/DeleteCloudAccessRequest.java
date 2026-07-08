// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCloudAccessRequest extends TeaModel {
    /**
     * <p>The ID of the access key.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    public static DeleteCloudAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudAccessRequest self = new DeleteCloudAccessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudAccessRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

}
