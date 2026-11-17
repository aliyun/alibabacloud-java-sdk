// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListRelatedResourceRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1example****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of delivery groups returned per page. This value is the same as the PageSize request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListRelatedResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRelatedResourceRequest self = new ListRelatedResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListRelatedResourceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListRelatedResourceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRelatedResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
