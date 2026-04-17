// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContactGroupsShrinkRequest extends TeaModel {
    @NameInMap("contactGroupIds")
    public String contactGroupIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("workspace")
    public String workspace;

    public static ListContactGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactGroupsShrinkRequest self = new ListContactGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListContactGroupsShrinkRequest setContactGroupIdsShrink(String contactGroupIdsShrink) {
        this.contactGroupIdsShrink = contactGroupIdsShrink;
        return this;
    }
    public String getContactGroupIdsShrink() {
        return this.contactGroupIdsShrink;
    }

    public ListContactGroupsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListContactGroupsShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListContactGroupsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListContactGroupsShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
