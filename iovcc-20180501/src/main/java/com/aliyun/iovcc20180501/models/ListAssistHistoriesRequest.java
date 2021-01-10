// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistHistoriesRequest extends TeaModel {
    @NameInMap("PerPage")
    public Integer perPage;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("Condition")
    public String condition;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListAssistHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssistHistoriesRequest self = new ListAssistHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAssistHistoriesRequest setPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
    public Integer getPerPage() {
        return this.perPage;
    }

    public ListAssistHistoriesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListAssistHistoriesRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public ListAssistHistoriesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
