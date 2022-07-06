// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListDatasShrinkRequest extends TeaModel {
    // 云量上限
    @NameInMap("CloudageMax")
    public Integer cloudageMax;

    // 云量下限
    @NameInMap("CloudageMin")
    public Integer cloudageMin;

    // 结束日期，例如"2020-06-01"
    @NameInMap("DateEnd")
    public String dateEnd;

    // 开始日期，例如"2020-01-01"
    @NameInMap("DateStart")
    public String dateStart;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 区域选择，wkt格式
    @NameInMap("RegionWkt")
    public String regionWkt;

    // 星源，可多选，枚举值如下：    sentinel1,
    //     sentinel2,
    //     landsat5,
    //     landsat7,
    //     landsat8,
    //     landsat9
    @NameInMap("SourceTypeList")
    public String sourceTypeListShrink;

    public static ListDatasShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasShrinkRequest self = new ListDatasShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasShrinkRequest setCloudageMax(Integer cloudageMax) {
        this.cloudageMax = cloudageMax;
        return this;
    }
    public Integer getCloudageMax() {
        return this.cloudageMax;
    }

    public ListDatasShrinkRequest setCloudageMin(Integer cloudageMin) {
        this.cloudageMin = cloudageMin;
        return this;
    }
    public Integer getCloudageMin() {
        return this.cloudageMin;
    }

    public ListDatasShrinkRequest setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
    public String getDateEnd() {
        return this.dateEnd;
    }

    public ListDatasShrinkRequest setDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }
    public String getDateStart() {
        return this.dateStart;
    }

    public ListDatasShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasShrinkRequest setRegionWkt(String regionWkt) {
        this.regionWkt = regionWkt;
        return this;
    }
    public String getRegionWkt() {
        return this.regionWkt;
    }

    public ListDatasShrinkRequest setSourceTypeListShrink(String sourceTypeListShrink) {
        this.sourceTypeListShrink = sourceTypeListShrink;
        return this;
    }
    public String getSourceTypeListShrink() {
        return this.sourceTypeListShrink;
    }

}
