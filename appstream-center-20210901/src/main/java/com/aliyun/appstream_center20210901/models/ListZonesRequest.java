// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListZonesRequest extends TeaModel {
    /**
     * <p>The region ID. Required. Specifies the region for which to query available zones. All returned zones are within this region.</p>
     * <p>The value must be a region ID supported by WUYING Cloud Application. Call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs. If an unsupported region is specified, the error code <code>InvalidParameter.ValueInvalid</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The operating system type. Required. Specifies the operating system used by the resource. This parameter, together with <code>ProductType</code>, determines the available zones. The value is case-insensitive. Use the following recommended values.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>Windows</code>: Windows operating system.</li>
     * <li><code>Linux</code>: Linux operating system.</li>
     * <li><code>Android</code>: Android operating system.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The product type. Required. Specifies the product for which to query available zones. The zone list is returned based on the available resources of this product in the specified region. The value is case-insensitive. Use the following recommended values.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>CloudApp</code>: WUYING Cloud Application.</li>
     * <li><code>CloudBrowser</code>: Cloud Browser.</li>
     * <li><code>WuyingServer</code>: Enterprise Edition Workstation.</li>
     * <li><code>WuyingWorkstation</code>: Personal Edition Lingou Container Workstation.</li>
     * <li><code>WuyingWorkstationTeam</code>: Lingou Team Edition Container Workstation.</li>
     * <li><code>WuyingWorkstationBusiness</code>: Lingou Dedicated Edition Container Workstation.</li>
     * <li><code>AndroidCloud</code>: Cloud Phone.</li>
     * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
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
