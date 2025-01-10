// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListLniPrivateIpAddressRequest extends TeaModel {
    /**
     * <p>The description of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Whether pagination is required</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>network interface controller IP address</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.98.10</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>IP unique identifier</p>
     * 
     * <strong>example:</strong>
     * <p>sip-tynhdh2s</p>
     */
    @NameInMap("IpName")
    public String ipName;

    /**
     * <p>Lingjun network interface controller ID</p>
     * 
     * <strong>example:</strong>
     * <p>lni-2ze4uww7n6hsfzrwq77y</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Obtain the index number of the current mouse click for an animation</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListLniPrivateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLniPrivateIpAddressRequest self = new ListLniPrivateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public ListLniPrivateIpAddressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListLniPrivateIpAddressRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListLniPrivateIpAddressRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListLniPrivateIpAddressRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public ListLniPrivateIpAddressRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public ListLniPrivateIpAddressRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLniPrivateIpAddressRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLniPrivateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
