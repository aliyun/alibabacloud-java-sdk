// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("Module")
    public String module;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static GetOpLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpLogRequest self = new GetOpLogRequest();
        return TeaModel.build(map, self);
    }

    public GetOpLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GetOpLogRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public GetOpLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetOpLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetOpLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOpLogRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
