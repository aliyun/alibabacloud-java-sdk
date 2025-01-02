// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPolicyClassesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Operation</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <strong>example:</strong>
     * <p>InBound</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>FlowControl</p>
     */
    @NameInMap("type")
    public String type;

    public static ListPolicyClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyClassesRequest self = new ListPolicyClassesRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyClassesRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public ListPolicyClassesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListPolicyClassesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPolicyClassesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPolicyClassesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
