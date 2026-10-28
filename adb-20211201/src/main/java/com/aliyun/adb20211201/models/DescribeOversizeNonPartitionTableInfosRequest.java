// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeOversizeNonPartitionTableInfosRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The time is in UTC and follows the <i>yyyy-MM-ddTHH:mm:ssZ</i> format.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The interval between the start time and the end time must be less than 7 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-05-11T05:44Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the title for the downloaded file and specific error messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Simplified Chinese. This is the default value.</li>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * <li><strong>zh-tw</strong>: Traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sorting rule for a specified field. The value is a JSON array. You must specify the fields to be sorted and the sorting order in sequence. Example:</p>
     * <pre><code>[
     * 
     *     {
     * 
     *         &quot;Field&quot;:&quot;Name&quot;,
     * 
     *         &quot;Type&quot;:&quot;Asc&quot;
     * 
     *     }
     * 
     * ]
     * </code></pre>
     * <p>Field: the name of the field to be sorted. Only the Name field is supported.
     * Type: the sorting order. Valid values: Desc for descending order, and Asc for ascending order.</p>
     * <p>The values are not case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Field&quot;:&quot;SchemaName&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be a positive integer. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li>30</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the region ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the query. The time is in UTC and follows the yyyy-MM-ddTHH:mmZ format.</p>
     * <blockquote>
     * <p>SQL audit logs can be queried only when SQL audit is enabled. You can query SQL audit logs generated within the last 30 days. If SQL audit is disabled and then re-enabled, you can query only the SQL audit logs generated after it is re-enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-05-11T05:44Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeOversizeNonPartitionTableInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOversizeNonPartitionTableInfosRequest self = new DescribeOversizeNonPartitionTableInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOversizeNonPartitionTableInfosRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeOversizeNonPartitionTableInfosRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
