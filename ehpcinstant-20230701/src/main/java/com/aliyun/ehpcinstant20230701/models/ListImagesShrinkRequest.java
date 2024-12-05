// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListImagesShrinkRequest extends TeaModel {
    @NameInMap("ImageCategory")
    public String imageCategory;

    @NameInMap("ImageIds")
    public String imageIdsShrink;

    @NameInMap("ImageNames")
    public String imageNamesShrink;

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

    public static ListImagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesShrinkRequest self = new ListImagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesShrinkRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public ListImagesShrinkRequest setImageIdsShrink(String imageIdsShrink) {
        this.imageIdsShrink = imageIdsShrink;
        return this;
    }
    public String getImageIdsShrink() {
        return this.imageIdsShrink;
    }

    public ListImagesShrinkRequest setImageNamesShrink(String imageNamesShrink) {
        this.imageNamesShrink = imageNamesShrink;
        return this;
    }
    public String getImageNamesShrink() {
        return this.imageNamesShrink;
    }

    public ListImagesShrinkRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public ListImagesShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListImagesShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListImagesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
