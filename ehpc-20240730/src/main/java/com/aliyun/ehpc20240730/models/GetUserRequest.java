// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> to obtain the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testuser</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
