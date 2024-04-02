// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageFromLibRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ImageLibId")
    public Integer imageLibId;

    @NameInMap("ModelId")
    public Long modelId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageFromLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromLibRequest self = new DescribeImageFromLibRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromLibRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageFromLibRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeImageFromLibRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeImageFromLibRequest setImageLibId(Integer imageLibId) {
        this.imageLibId = imageLibId;
        return this;
    }
    public Integer getImageLibId() {
        return this.imageLibId;
    }

    public DescribeImageFromLibRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public DescribeImageFromLibRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageFromLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeImageFromLibRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeImageFromLibRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
