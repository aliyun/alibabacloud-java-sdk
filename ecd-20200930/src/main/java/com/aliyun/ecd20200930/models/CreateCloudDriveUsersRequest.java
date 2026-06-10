// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveUsersRequest extends TeaModel {
    /**
     * <p>Enterprise cloud drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-352282****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>List of end user IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The ID of the region. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to obtain a list of regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Maximum storage size for a user\&quot;s personal cloud drive. This value must not exceed the remaining available capacity in the enterprise cloud drive. Unit: byte.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>209715200</p>
     */
    @NameInMap("UserMaxSize")
    public Long userMaxSize;

    public static CreateCloudDriveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveUsersRequest self = new CreateCloudDriveUsersRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveUsersRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCloudDriveUsersRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public CreateCloudDriveUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCloudDriveUsersRequest setUserMaxSize(Long userMaxSize) {
        this.userMaxSize = userMaxSize;
        return this;
    }
    public Long getUserMaxSize() {
        return this.userMaxSize;
    }

}
