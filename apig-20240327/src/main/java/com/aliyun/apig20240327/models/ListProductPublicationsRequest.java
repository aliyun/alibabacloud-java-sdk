// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductPublicationsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The name of the portal to which the API product is published.</p>
     * 
     * <strong>example:</strong>
     * <p>developer-portal</p>
     */
    @NameInMap("portalName")
    public String portalName;

    public static ListProductPublicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductPublicationsRequest self = new ListProductPublicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductPublicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductPublicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductPublicationsRequest setPortalName(String portalName) {
        this.portalName = portalName;
        return this;
    }
    public String getPortalName() {
        return this.portalName;
    }

}
