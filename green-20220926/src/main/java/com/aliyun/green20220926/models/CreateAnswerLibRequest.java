// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateAnswerLibRequest extends TeaModel {
    @NameInMap("LibName")
    public String libName;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>oss-cip-shanghai</p>
     */
    @NameInMap("SampleBucket")
    public String sampleBucket;

    /**
     * <strong>example:</strong>
     * <p>data/xxx.xlsx</p>
     */
    @NameInMap("SampleObject")
    public String sampleObject;

    @NameInMap("Samples")
    public String samples;

    public static CreateAnswerLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnswerLibRequest self = new CreateAnswerLibRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnswerLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public CreateAnswerLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAnswerLibRequest setSampleBucket(String sampleBucket) {
        this.sampleBucket = sampleBucket;
        return this;
    }
    public String getSampleBucket() {
        return this.sampleBucket;
    }

    public CreateAnswerLibRequest setSampleObject(String sampleObject) {
        this.sampleObject = sampleObject;
        return this;
    }
    public String getSampleObject() {
        return this.sampleObject;
    }

    public CreateAnswerLibRequest setSamples(String samples) {
        this.samples = samples;
        return this;
    }
    public String getSamples() {
        return this.samples;
    }

}
