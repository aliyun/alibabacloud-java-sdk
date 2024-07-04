// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the auto-renewal feature. Valid values: <strong>True and False</strong>. Default value: False.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal period of the instance. Unit: months. Valid values: 1 to 9 and 12. This parameter is required if the AutoRenew parameter is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The IDs of the instances. Separate IDs with semicolons (;).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-test</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Specifies whether to renew the instance. The <strong>RenewalStatus</strong> parameter has a higher priority than the <strong>AutoRenew</strong> parameter. If you do not specify <strong>RenewalStatus</strong>, the <strong>AutoRenew</strong> parameter is used by default.</p>
     * <ul>
     * <li>AutoRenewal: Auto-renewal is enabled for the instance.</li>
     * <li>Normal: Auto-renewal is disabled for the instance.</li>
     * <li>NotRenewal: The instance is not renewed.</li>
     * </ul>
     * <p>The system no longer sends an expiration notification but sends only a renewal notification three days before the instance expires. To renew the instance, you can change the value of this parameter from NotRenewal to Normal and then manually renew the instance, or change the value of this parameter from NotRenewal to AutoRenewal.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    public static ModifyInstanceAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewAttributeRequest self = new ModifyInstanceAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewAttributeRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public ModifyInstanceAutoRenewAttributeRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public ModifyInstanceAutoRenewAttributeRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyInstanceAutoRenewAttributeRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

}
