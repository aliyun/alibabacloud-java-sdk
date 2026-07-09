// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertRobotsShrinkRequest extends TeaModel {
    /**
     * <p>The chatbot name. Prefix fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The chatbot ID.</p>
     */
    @NameInMap("robotIds")
    public String robotIdsShrink;

    /**
     * <p>The chatbot type.</p>
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
