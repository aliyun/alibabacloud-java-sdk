// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCustomDomainSampleRateRequest extends TeaModel {
    @NameInMap("BaseConfigID")
    public String baseConfigID;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SampleRate")
    public Float sampleRate;

    @NameInMap("SinkID")
    public Long sinkID;

    public static ModifyCustomDomainSampleRateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomDomainSampleRateRequest self = new ModifyCustomDomainSampleRateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomDomainSampleRateRequest setBaseConfigID(String baseConfigID) {
        this.baseConfigID = baseConfigID;
        return this;
    }
    public String getBaseConfigID() {
        return this.baseConfigID;
    }

    public ModifyCustomDomainSampleRateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyCustomDomainSampleRateRequest setSampleRate(Float sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Float getSampleRate() {
        return this.sampleRate;
    }

    public ModifyCustomDomainSampleRateRequest setSinkID(Long sinkID) {
        this.sinkID = sinkID;
        return this;
    }
    public Long getSinkID() {
        return this.sinkID;
    }

}
