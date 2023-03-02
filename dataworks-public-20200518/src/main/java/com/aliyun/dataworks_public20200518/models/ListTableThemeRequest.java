// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableThemeRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value:10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent table folder.</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListTableThemeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableThemeRequest self = new ListTableThemeRequest();
        return TeaModel.build(map, self);
    }

    public ListTableThemeRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListTableThemeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTableThemeRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ListTableThemeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
