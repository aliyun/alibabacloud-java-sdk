// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SkipPreCheckRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Skip")
    public Boolean skip;

    @NameInMap("SkipPreCheckItems")
    public String skipPreCheckItems;

    @NameInMap("SkipPreCheckNames")
    public String skipPreCheckNames;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("RegionId")
    public String regionId;

    public static SkipPreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipPreCheckRequest self = new SkipPreCheckRequest();
        return TeaModel.build(map, self);
    }

    public SkipPreCheckRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SkipPreCheckRequest setSkip(Boolean skip) {
        this.skip = skip;
        return this;
    }
    public Boolean getSkip() {
        return this.skip;
    }

    public SkipPreCheckRequest setSkipPreCheckItems(String skipPreCheckItems) {
        this.skipPreCheckItems = skipPreCheckItems;
        return this;
    }
    public String getSkipPreCheckItems() {
        return this.skipPreCheckItems;
    }

    public SkipPreCheckRequest setSkipPreCheckNames(String skipPreCheckNames) {
        this.skipPreCheckNames = skipPreCheckNames;
        return this;
    }
    public String getSkipPreCheckNames() {
        return this.skipPreCheckNames;
    }

    public SkipPreCheckRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public SkipPreCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
