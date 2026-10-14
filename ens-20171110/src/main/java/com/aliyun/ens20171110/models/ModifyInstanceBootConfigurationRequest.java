// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceBootConfigurationRequest extends TeaModel {
    /**
     * <p>The boot method.</p>
     * 
     * <strong>example:</strong>
     * <p>legacy</p>
     */
    @NameInMap("BootSet")
    public String bootSet;

    /**
     * <p>The boot type.
     * Governance testing has confirmed that the value disk passes parameter validation, whereas the original example value pxe returns Parameter.Invalid. Other values have not been confirmed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disk</p>
     */
    @NameInMap("BootType")
    public String bootType;

    /**
     * <p>Specifies whether the boot process depends on a disk.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("DiskSet")
    public String diskSet;

    /**
     * <p>The ID of the instance whose boot configuration you want to modify. You can specify only one instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-instance****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyInstanceBootConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceBootConfigurationRequest self = new ModifyInstanceBootConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceBootConfigurationRequest setBootSet(String bootSet) {
        this.bootSet = bootSet;
        return this;
    }
    public String getBootSet() {
        return this.bootSet;
    }

    public ModifyInstanceBootConfigurationRequest setBootType(String bootType) {
        this.bootType = bootType;
        return this;
    }
    public String getBootType() {
        return this.bootType;
    }

    public ModifyInstanceBootConfigurationRequest setDiskSet(String diskSet) {
        this.diskSet = diskSet;
        return this;
    }
    public String getDiskSet() {
        return this.diskSet;
    }

    public ModifyInstanceBootConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
