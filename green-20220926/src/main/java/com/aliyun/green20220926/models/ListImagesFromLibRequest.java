// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImagesFromLibRequest extends TeaModel {
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
    public java.util.Map<String, String> sort;

    @NameInMap("StartDate")
    public String startDate;

    public static ListImagesFromLibRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesFromLibRequest self = new ListImagesFromLibRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesFromLibRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListImagesFromLibRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListImagesFromLibRequest setImgId(String imgId) {
        this.imgId = imgId;
        return this;
    }
    public String getImgId() {
        return this.imgId;
    }

    public ListImagesFromLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ListImagesFromLibRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesFromLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImagesFromLibRequest setSort(java.util.Map<String, String> sort) {
        this.sort = sort;
        return this;
    }
    public java.util.Map<String, String> getSort() {
        return this.sort;
    }

    public ListImagesFromLibRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
