// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class SampleBase extends TeaModel {
    @NameInMap("FullSampleDeviceIds")
    public java.util.List<FullSampleItem> fullSampleDeviceIds;

    @NameInMap("FullSampleUsers")
    public java.util.List<FullSampleItem> fullSampleUsers;

    @NameInMap("SampleMethod")
    public String sampleMethod;

    @NameInMap("SampleRate")
    public Float sampleRate;

    public static SampleBase build(java.util.Map<String, ?> map) throws Exception {
        SampleBase self = new SampleBase();
        return TeaModel.build(map, self);
    }

    public SampleBase setFullSampleDeviceIds(java.util.List<FullSampleItem> fullSampleDeviceIds) {
        this.fullSampleDeviceIds = fullSampleDeviceIds;
        return this;
    }
    public java.util.List<FullSampleItem> getFullSampleDeviceIds() {
        return this.fullSampleDeviceIds;
    }

    public SampleBase setFullSampleUsers(java.util.List<FullSampleItem> fullSampleUsers) {
        this.fullSampleUsers = fullSampleUsers;
        return this;
    }
    public java.util.List<FullSampleItem> getFullSampleUsers() {
        return this.fullSampleUsers;
    }

    public SampleBase setSampleMethod(String sampleMethod) {
        this.sampleMethod = sampleMethod;
        return this;
    }
    public String getSampleMethod() {
        return this.sampleMethod;
    }

    public SampleBase setSampleRate(Float sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Float getSampleRate() {
        return this.sampleRate;
    }

}
