// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOpEntitiesRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DescribeOpEntities**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details of the operation log.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The sort order of operation logs. Valid values:</p>
     * <br>
     * <p>*   **ASC**: the ascending order.</p>
     * <p>*   **DESC**: the descending order.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](https://help.aliyun.com/document_detail/118703.html) operation to query the most recent region list.</p>
     */
    @NameInMap("OrderDir")
    public String orderDir;

    /**
     * <p>The type of the operation object. The value is fixed as **1**, which indicates Anti-DDoS Origin instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the Alibaba Cloud account that performs the operation.</p>
     * <br>
     * <p>>  If the value is **system**, the operation is performed by Anti-DDoS Origin.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The details about the operation. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <br>
     * <p>*   **entity**: the operation object. Data type: object. The fields that are included in the value of the **entity** parameter vary based on the value of the **OpAction** parameter. Take note of the following items:</p>
     * <br>
     * <p>    *   If the value of the **OpAction** parameter is **3**, the value of the **entity** parameter consists of the following field:</p>
     * <br>
     * <p>        *   **ips**: the public IP addresses that are protected by the Anti-DDoS Origin instance. Data type: array</p>
     * <br>
     * <p>    *   If the value of the **OpAction** parameter is **4**, the value of the **entity** parameter consists of the following field:</p>
     * <br>
     * <p>        *   **ips**: the public IP addresses that are no longer protected by the Anti-DDoS Origin instance. Data type: array.</p>
     * <br>
     * <p>    *   If the value of the **OpAction** parameter is **5**, the value of the **entity** parameter consists of the following fields:</p>
     * <br>
     * <p>        *   **baseBandwidth**: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</p>
     * <p>        *   **elasticBandwidth**: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</p>
     * <p>        *   **opSource**: the source of the operation. The value is fixed as **1**, indicating that the operation is performed by Anti-DDoS Origin. Data type: integer.</p>
     * <br>
     * <p>    *   If the value of the **OpAction** parameter is **6**, the value of the **entity** parameter consists of the following field:</p>
     * <br>
     * <p>        *   **ips**: the public IP addresses for which to deactivate blackhole filtering. Data type: array.</p>
     * <br>
     * <p>    *   If the value of the **OpAction** parameter is **7**, the **entity** parameter is not returned.</p>
     * <br>
     * <p>    *   If the value of the **OpAction** parameter is **8**, the value of the **entity** parameter consists of the following fields:</p>
     * <br>
     * <p>        *   **baseBandwidth**: the basic protection bandwidth. Unit: Gbit/s. Data type: integer.</p>
     * <p>        *   **elasticBandwidth**: the burstable protection bandwidth. Unit: Gbit/s. Data type: integer.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sorting method of operation logs. Set the value to **opdate**, which indicates sorting based on the operation time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeOpEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpEntitiesRequest self = new DescribeOpEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpEntitiesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOpEntitiesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeOpEntitiesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOpEntitiesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeOpEntitiesRequest setOrderDir(String orderDir) {
        this.orderDir = orderDir;
        return this;
    }
    public String getOrderDir() {
        return this.orderDir;
    }

    public DescribeOpEntitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOpEntitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOpEntitiesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeOpEntitiesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
