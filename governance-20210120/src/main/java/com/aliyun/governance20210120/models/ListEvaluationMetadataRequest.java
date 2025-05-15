// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationMetadataRequest extends TeaModel {
    /**
     * <p>The language. The information is returned in the specified language. Valid values:</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh: Chinese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("LensCode")
    public String lensCode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListEvaluationMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationMetadataRequest self = new ListEvaluationMetadataRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationMetadataRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListEvaluationMetadataRequest setLensCode(String lensCode) {
        this.lensCode = lensCode;
        return this;
    }
    public String getLensCode() {
        return this.lensCode;
    }

    public ListEvaluationMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
