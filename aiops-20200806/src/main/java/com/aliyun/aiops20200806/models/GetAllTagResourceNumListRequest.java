// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAllTagResourceNumListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("TagName")
    public String tagName;

    public static GetAllTagResourceNumListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllTagResourceNumListRequest self = new GetAllTagResourceNumListRequest();
        return TeaModel.build(map, self);
    }

    public GetAllTagResourceNumListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAllTagResourceNumListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetAllTagResourceNumListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAllTagResourceNumListRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetAllTagResourceNumListRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
