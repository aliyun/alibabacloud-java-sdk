// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePolicyLogsRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-030wldnqm8evtpy****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The lifecycle policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lc-xxx</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>The number of the page to return.</p>
     * <p>Starts from 1. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of log entries to return on each page.</p>
     * <p>Value range: 1–100. Default: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeLifecyclePolicyLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePolicyLogsRequest self = new DescribeLifecyclePolicyLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePolicyLogsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeLifecyclePolicyLogsRequest setLifecyclePolicyId(String lifecyclePolicyId) {
        this.lifecyclePolicyId = lifecyclePolicyId;
        return this;
    }
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
    }

    public DescribeLifecyclePolicyLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecyclePolicyLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
