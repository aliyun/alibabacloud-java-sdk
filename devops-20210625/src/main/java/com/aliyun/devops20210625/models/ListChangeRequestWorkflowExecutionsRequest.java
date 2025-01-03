// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListChangeRequestWorkflowExecutionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("perPage")
    public Long perPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e173f3c11db5445eb426ca33c92207c8</p>
     */
    @NameInMap("releaseStageSn")
    public String releaseStageSn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ce51b31b996246ecaf874736838360b2</p>
     */
    @NameInMap("releaseWorkflowSn")
    public String releaseWorkflowSn;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sort")
    public String sort;

    public static ListChangeRequestWorkflowExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRequestWorkflowExecutionsRequest self = new ListChangeRequestWorkflowExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeRequestWorkflowExecutionsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListChangeRequestWorkflowExecutionsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListChangeRequestWorkflowExecutionsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListChangeRequestWorkflowExecutionsRequest setPerPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
    public Long getPerPage() {
        return this.perPage;
    }

    public ListChangeRequestWorkflowExecutionsRequest setReleaseStageSn(String releaseStageSn) {
        this.releaseStageSn = releaseStageSn;
        return this;
    }
    public String getReleaseStageSn() {
        return this.releaseStageSn;
    }

    public ListChangeRequestWorkflowExecutionsRequest setReleaseWorkflowSn(String releaseWorkflowSn) {
        this.releaseWorkflowSn = releaseWorkflowSn;
        return this;
    }
    public String getReleaseWorkflowSn() {
        return this.releaseWorkflowSn;
    }

    public ListChangeRequestWorkflowExecutionsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
