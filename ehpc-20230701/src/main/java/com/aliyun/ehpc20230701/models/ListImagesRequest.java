// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    @NameInMap("ImageIds")
    public java.util.List<String> imageIds;

    @NameInMap("ImageNames")
    public java.util.List<String> imageNames;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setImageIds(java.util.List<String> imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public java.util.List<String> getImageIds() {
        return this.imageIds;
    }

    public ListImagesRequest setImageNames(java.util.List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }
    public java.util.List<String> getImageNames() {
        return this.imageNames;
    }

    public ListImagesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListImagesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
