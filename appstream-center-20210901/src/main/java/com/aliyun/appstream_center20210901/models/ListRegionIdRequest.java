// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListRegionIdRequest extends TeaModel {
    /**
     * <p>The product type for querying available image regions. If this parameter is omitted, the query is performed based on CloudApp. Valid values:</p>
     * <ul>
     * <li><strong>CloudGame</strong>: cloud gaming</li>
     * <li><strong>CloudApp</strong>: WUYING Cloud App</li>
     * <li><strong>CloudBrowser</strong>: secure browser</li>
     * <li><strong>CloudDesktop</strong>: WUYING Cloud Desktop</li>
     * <li><strong>ImageBuilder</strong>: image creation resources</li>
     * <li><strong>ImageValidate</strong>: image validation resources</li>
     * <li><strong>AndroidCloud</strong>: Android cloud</li>
     * <li><strong>GpuRender</strong>: GPU rendering</li>
     * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering</li>
     * <li><strong>WuyingServer</strong>: Enterprise Edition workstation</li>
     * <li><strong>GpuProxy</strong>: GPU remote rendering proxy</li>
     * <li><strong>GpuCache</strong>: GPU remote rendering cache</li>
     * <li><strong>AIAgent</strong>: AI agent service</li>
     * <li><strong>HostedDesktop</strong>: hosted desktop</li>
     * <li><strong>WuyingWorkstation</strong>: Personal Edition container workstation</li>
     * <li><strong>WuyingWorkstationBusiness</strong>: Business Edition container workstation</li>
     * <li><strong>WuyingWorkstationTeam</strong>: Linggou container workstation Team Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListRegionIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionIdRequest self = new ListRegionIdRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionIdRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
