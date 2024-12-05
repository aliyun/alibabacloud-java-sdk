// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobDetailRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsta7w132u12h****</p>
     */
    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>ta7w132u12h****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to return the information about all data synchronization subtasks. Default value: <strong>false</strong>. A value of false indicates that the system returns only the information about a data synchronization subtask that is running or was most recently run.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncSubJobHistory")
    public Boolean syncSubJobHistory;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong></li>
     * <li><strong>Reverse</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The default value is <strong>Forward</strong>.</li>
     * <li>The value <strong>Reverse</strong> takes effect only if the topology of the data synchronization instance is two-way synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>Specifies whether to query only zero-extract, transform, load (ETL) integration tasks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static DescribeDtsJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobDetailRequest self = new DescribeDtsJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobDetailRequest setDtsInstanceID(String dtsInstanceID) {
        this.dtsInstanceID = dtsInstanceID;
        return this;
    }
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    public DescribeDtsJobDetailRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDtsJobDetailRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDtsJobDetailRequest setSyncSubJobHistory(Boolean syncSubJobHistory) {
        this.syncSubJobHistory = syncSubJobHistory;
        return this;
    }
    public Boolean getSyncSubJobHistory() {
        return this.syncSubJobHistory;
    }

    public DescribeDtsJobDetailRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeDtsJobDetailRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
