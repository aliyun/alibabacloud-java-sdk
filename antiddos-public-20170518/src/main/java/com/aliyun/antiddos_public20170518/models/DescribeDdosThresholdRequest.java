// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosThresholdRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("DdosType")
    public String ddosType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DescribeDdosThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosThresholdRequest self = new DescribeDdosThresholdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosThresholdRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDdosThresholdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDdosThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeDdosThresholdRequest setDdosType(String ddosType) {
        this.ddosType = ddosType;
        return this;
    }
    public String getDdosType() {
        return this.ddosType;
    }

    public DescribeDdosThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDdosThresholdRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
