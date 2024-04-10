// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribePageFaceVerifyDataRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("StartDate")
    public String startDate;

    public static DescribePageFaceVerifyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePageFaceVerifyDataRequest self = new DescribePageFaceVerifyDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribePageFaceVerifyDataRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribePageFaceVerifyDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribePageFaceVerifyDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePageFaceVerifyDataRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribePageFaceVerifyDataRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribePageFaceVerifyDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
