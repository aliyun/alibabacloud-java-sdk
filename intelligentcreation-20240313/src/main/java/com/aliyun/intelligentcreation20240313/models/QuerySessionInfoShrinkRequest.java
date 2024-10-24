// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QuerySessionInfoShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>805800890535673856</p>
     */
    @NameInMap("projectId")
    public String projectId;

    @NameInMap("statusList")
    public String statusListShrink;

    public static QuerySessionInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionInfoShrinkRequest self = new QuerySessionInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySessionInfoShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySessionInfoShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySessionInfoShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QuerySessionInfoShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

}
