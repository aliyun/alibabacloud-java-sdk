// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ListCustomImagesRequest extends TeaModel {
    @NameInMap("BaseOsTag")
    public String baseOsTag;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("RegionId")
    public String regionId;

    public static ListCustomImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesRequest self = new ListCustomImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesRequest setBaseOsTag(String baseOsTag) {
        this.baseOsTag = baseOsTag;
        return this;
    }
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    public ListCustomImagesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public ListCustomImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
