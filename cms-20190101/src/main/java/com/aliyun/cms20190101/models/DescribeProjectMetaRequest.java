// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaRequest extends TeaModel {
    /**
     * <p>The tags. Tags are used to filter alerts, and each alert can be marked with special tags.</p>
     * <p>Currently, only filtering by product is supported. That is, the <code>name</code> is <code>product</code>. For example: {&quot;name&quot;:&quot;product&quot;,&quot;value&quot;:&quot;ECS&quot;}.</p>
     * <blockquote>
     * <p>We do not recommend that you use the special tags for the CloudMonitor console in Alibaba Cloud.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;product&quot;,&quot;value&quot;:&quot;ECS&quot;}]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The page number.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 10000.</p>
     * <p>Default value: 30.</p>
     * <blockquote>
     * <p>Currently, Alibaba Cloud does not impose a limit on this parameter. If you need to obtain all results, set the page size to a large value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaRequest self = new DescribeProjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMetaRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DescribeProjectMetaRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectMetaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
