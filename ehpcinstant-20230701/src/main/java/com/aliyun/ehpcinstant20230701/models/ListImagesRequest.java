// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    @NameInMap("ImageCategory")
    public String imageCategory;

    @NameInMap("ImageIds")
    public java.util.List<String> imageIds;

    @NameInMap("ImageNames")
    public java.util.List<String> imageNames;

    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
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

    public ListImagesRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public ListImagesRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
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

}
