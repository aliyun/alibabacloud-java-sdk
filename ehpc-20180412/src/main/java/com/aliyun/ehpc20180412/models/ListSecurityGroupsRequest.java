// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsRequest self = new ListSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
