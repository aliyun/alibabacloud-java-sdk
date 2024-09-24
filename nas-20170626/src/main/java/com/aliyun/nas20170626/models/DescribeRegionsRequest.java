// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The type of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>all: all types of file systems</li>
     * <li>standard (default): General-purpose NAS file system</li>
     * <li>extreme: Extreme NAS file system</li>
     * <li>cpfs: Cloud Parallel File Storage (CPFS) file system</li>
     * </ul>
     * <blockquote>
     * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeRegionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRegionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
