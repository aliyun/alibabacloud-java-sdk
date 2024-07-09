// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachEndUserRequest extends TeaModel {
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
    public String clientType;

    /**
     * <p>The serial number (SN) of the hardware client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F9E52EDCCB2B****</p>
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
     * <p>The ID of the user that you want to unbind from the hardware client.</p>
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
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    public static DetachEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachEndUserRequest self = new DetachEndUserRequest();
        return TeaModel.build(map, self);
    }

    public DetachEndUserRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public DetachEndUserRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DetachEndUserRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DetachEndUserRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DetachEndUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DetachEndUserRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
