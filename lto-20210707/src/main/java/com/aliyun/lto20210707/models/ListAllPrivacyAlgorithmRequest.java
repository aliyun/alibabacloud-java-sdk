// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyAlgorithmRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAllPrivacyAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllPrivacyAlgorithmRequest self = new ListAllPrivacyAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public ListAllPrivacyAlgorithmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
