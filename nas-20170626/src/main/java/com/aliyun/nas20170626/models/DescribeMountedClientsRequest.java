// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountedClientsRequest extends TeaModel {
    /**
     * <p>The IP address of the client.</p>
     * <ul>
     * <li>If you specify an IP address, the operation checks whether the client list includes this IP address. If the client list includes the IP address, the operation returns the IP address. If the client list does not include the IP address, the operation returns an empty list.</li>
     * <li>If you do not specify an IP address, the operation returns the IP addresses of all clients that have accessed the specified NAS file system within the last minute.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.1</p>
     */
    @NameInMap("ClientIP")
    public String clientIP;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>109c****66</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The domain name of the mount target.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111222****95.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

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
     * <p>The number of IP addresses to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMountedClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountedClientsRequest self = new DescribeMountedClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMountedClientsRequest setClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }
    public String getClientIP() {
        return this.clientIP;
    }

    public DescribeMountedClientsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeMountedClientsRequest setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public DescribeMountedClientsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountedClientsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountedClientsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
