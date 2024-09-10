// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaRequest extends TeaModel {
    /**
     * <p>The tags. Tags are used to filter services.</p>
     * <p>You can filter services only by the tag whose <code>name</code> is <code>product</code>. Example: {&quot;name&quot;:&quot;product&quot;,&quot;value&quot;:&quot;ECS&quot;}.</p>
     * <blockquote>
     * <p>We recommend that you do not use the special tags in the CloudMonitor console.</p>
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
     * <p>The value of this parameter is not limited. You can view a large number of entries per page.</p>
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
