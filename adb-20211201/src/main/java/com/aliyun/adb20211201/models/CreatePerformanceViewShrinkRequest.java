// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreatePerformanceViewShrinkRequest extends TeaModel {
    /**
     * <p>The type of the original monitoring dashboard from which the current monitoring dashboard is copied. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: basic dashboard.</li>
     * <li><strong>Advanced</strong>: advanced dashboard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("CreateFromViewType")
    public String createFromViewType;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to populate the keys from the original monitoring dashboard when viewing the monitoring dashboard. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FillOriginViewKeys")
    public Boolean fillOriginViewKeys;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the supported regions and zones, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The details of the monitoring dashboard.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ViewDetail")
    public String viewDetailShrink;

    /**
     * <p>The name of the monitoring dashboard.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom-All metrics-2 columns-Linked</p>
     */
    @NameInMap("ViewName")
    public String viewName;

    public static CreatePerformanceViewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePerformanceViewShrinkRequest self = new CreatePerformanceViewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePerformanceViewShrinkRequest setCreateFromViewType(String createFromViewType) {
        this.createFromViewType = createFromViewType;
        return this;
    }
    public String getCreateFromViewType() {
        return this.createFromViewType;
    }

    public CreatePerformanceViewShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreatePerformanceViewShrinkRequest setFillOriginViewKeys(Boolean fillOriginViewKeys) {
        this.fillOriginViewKeys = fillOriginViewKeys;
        return this;
    }
    public Boolean getFillOriginViewKeys() {
        return this.fillOriginViewKeys;
    }

    public CreatePerformanceViewShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePerformanceViewShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePerformanceViewShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePerformanceViewShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePerformanceViewShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePerformanceViewShrinkRequest setViewDetailShrink(String viewDetailShrink) {
        this.viewDetailShrink = viewDetailShrink;
        return this;
    }
    public String getViewDetailShrink() {
        return this.viewDetailShrink;
    }

    public CreatePerformanceViewShrinkRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

}
