// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryGenerateDevicesInfoListRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryGenerateDevicesInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGenerateDevicesInfoListRequest self = new QueryGenerateDevicesInfoListRequest();
        return TeaModel.build(map, self);
    }

    public QueryGenerateDevicesInfoListRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryGenerateDevicesInfoListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryGenerateDevicesInfoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryGenerateDevicesInfoListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
