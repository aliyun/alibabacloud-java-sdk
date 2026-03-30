// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetGovernanceItemReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SSOLoginEnabled</p>
     */
    @NameInMap("GovernanceItemType")
    public String governanceItemType;

    /**
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxItems")
    public String maxItems;

    public static GetGovernanceItemReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceItemReportRequest self = new GetGovernanceItemReportRequest();
        return TeaModel.build(map, self);
    }

    public GetGovernanceItemReportRequest setGovernanceItemType(String governanceItemType) {
        this.governanceItemType = governanceItemType;
        return this;
    }
    public String getGovernanceItemType() {
        return this.governanceItemType;
    }

    public GetGovernanceItemReportRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public GetGovernanceItemReportRequest setMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public String getMaxItems() {
        return this.maxItems;
    }

}
