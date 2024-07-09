// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AttachEndUserRequest extends TeaModel {
    /**
     * <p>The address of the Active Directory (AD) office network.</p>
     * 
     * <strong>example:</strong>
     * <p>xn--0zw****</p>
     */
    @NameInMap("AdDomain")
    public String adDomain;

    /**
     * <p>The type of the client.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: hardware client.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The serial number (SN) of the hardware client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111810122200F0C24CF7F1BF-<em>05AY</em>***</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>The ID of the convenient office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the user that you want to bind to the hardware client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>moli</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The account type of the user.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AD: enterprise AD account.</li>
     * <li>SIMPLE: convenience account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static AttachEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEndUserRequest self = new AttachEndUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachEndUserRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public AttachEndUserRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public AttachEndUserRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AttachEndUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public AttachEndUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public AttachEndUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachEndUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
