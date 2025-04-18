// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeConfigGroupRequest extends TeaModel {
    /**
     * <p>The ID of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The IDs of the configuration groups.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    /**
     * <p>The name of the configuration group.</p>
     * 
     * <strong>example:</strong>
     * <p>ScheduledTask</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The service type of the configuration group.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CLOUD_DESKTOP: the cloud computer service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_DESKTOP</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the configuration groups.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    /**
     * <p>The type of the configuration group.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Timer: the scheduled task type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Timer</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigGroupRequest self = new DescribeConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeConfigGroupRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public DescribeConfigGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeConfigGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConfigGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConfigGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeConfigGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeConfigGroupRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public DescribeConfigGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
