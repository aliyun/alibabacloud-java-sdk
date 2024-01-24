// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessGroupsRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The name must be 3 to 64 characters in length.</p>
     * <p>*   The name must start with a letter and can contain letters, digits, underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard (default): General-purpose NAS file system</p>
     * <p>*   extreme: Extreme NAS file system</p>
     * <p>*   cpfs: Cloud Parallel File Storage (CPFS) file system</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to display the creation time of the permission group in UTC.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true (default): The time is displayed in UTC.</p>
     * <p>*   false: The time is not displayed in UTC.</p>
     */
    @NameInMap("UseUTCDateTime")
    public Boolean useUTCDateTime;

    public static DescribeAccessGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessGroupsRequest self = new DescribeAccessGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessGroupsRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public DescribeAccessGroupsRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeAccessGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessGroupsRequest setUseUTCDateTime(Boolean useUTCDateTime) {
        this.useUTCDateTime = useUTCDateTime;
        return this;
    }
    public Boolean getUseUTCDateTime() {
        return this.useUTCDateTime;
    }

}
