// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillFileDetectResultRequest extends TeaModel {
    /**
     * <p>The unique identifier for the detection task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2aceb074-fa72-44d2-99d9-45b17cffe0e7</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetSkillFileDetectResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillFileDetectResultRequest self = new GetSkillFileDetectResultRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillFileDetectResultRequest setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public GetSkillFileDetectResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
