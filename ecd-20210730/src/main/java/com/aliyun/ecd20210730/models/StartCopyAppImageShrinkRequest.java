// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class StartCopyAppImageShrinkRequest extends TeaModel {
    @NameInMap("DestinationRegionList")
    public String destinationRegionListShrink;

    @NameInMap("ImgUid")
    public String imgUid;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    public static StartCopyAppImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCopyAppImageShrinkRequest self = new StartCopyAppImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartCopyAppImageShrinkRequest setDestinationRegionListShrink(String destinationRegionListShrink) {
        this.destinationRegionListShrink = destinationRegionListShrink;
        return this;
    }
    public String getDestinationRegionListShrink() {
        return this.destinationRegionListShrink;
    }

    public StartCopyAppImageShrinkRequest setImgUid(String imgUid) {
        this.imgUid = imgUid;
        return this;
    }
    public String getImgUid() {
        return this.imgUid;
    }

    public StartCopyAppImageShrinkRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

}
