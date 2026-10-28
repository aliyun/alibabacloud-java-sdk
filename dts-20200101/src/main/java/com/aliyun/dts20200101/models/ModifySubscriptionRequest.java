// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifySubscriptionRequest extends TeaModel {
    /**
     * <p>The modified objects for change tracking, in the format of a JSON string. For detailed definitions, see <a href="https://help.aliyun.com/document_detail/209545.html">Description of migration, synchronization, or change tracking objects</a>.</p>
     * <blockquote>
     * <ul>
     * <li>The original DbList is overwritten by the newly passed DbList. Make sure that the newly passed DbList contains all the objects that you want to track. Otherwise, tracked objects may be lost. Proceed with caution.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>To query the original objects for change tracking, call the <a href="https://help.aliyun.com/document_detail/208925.html">DescribeDtsJobDetail</a> operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
     */
    @NameInMap("DbList")
    public String dbList;

    /**
     * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsboss6pn1w******</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the change tracking task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>boss6pn1w******</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Reserved")
    public String reserved;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether the modified task tracks DDL data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SubscriptionDataTypeDDL")
    public Boolean subscriptionDataTypeDDL;

    /**
     * <p>Specifies whether the modified task tracks DML data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SubscriptionDataTypeDML")
    public Boolean subscriptionDataTypeDML;

    public static ModifySubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionRequest self = new ModifySubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionRequest setDbList(String dbList) {
        this.dbList = dbList;
        return this;
    }
    public String getDbList() {
        return this.dbList;
    }

    public ModifySubscriptionRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifySubscriptionRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifySubscriptionRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifySubscriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySubscriptionRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public ModifySubscriptionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifySubscriptionRequest setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
        this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
        return this;
    }
    public Boolean getSubscriptionDataTypeDDL() {
        return this.subscriptionDataTypeDDL;
    }

    public ModifySubscriptionRequest setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
        this.subscriptionDataTypeDML = subscriptionDataTypeDML;
        return this;
    }
    public Boolean getSubscriptionDataTypeDML() {
        return this.subscriptionDataTypeDML;
    }

}
