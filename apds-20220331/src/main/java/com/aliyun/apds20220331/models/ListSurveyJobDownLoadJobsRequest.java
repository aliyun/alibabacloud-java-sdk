// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyJobDownLoadJobsRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("sortCol")
    public String sortCol;

    @NameInMap("sortType")
    public String sortType;

    @NameInMap("regionId")
    public String regionId;

    public static ListSurveyJobDownLoadJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyJobDownLoadJobsRequest self = new ListSurveyJobDownLoadJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListSurveyJobDownLoadJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListSurveyJobDownLoadJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSurveyJobDownLoadJobsRequest setSortCol(String sortCol) {
        this.sortCol = sortCol;
        return this;
    }
    public String getSortCol() {
        return this.sortCol;
    }

    public ListSurveyJobDownLoadJobsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListSurveyJobDownLoadJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
