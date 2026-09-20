// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The specifications of the core node. For more information about valid values, see <a href="https://help.aliyun.com/document_detail/194870.html">Instance node specifications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <p>The disk type of the core node. Valid values:</p>
     * <ul>
     * <li><strong>cloud_efficiency</strong>: ultra cloud disk</li>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd_pl1</strong>: ESSD</li>
     * <li><strong>local_hdd_pro</strong>: local HDD</li>
     * <li><strong>local_ssd_pro</strong>: local SSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The service type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>hbase</strong>: ApsaraDB for HBase Standard Edition standard instance.</li>
     * <li><strong>hbaseue</strong>: ApsaraDB for HBase Performance-enhanced Edition standard instance.</li>
     * <li><strong>singlehbase</strong>: ApsaraDB for HBase single-node standard instance.</li>
     * <li><strong>bds</strong>: Data Synchronization (BDS) service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version number of the service type. Valid values:</p>
     * <ul>
     * <li><strong>1.0</strong>: The Data Synchronization (BDS) service supports version 1.0.</li>
     * <li><strong>1.1</strong>: ApsaraDB for HBase Standard Edition standard instances and ApsaraDB for HBase single-node standard instances support version 1.1.</li>
     * <li><strong>2.0</strong>: ApsaraDB for HBase Standard Edition standard instances, ApsaraDB for HBase Performance-enhanced Edition standard instances, and ApsaraDB for HBase single-node standard instances support version 2.0.</li>
     * </ul>
     * <blockquote>
     * <p>Specify the version number based on the service type of the ApsaraDB for HBase instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zone. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query available zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeAvailableResourceRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public DescribeAvailableResourceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeAvailableResourceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAvailableResourceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
