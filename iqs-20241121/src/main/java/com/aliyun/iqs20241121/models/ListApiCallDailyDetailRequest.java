// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListApiCallDailyDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CreateVikaApp</p>
     */
    @NameInMap("apiName")
    public String apiName;

    /**
     * <strong>example:</strong>
     * <p>20240908</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>PlaceBasic</p>
     */
    @NameInMap("engineType")
    public String engineType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>20240908</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ListApiCallDailyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiCallDailyDetailRequest self = new ListApiCallDailyDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListApiCallDailyDetailRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ListApiCallDailyDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListApiCallDailyDetailRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ListApiCallDailyDetailRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApiCallDailyDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApiCallDailyDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
