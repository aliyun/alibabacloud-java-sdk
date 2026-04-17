// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertRobotsShrinkRequest extends TeaModel {
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
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("robotIds")
    public String robotIdsShrink;

    @NameInMap("types")
    public String typesShrink;

    @NameInMap("workspace")
    public String workspace;

    public static ListAlertRobotsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRobotsShrinkRequest self = new ListAlertRobotsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertRobotsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertRobotsShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertRobotsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertRobotsShrinkRequest setRobotIdsShrink(String robotIdsShrink) {
        this.robotIdsShrink = robotIdsShrink;
        return this;
    }
    public String getRobotIdsShrink() {
        return this.robotIdsShrink;
    }

    public ListAlertRobotsShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

    public ListAlertRobotsShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
