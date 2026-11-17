// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListZonesRequest extends TeaModel {
    /**
     * <p>The region ID. Required. Specifies the region for which you want to query available zones. All returned zones are located in this region.</p>
     * <p>The value must be a region ID supported by App Streaming. You can call <a href="~~ListRegions~~">ListRegions</a> to query the supported region IDs. If you specify an unsupported region, the error code InvalidParameter.ValueInvalid is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The operating system type. Required. Specifies the operating system used by the resource. This parameter and ProductType together determine the available zones. The value is case-insensitive. Use one of the following values:</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Windows: Windows operating system</li>
     * <li>Linux: Linux operating system</li>
     * <li>Android: Android operating system</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The product type. Required. Specifies the product for which you want to query available zones. The list of available zones is returned based on the available resources of the product in the specified region. The value is case-insensitive. Use one of the following values:</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * <li>CloudBrowser: Cloud Browser</li>
     * <li>WuyingServer: Enterprise Edition workstation</li>
     * <li>WuyingWorkstation: Personal Edition Linggou container workstation</li>
     * <li>WuyingWorkstationTeam: Team Edition Linggou container workstation</li>
     * <li>WuyingWorkstationBusiness: Dedicated Edition Linggou container workstation</li>
     * <li>AndroidCloud: Cloud Phone</li>
     * <li>AIAgent: AgentBay (AI agent)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListZonesRequest self = new ListZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListZonesRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListZonesRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListZonesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
