// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDevicesRequest extends TeaModel {
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
     * <li>2: software client.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The ID of the device. The serial number (SN) of the hardware client or the UUID of the software client.</p>
     * 
     * <strong>example:</strong>
     * <p>5F52817BE267A43C608D245070D2****</p>
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
     * <p>The ID of the bound user.</p>
     * 
     * <strong>example:</strong>
     * <p>moli</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

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

    public static DescribeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesRequest self = new DescribeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public DescribeDevicesRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DescribeDevicesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DescribeDevicesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDevicesRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeDevicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDevicesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDevicesRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
