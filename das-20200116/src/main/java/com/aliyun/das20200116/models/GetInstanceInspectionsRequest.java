// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceArea")
    public String instanceArea;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchMap")
    public String searchMap;

    @NameInMap("StartTime")
    public String startTime;

    public static GetInstanceInspectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionsRequest self = new GetInstanceInspectionsRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetInstanceInspectionsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetInstanceInspectionsRequest setInstanceArea(String instanceArea) {
        this.instanceArea = instanceArea;
        return this;
    }
    public String getInstanceArea() {
        return this.instanceArea;
    }

    public GetInstanceInspectionsRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetInstanceInspectionsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetInstanceInspectionsRequest setSearchMap(String searchMap) {
        this.searchMap = searchMap;
        return this;
    }
    public String getSearchMap() {
        return this.searchMap;
    }

    public GetInstanceInspectionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
