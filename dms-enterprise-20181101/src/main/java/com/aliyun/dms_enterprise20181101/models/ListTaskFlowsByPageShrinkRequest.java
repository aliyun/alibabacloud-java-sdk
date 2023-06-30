// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowsByPageShrinkRequest extends TeaModel {
    @NameInMap("DagIdList")
    public String dagIdListShrink;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScenarioId")
    public Long scenarioId;

    /**
     * <p>The keyword that is used to search for task flow names.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTaskFlowsByPageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowsByPageShrinkRequest self = new ListTaskFlowsByPageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowsByPageShrinkRequest setDagIdListShrink(String dagIdListShrink) {
        this.dagIdListShrink = dagIdListShrink;
        return this;
    }
    public String getDagIdListShrink() {
        return this.dagIdListShrink;
    }

    public ListTaskFlowsByPageShrinkRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskFlowsByPageShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskFlowsByPageShrinkRequest setScenarioId(Long scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public Long getScenarioId() {
        return this.scenarioId;
    }

    public ListTaskFlowsByPageShrinkRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListTaskFlowsByPageShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
