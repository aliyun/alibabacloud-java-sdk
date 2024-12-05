// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListRequest extends TeaModel {
    /**
     * <p>destination aliyun uid</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestAliyunUid")
    public String destAliyunUid;

    /**
     * <p>VPCNAT destination main VSW</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestPrimaryVswId")
    public String destPrimaryVswId;

    /**
     * <p>destination role name</p>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts-sq</p>
     */
    @NameInMap("DestRoleName")
    public String destRoleName;

    /**
     * <p>VPCNAT destination backup VSW</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestSecondaryVswId")
    public String destSecondaryVswId;

    /**
     * <p>source vpc id</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DestVpcId")
    public String destVpcId;

    /**
     * <p>The region ID to which the target instance belongs, please refer to the supported region list for details.</p>
     * <blockquote>
     * <blockquote>
     * <p>If the target instance is a self built database or third-party cloud database with a public IP address, you can pass in the cn Hangzhou or the region ID closest to the physical distance of the database.</p>
     * </blockquote>
     * </blockquote>
     * <ul>
     * <li>When the DTS task is migration or synchronization, this parameter must be passed in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationRegion")
    public String destinationRegion;

    /**
     * <p>The region ID of the change tracking instance. The region ID is the same as that of the source instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region where the change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek26mat2ldb4oy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>source aliyun uid</p>
     * 
     * <strong>example:</strong>
     * <p>1971721963139419</p>
     */
    @NameInMap("SrcAliyunUid")
    public String srcAliyunUid;

    /**
     * <p>VPCNAT source end main VSW</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcPrimaryVswId")
    public String srcPrimaryVswId;

    /**
     * <p>source role Name</p>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("SrcRoleName")
    public String srcRoleName;

    /**
     * <p>VPCNAT source backup VSW</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcSecondaryVswId")
    public String srcSecondaryVswId;

    /**
     * <p>source vpc id</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SrcVpcId")
    public String srcVpcId;

    /**
     * <p>The access method for self built databases or third-party cloud databases, with a value of</p>
     * <ul>
     * <li>Internet: accessed through the public network.</li>
     * <li>VPC: Connected through dedicated line/VPN gateway/intelligent gateway.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Whether it is a seamless integration (Zero-ETL) task, the value can be:</p>
     * <ul>
     * <li><strong>false</strong>: No. - <strong>true</strong>: Yes.</li>
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
