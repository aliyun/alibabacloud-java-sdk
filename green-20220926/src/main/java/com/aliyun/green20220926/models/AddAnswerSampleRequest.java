// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAnswerSampleRequest extends TeaModel {
    /**
     * <p>The ID of the fallback answer library.</p>
     * 
     * <strong>example:</strong>
     * <p>alxxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the file that contains the fallback answer samples to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>data/xxx.xlsx</p>
     */
    @NameInMap("SampleObject")
    public String sampleObject;

    /**
     * <p>The samples to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>Fallback answer 1\nFallback answer 2</p>
     */
    @NameInMap("Samples")
    public String samples;

    public static AddAnswerSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAnswerSampleRequest self = new AddAnswerSampleRequest();
        return TeaModel.build(map, self);
    }

    public AddAnswerSampleRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public AddAnswerSampleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddAnswerSampleRequest setSampleObject(String sampleObject) {
        this.sampleObject = sampleObject;
        return this;
    }
    public String getSampleObject() {
        return this.sampleObject;
    }

    public AddAnswerSampleRequest setSamples(String samples) {
        this.samples = samples;
        return this;
    }
    public String getSamples() {
        return this.samples;
    }

}
