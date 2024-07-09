// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesRequest extends TeaModel {
    /**
     * <p>Details of directory IDs. You can specify one or more directory IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
     */
    @NameInMap("DirectoryId")
    public java.util.List<String> directoryId;

    /**
     * <p>The directory status. This parameter is equivalent to <code>Status</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>REGISTERED</p>
     */
    @NameInMap("DirectoryStatus")
    public String directoryStatus;

    /**
     * <p>The directory type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SIMPLE: a directory of the convenience account type</li>
     * <li>AD_CONNECTOR: an AD directory</li>
     * <li>RAM: a RAM directory</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RAM</p>
     */
    @NameInMap("DirectoryType")
    public String directoryType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The directory status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>REGISTERING: The directory is being registered.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DEREGISTERING: The directory is being deregistered.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>REGISTERED: The directory is registered.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>NEEDCONFIGTRUST: A trust relationship needs to be configured for the directory.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>CONFIGTRUSTFAILED: A trust relationship fails to be configured for the directory.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DEREGISTERED: The directory is deregistered.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ERROR: One or more configurations of the directory are invalid.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>CONFIGTRUSTING: A trust relationship is being configured.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>NEEDCONFIGUSER: Users need to be configured for the directory.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>REGISTERED</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesRequest self = new DescribeDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesRequest setDirectoryId(java.util.List<String> directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public java.util.List<String> getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDirectoriesRequest setDirectoryStatus(String directoryStatus) {
        this.directoryStatus = directoryStatus;
        return this;
    }
    public String getDirectoryStatus() {
        return this.directoryStatus;
    }

    public DescribeDirectoriesRequest setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
        return this;
    }
    public String getDirectoryType() {
        return this.directoryType;
    }

    public DescribeDirectoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDirectoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDirectoriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
