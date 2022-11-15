// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class ListDatasRequest extends TeaModel {
    @NameInMap("CloudageMax")
    public Integer cloudageMax;

    @NameInMap("CloudageMin")
    public Integer cloudageMin;

    @NameInMap("DateEnd")
    public String dateEnd;

    @NameInMap("DateStart")
    public String dateStart;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionWkt")
    public String regionWkt;

    @NameInMap("SourceTypeList")
    public java.util.List<String> sourceTypeList;

    public static ListDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasRequest self = new ListDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasRequest setCloudageMax(Integer cloudageMax) {
        this.cloudageMax = cloudageMax;
        return this;
    }
    public Integer getCloudageMax() {
        return this.cloudageMax;
    }

    public ListDatasRequest setCloudageMin(Integer cloudageMin) {
        this.cloudageMin = cloudageMin;
        return this;
    }
    public Integer getCloudageMin() {
        return this.cloudageMin;
    }

    public ListDatasRequest setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
    public String getDateEnd() {
        return this.dateEnd;
    }

    public ListDatasRequest setDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }
    public String getDateStart() {
        return this.dateStart;
    }

    public ListDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasRequest setRegionWkt(String regionWkt) {
        this.regionWkt = regionWkt;
        return this;
    }
    public String getRegionWkt() {
        return this.regionWkt;
    }

    public ListDatasRequest setSourceTypeList(java.util.List<String> sourceTypeList) {
        this.sourceTypeList = sourceTypeList;
        return this;
    }
    public java.util.List<String> getSourceTypeList() {
        return this.sourceTypeList;
    }

}
