// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribePageFaceVerifyDataRequest extends TeaModel {
    /**
     * <p>Current page number, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Required, end time, format is yyyy-MM-dd, default is yyyy-MM-dd 00:00:00, the query interval cannot exceed 90 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-30</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Number of items per page, default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Product code.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_PLUS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36**01</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>Required, start time, format is yyyy-MM-dd, default is yyyy-MM-dd 00:00:00, the query interval cannot exceed 90 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-10</p>
     */
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
