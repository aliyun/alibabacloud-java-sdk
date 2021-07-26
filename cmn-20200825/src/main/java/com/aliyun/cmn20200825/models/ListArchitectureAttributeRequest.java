// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListArchitectureAttributeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 架构id
    @NameInMap("ArchitectureId")
    public String architectureId;

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

    public ListArchitectureAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListArchitectureAttributeRequest setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
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
