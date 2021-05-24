// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppListRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Types")
    public java.util.List<String> types;

    @NameInMap("FuzzyName")
    public String fuzzyName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryStudioAppListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppListRequest self = new QueryStudioAppListRequest();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryStudioAppListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryStudioAppListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryStudioAppListRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public QueryStudioAppListRequest setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
        return this;
    }
    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public QueryStudioAppListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
