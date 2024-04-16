// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulePublishVersionsRequest extends TeaModel {
    @NameInMap("CustomParentId")
    public String customParentId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ModuleVersion")
    public String moduleVersion;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Source")
    public String source;

    public static ListModulePublishVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModulePublishVersionsRequest self = new ListModulePublishVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListModulePublishVersionsRequest setCustomParentId(String customParentId) {
        this.customParentId = customParentId;
        return this;
    }
    public String getCustomParentId() {
        return this.customParentId;
    }

    public ListModulePublishVersionsRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListModulePublishVersionsRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public ListModulePublishVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModulePublishVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModulePublishVersionsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
