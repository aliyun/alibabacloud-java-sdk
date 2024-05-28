// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkItemAllFieldsRequest extends TeaModel {
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
    @NameInMap("workitemTypeIdentifier")
    public String workitemTypeIdentifier;

    public static ListWorkItemAllFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemAllFieldsRequest self = new ListWorkItemAllFieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkItemAllFieldsRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public ListWorkItemAllFieldsRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public ListWorkItemAllFieldsRequest setWorkitemTypeIdentifier(String workitemTypeIdentifier) {
        this.workitemTypeIdentifier = workitemTypeIdentifier;
        return this;
    }
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

}
