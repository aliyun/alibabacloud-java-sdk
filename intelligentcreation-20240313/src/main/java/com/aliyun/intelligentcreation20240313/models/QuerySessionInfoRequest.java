// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QuerySessionInfoRequest extends TeaModel {
    @NameInMap("pageNo")
    public Integer pageNo;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("projectId")
    public String projectId;

    @NameInMap("statusList")
    public java.util.List<String> statusList;

    public static QuerySessionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionInfoRequest self = new QuerySessionInfoRequest();
        return TeaModel.build(map, self);
    }

    public QuerySessionInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySessionInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySessionInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QuerySessionInfoRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
