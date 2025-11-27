// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListImagesShrinkRequest extends TeaModel {
    /**
     * <p>The source of the image. Valid values:</p>
     * <ul>
     * <li>Public: public images provided by Alibaba Cloud.</li>
     * <li>Custom: the custom image that you added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("ImageCategory")
    public String imageCategory;

    /**
     * <p>The array of image IDs.</p>
     */
    @NameInMap("ImageIds")
    public String imageIdsShrink;

    /**
     * <p>The array of image names.</p>
     */
    @NameInMap("ImageNames")
    public String imageNamesShrink;

    /**
     * <p>The type of the images. Valid values:</p>
     * <ul>
     * <li>VM: virtual machine image.</li>
     * <li>Container: the container image.</li>
     * </ul>
     * <p>Default value: VM</p>
     * 
     * <strong>example:</strong>
     * <p>VM</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The query mode. Valid values:</p>
     * <ul>
     * <li>List: queries the list of all corresponding image versions.</li>
     * <li>Merge: merges images to query the latest version list.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Merge</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The number of the page to return.\
     * Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of pieces per page.\
     * Default value: 20.</p>
     * 
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
