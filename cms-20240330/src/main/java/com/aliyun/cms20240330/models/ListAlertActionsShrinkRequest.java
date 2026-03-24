// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertActionsShrinkRequest extends TeaModel {
    /**
     * <p>The unique IDs of the alert action integrations.</p>
     */
    @NameInMap("alertActionIds")
    public String alertActionIdsShrink;

    /**
     * <p>The name of the alert action integration.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("alertActionName")
    public String alertActionName;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The type of the alert action integration.</p>
     * 
     * <strong>example:</strong>
     * <p>FC</p>
     */
    @NameInMap("type")
    public String type;

    public static ListAlertActionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertActionsShrinkRequest self = new ListAlertActionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertActionsShrinkRequest setAlertActionIdsShrink(String alertActionIdsShrink) {
        this.alertActionIdsShrink = alertActionIdsShrink;
        return this;
    }
    public String getAlertActionIdsShrink() {
        return this.alertActionIdsShrink;
    }

    public ListAlertActionsShrinkRequest setAlertActionName(String alertActionName) {
        this.alertActionName = alertActionName;
        return this;
    }
    public String getAlertActionName() {
        return this.alertActionName;
    }

    public ListAlertActionsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertActionsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertActionsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
