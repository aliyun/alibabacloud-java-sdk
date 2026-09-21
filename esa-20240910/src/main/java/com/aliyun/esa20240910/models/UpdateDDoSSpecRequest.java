// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateDDoSSpecRequest extends TeaModel {
    /**
     * <p>The billing method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CleanTraffic</p>
     */
    @NameInMap("DDoSBillingMode")
    public String DDoSBillingMode;

    /**
     * <p>The instance specification for Chinese mainland.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn_300</p>
     */
    @NameInMap("DDoSBurstableDomesticProtection")
    public String DDoSBurstableDomesticProtection;

    /**
     * <p>The instance specification for regions outside Chinese mainland.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>overseas_300</p>
     */
    @NameInMap("DDoSBurstableOverseasProtection")
    public String DDoSBurstableOverseasProtection;

    /**
     * <p>The instance ID. You can call the ListDDoSInstances operation to query the list of DDoS instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-ddos-9tuv*********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateDDoSSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDDoSSpecRequest self = new UpdateDDoSSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDDoSSpecRequest setDDoSBillingMode(String DDoSBillingMode) {
        this.DDoSBillingMode = DDoSBillingMode;
        return this;
    }
    public String getDDoSBillingMode() {
        return this.DDoSBillingMode;
    }

    public UpdateDDoSSpecRequest setDDoSBurstableDomesticProtection(String DDoSBurstableDomesticProtection) {
        this.DDoSBurstableDomesticProtection = DDoSBurstableDomesticProtection;
        return this;
    }
    public String getDDoSBurstableDomesticProtection() {
        return this.DDoSBurstableDomesticProtection;
    }

    public UpdateDDoSSpecRequest setDDoSBurstableOverseasProtection(String DDoSBurstableOverseasProtection) {
        this.DDoSBurstableOverseasProtection = DDoSBurstableOverseasProtection;
        return this;
    }
    public String getDDoSBurstableOverseasProtection() {
        return this.DDoSBurstableOverseasProtection;
    }

    public UpdateDDoSSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
