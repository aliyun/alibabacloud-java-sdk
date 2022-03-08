// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListArchitectureAttributeRequest extends TeaModel {
    // 架构id
    @NameInMap("ArchitectureId")
    public String architectureId;

    @NameInMap("InstanceId")
    public String instanceId;

    // 角色
    @NameInMap("Role")
    public String role;

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    public static ListArchitectureAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArchitectureAttributeRequest self = new ListArchitectureAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ListArchitectureAttributeRequest setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
    }

    public ListArchitectureAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListArchitectureAttributeRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListArchitectureAttributeRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
