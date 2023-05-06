// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class StartCopyAppImageRequest extends TeaModel {
    @NameInMap("DestinationRegionList")
    public java.util.List<String> destinationRegionList;

    @NameInMap("ImgUid")
    public String imgUid;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    public static StartCopyAppImageRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCopyAppImageRequest self = new StartCopyAppImageRequest();
        return TeaModel.build(map, self);
    }

    public StartCopyAppImageRequest setDestinationRegionList(java.util.List<String> destinationRegionList) {
        this.destinationRegionList = destinationRegionList;
        return this;
    }
    public java.util.List<String> getDestinationRegionList() {
        return this.destinationRegionList;
    }

    public StartCopyAppImageRequest setImgUid(String imgUid) {
        this.imgUid = imgUid;
        return this;
    }
    public String getImgUid() {
        return this.imgUid;
    }

    public StartCopyAppImageRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

}
