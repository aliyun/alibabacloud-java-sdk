// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteUsersRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserNames")
    public java.util.List<String> userNames;

    public static DeleteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersRequest self = new DeleteUsersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteUsersRequest setUserNames(java.util.List<String> userNames) {
        this.userNames = userNames;
        return this;
    }
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

}
