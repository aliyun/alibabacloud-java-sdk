// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImagesFromLibShrinkRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ImgId")
    public String imgId;

    @NameInMap("LibId")
    public String libId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Sort")
    public String sortShrink;

    @NameInMap("StartDate")
    public String startDate;

    public static ListImagesFromLibShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesFromLibShrinkRequest self = new ListImagesFromLibShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesFromLibShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListImagesFromLibShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListImagesFromLibShrinkRequest setImgId(String imgId) {
        this.imgId = imgId;
        return this;
    }
    public String getImgId() {
        return this.imgId;
    }

    public ListImagesFromLibShrinkRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ListImagesFromLibShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesFromLibShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImagesFromLibShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public ListImagesFromLibShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
