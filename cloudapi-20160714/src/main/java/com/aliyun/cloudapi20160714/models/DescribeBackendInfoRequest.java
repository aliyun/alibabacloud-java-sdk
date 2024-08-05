// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendInfoRequest extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>739b68751c0b4e899e04d0c92b6d0be7</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeBackendInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendInfoRequest self = new DescribeBackendInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackendInfoRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public DescribeBackendInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
