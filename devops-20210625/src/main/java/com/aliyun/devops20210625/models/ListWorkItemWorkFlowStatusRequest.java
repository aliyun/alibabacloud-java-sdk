// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkItemWorkFlowStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spaceType")
    public String spaceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workitemCategoryIdentifier")
    public String workitemCategoryIdentifier;

    @NameInMap("workitemTypeIdentifier")
    public String workitemTypeIdentifier;

    public static ListWorkItemWorkFlowStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemWorkFlowStatusRequest self = new ListWorkItemWorkFlowStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkItemWorkFlowStatusRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public ListWorkItemWorkFlowStatusRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public ListWorkItemWorkFlowStatusRequest setWorkitemCategoryIdentifier(String workitemCategoryIdentifier) {
        this.workitemCategoryIdentifier = workitemCategoryIdentifier;
        return this;
    }
    public String getWorkitemCategoryIdentifier() {
        return this.workitemCategoryIdentifier;
    }

    public ListWorkItemWorkFlowStatusRequest setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
        this.workitemTypeIdentifier = workitemTypeIdentifier;
        return this;
    }
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

}
