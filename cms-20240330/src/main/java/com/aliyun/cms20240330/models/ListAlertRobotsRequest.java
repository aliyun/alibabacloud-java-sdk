// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertRobotsRequest extends TeaModel {
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
    public java.util.List<String> robotIds;

    /**
     * <p>The robot types.</p>
     */
    @NameInMap("types")
    public java.util.List<String> types;

    @NameInMap("workspace")
    public String workspace;

    public static ListAlertRobotsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertRobotsRequest self = new ListAlertRobotsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertRobotsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertRobotsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertRobotsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAlertRobotsRequest setRobotIds(java.util.List<String> robotIds) {
        this.robotIds = robotIds;
        return this;
    }
    public java.util.List<String> getRobotIds() {
        return this.robotIds;
    }

    public ListAlertRobotsRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public ListAlertRobotsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
