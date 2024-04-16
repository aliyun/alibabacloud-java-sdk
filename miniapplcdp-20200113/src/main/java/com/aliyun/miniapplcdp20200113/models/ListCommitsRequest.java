// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListCommitsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommitLog")
    public String commitLog;

    @NameInMap("CustomParentId")
    public String customParentId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Source")
    public String source;

    public static ListCommitsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCommitsRequest self = new ListCommitsRequest();
        return TeaModel.build(map, self);
    }

    public ListCommitsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListCommitsRequest setCommitLog(String commitLog) {
        this.commitLog = commitLog;
        return this;
    }
    public String getCommitLog() {
        return this.commitLog;
    }

    public ListCommitsRequest setCustomParentId(String customParentId) {
        this.customParentId = customParentId;
        return this;
    }
    public String getCustomParentId() {
        return this.customParentId;
    }

    public ListCommitsRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListCommitsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommitsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommitsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
