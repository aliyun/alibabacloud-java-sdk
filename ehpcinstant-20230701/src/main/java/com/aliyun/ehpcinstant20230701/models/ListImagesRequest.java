// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
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
    public java.util.List<String> imageIds;

    /**
     * <p>The array of image names.</p>
     */
    @NameInMap("ImageNames")
    public java.util.List<String> imageNames;

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
