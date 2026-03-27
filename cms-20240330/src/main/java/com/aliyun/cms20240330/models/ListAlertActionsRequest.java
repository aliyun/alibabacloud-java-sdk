// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertActionsRequest extends TeaModel {
    /**
     * <p>Unique identifier for the action integration.</p>
     */
    @NameInMap("alertActionIds")
    public java.util.List<String> alertActionIds;

    /**
     * <p>Name of the action integration.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("alertActionName")
    public String alertActionName;

    /**
     * <p>Page number. Default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size. Default is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Type of the action integration.</p>
     * 
     * <strong>example:</strong>
     * <p>FC</p>
     */
    @NameInMap("type")
    public String type;

    public static ListAlertActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertActionsRequest self = new ListAlertActionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertActionsRequest setAlertActionIds(java.util.List<String> alertActionIds) {
        this.alertActionIds = alertActionIds;
        return this;
    }
    public java.util.List<String> getAlertActionIds() {
        return this.alertActionIds;
    }

    public ListAlertActionsRequest setAlertActionName(String alertActionName) {
        this.alertActionName = alertActionName;
        return this;
    }
    public String getAlertActionName() {
        return this.alertActionName;
    }

    public ListAlertActionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertActionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertActionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
