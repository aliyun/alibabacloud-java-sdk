// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModulesShrinkRequest extends TeaModel {
    @NameInMap("excludeModuleIds")
    public String excludeModuleIdsShrink;

    @NameInMap("groupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("projectId")
    public String projectId;

    @NameInMap("tag")
    public String tagShrink;

    public static ListModulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModulesShrinkRequest self = new ListModulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModulesShrinkRequest setExcludeModuleIdsShrink(String excludeModuleIdsShrink) {
        this.excludeModuleIdsShrink = excludeModuleIdsShrink;
        return this;
    }
    public String getExcludeModuleIdsShrink() {
        return this.excludeModuleIdsShrink;
    }

    public ListModulesShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListModulesShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListModulesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModulesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModulesShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListModulesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
