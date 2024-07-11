// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowsByPageRequest extends TeaModel {
    /**
     * <p>Filter condition, task flow ID list.</p>
     */
    @NameInMap("DagIdList")
    public java.util.List<Long> dagIdList;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filter condition, application scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12***</p>
     */
    @NameInMap("ScenarioId")
    public Long scenarioId;

    /**
     * <p>The keyword that is used to search for task flow names.</p>
     * 
     * <strong>example:</strong>
     * <p>Test node</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowsByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowsByPageRequest self = new ListTaskFlowsByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowsByPageRequest setDagIdList(java.util.List<Long> dagIdList) {
        this.dagIdList = dagIdList;
        return this;
    }
    public java.util.List<Long> getDagIdList() {
        return this.dagIdList;
    }

    public ListTaskFlowsByPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskFlowsByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskFlowsByPageRequest setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public ListTaskFlowsByPageRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListTaskFlowsByPageRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
