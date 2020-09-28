// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidTagsRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("PidTagName")
    public String pidTagName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListPidTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPidTagsRequest self = new ListPidTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListPidTagsRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public ListPidTagsRequest setPidTagName(String pidTagName) {
        this.pidTagName = pidTagName;
        return this;
    }
    public String getPidTagName() {
        return this.pidTagName;
    }

    public ListPidTagsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPidTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
