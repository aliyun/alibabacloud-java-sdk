// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessGroupsRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The name must be 3 to 64 characters in length.</li>
     * <li>The name must start with a letter and can contain letters, digits, underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_VPC_GROUP_NAME</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The type of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>standard: General-purpose NAS</li>
     * <li>extreme: Extreme NAS</li>
     * <li>cpfs: CPFS</li>
     * </ul>
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
     * <p>The number of permission groups returned per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the time to return is displayed in UTC.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true (default): The time is displayed in UTC.</li>
     * <li>false: The time is not displayed in UTC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
