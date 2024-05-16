// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeTypeListInfoRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Locale")
    public String locale;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetNodeTypeListInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeTypeListInfoRequest self = new GetNodeTypeListInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeTypeListInfoRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetNodeTypeListInfoRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetNodeTypeListInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetNodeTypeListInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetNodeTypeListInfoRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetNodeTypeListInfoRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
