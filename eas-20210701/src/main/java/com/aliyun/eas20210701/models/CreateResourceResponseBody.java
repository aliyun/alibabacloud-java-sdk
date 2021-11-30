// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceResponseBody extends TeaModel {
    // 资源组所在集群ID
    @NameInMap("ClusterId")
    public String clusterId;

    // 资源组的Owner UID
    @NameInMap("OwnerUid")
    public String ownerUid;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源组ID
    @NameInMap("ResourceID")
    public String resourceID;

    // 资源组名称
    @NameInMap("ResourceName")
    public String resourceName;

    public static CreateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceResponseBody self = new CreateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateResourceResponseBody setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public CreateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceResponseBody setResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }
    public String getResourceID() {
        return this.resourceID;
    }

    public CreateResourceResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

}
