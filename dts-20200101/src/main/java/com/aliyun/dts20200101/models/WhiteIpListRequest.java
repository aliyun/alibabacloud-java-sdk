// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the destination.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestAliyunUid")
    public String destAliyunUid;

    /**
     * <p>The ID of the primary vSwitch for the destination VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestPrimaryVswId")
    public String destPrimaryVswId;

    /**
     * <p>The name of the destination role.</p>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts-sq</p>
     */
    @NameInMap("DestRoleName")
    public String destRoleName;

    /**
     * <p>The ID of the secondary vSwitch for the destination VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestSecondaryVswId")
    public String destSecondaryVswId;

    /**
     * <p>The ID of the destination VPC.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestVpcId")
    public String destVpcId;

    /**
     * <p>The region ID of the destination instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If the destination instance is a self-managed database or a third-party cloud database that has a public IP address, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is geographically closest to the database.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter is required when the DTS task is a data migration or data synchronization task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <p>The region ID of the source instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>If the source instance is a self-managed database or a third-party cloud database that has a public IP address, you can specify <strong>cn-hangzhou</strong> or the ID of the region that is geographically closest to the database.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek26mat2ldb4oy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Alibaba Cloud account ID of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>1971721963139419</p>
     */
    @NameInMap("SrcAliyunUid")
    public String srcAliyunUid;

    /**
     * <p>The ID of the primary vSwitch for the source VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcPrimaryVswId")
    public String srcPrimaryVswId;

    /**
     * <p>The name of the source role.</p>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("SrcRoleName")
    public String srcRoleName;

    /**
     * <p>The ID of the secondary vSwitch for the source VPC NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcSecondaryVswId")
    public String srcSecondaryVswId;

    /**
     * <p>The ID of the source VPC.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcVpcId")
    public String srcVpcId;

    /**
     * <p>The connection method of the self-managed database or third-party cloud database. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: connected over the Internet.</li>
     * <li><strong>vpc</strong>: connected over an Express Connect circuit, a VPN gateway, or a Smart Access Gateway (SAG).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies whether the task is a zero-ETL task. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static WhiteIpListRequest build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpListRequest self = new WhiteIpListRequest();
        return TeaModel.build(map, self);
    }

    public WhiteIpListRequest setDestAliyunUid(String destAliyunUid) {
        this.destAliyunUid = destAliyunUid;
        return this;
    }
    public String getDestAliyunUid() {
        return this.destAliyunUid;
    }

    public WhiteIpListRequest setDestPrimaryVswId(String destPrimaryVswId) {
        this.destPrimaryVswId = destPrimaryVswId;
        return this;
    }
    public String getDestPrimaryVswId() {
        return this.destPrimaryVswId;
    }

    public WhiteIpListRequest setDestRoleName(String destRoleName) {
        this.destRoleName = destRoleName;
        return this;
    }
    public String getDestRoleName() {
        return this.destRoleName;
    }

    public WhiteIpListRequest setDestSecondaryVswId(String destSecondaryVswId) {
        this.destSecondaryVswId = destSecondaryVswId;
        return this;
    }
    public String getDestSecondaryVswId() {
        return this.destSecondaryVswId;
    }

    public WhiteIpListRequest setDestVpcId(String destVpcId) {
        this.destVpcId = destVpcId;
        return this;
    }
    public String getDestVpcId() {
        return this.destVpcId;
    }

    public WhiteIpListRequest setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    public WhiteIpListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public WhiteIpListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WhiteIpListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public WhiteIpListRequest setSrcAliyunUid(String srcAliyunUid) {
        this.srcAliyunUid = srcAliyunUid;
        return this;
    }
    public String getSrcAliyunUid() {
        return this.srcAliyunUid;
    }

    public WhiteIpListRequest setSrcPrimaryVswId(String srcPrimaryVswId) {
        this.srcPrimaryVswId = srcPrimaryVswId;
        return this;
    }
    public String getSrcPrimaryVswId() {
        return this.srcPrimaryVswId;
    }

    public WhiteIpListRequest setSrcRoleName(String srcRoleName) {
        this.srcRoleName = srcRoleName;
        return this;
    }
    public String getSrcRoleName() {
        return this.srcRoleName;
    }

    public WhiteIpListRequest setSrcSecondaryVswId(String srcSecondaryVswId) {
        this.srcSecondaryVswId = srcSecondaryVswId;
        return this;
    }
    public String getSrcSecondaryVswId() {
        return this.srcSecondaryVswId;
    }

    public WhiteIpListRequest setSrcVpcId(String srcVpcId) {
        this.srcVpcId = srcVpcId;
        return this;
    }
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    public WhiteIpListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WhiteIpListRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
