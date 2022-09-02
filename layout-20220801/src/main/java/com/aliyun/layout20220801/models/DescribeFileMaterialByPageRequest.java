// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class DescribeFileMaterialByPageRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Title")
    public String title;

    @NameInMap("TreeNodeId")
    public String treeNodeId;

    @NameInMap("Type")
    public String type;

    public static DescribeFileMaterialByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileMaterialByPageRequest self = new DescribeFileMaterialByPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileMaterialByPageRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public DescribeFileMaterialByPageRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileMaterialByPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeFileMaterialByPageRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DescribeFileMaterialByPageRequest setTreeNodeId(String treeNodeId) {
        this.treeNodeId = treeNodeId;
        return this;
    }
    public String getTreeNodeId() {
        return this.treeNodeId;
    }

    public DescribeFileMaterialByPageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
