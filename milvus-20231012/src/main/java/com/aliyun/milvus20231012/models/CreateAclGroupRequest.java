// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateAclGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>140.205.11.0/24,140.205.11.2</p>
     */
    @NameInMap("cidrs")
    public String cidrs;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <strong>example:</strong>
     * <p>c-xxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateAclGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclGroupRequest self = new CreateAclGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclGroupRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public CreateAclGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateAclGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAclGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
