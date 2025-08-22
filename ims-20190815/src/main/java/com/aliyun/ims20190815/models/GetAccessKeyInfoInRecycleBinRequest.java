// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyInfoInRecycleBinRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the Resource Access Management (RAM) user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI*******************</p>
     */
    @NameInMap("UserAccessKeyId")
    public String userAccessKeyId;

    public static GetAccessKeyInfoInRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyInfoInRecycleBinRequest self = new GetAccessKeyInfoInRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyInfoInRecycleBinRequest setUserAccessKeyId(String userAccessKeyId) {
        this.userAccessKeyId = userAccessKeyId;
        return this;
    }
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

}
