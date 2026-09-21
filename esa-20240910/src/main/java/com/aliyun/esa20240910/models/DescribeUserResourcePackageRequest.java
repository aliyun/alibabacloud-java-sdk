// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUserResourcePackageRequest extends TeaModel {
    /**
     * <p>The instance ID of the resource plan.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>_ResourcePack-cn-</strong></strong></p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The sorting field. Valid values:</p>
     * <ul>
     * <li>startTime: the effective period of the instance.</li>
     * <li>endTime: the expiration time of the instance.</li>
     * <li>StartTime: the effective period of the instance.</li>
     * <li>EndTime: the expiration time of the instance.</li>
     * <li>default: no sorting field.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The sorting rule. Default value: desc. Valid values:</p>
     * <ul>
     * <li>asc</li>
     * <li>desc</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortRule")
    public String sortRule;

    /**
     * <p>The status of the resource plan. Default value: valid. Valid values:</p>
     * <ul>
     * <li>valid: Valid.</li>
     * <li>invalid: Invalid.</li>
     * <li>exhaust: Exhausted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>valid</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeUserResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResourcePackageRequest self = new DescribeUserResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserResourcePackageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserResourcePackageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserResourcePackageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserResourcePackageRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeUserResourcePackageRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public DescribeUserResourcePackageRequest setSortRule(String sortRule) {
        this.sortRule = sortRule;
        return this;
    }
    public String getSortRule() {
        return this.sortRule;
    }

    public DescribeUserResourcePackageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
