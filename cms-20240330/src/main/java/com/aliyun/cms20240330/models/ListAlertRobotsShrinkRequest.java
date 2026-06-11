// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertRobotsShrinkRequest extends TeaModel {
    /**
     * <p>The name of the robot. Fuzzy search by prefix is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The robot IDs.</p>
     */
    @NameInMap("robotIds")
    public String robotIdsShrink;

    /**
     * <p>The robot types.</p>
     */
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
