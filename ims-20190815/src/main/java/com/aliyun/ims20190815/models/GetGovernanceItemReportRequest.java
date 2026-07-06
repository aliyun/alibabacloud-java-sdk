// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetGovernanceItemReportRequest extends TeaModel {
    /**
     * <p>The check item. For more information, see <a href="https://help.aliyun.com/zh/ram/user-guide/overview-of-cloud-governance-for-ram?spm=a2c4g.11174283.0.0.88b3de53tfL5XG#section-q06-p9p-8vl">Identity and access governance check items</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SSOLoginEnabled</p>
     */
    @NameInMap("GovernanceItemType")
    public String governanceItemType;

    /**
     * <p>If the response is truncated, use the <code>Marker</code> to retrieve the subsequent content.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If the response is truncated because the number of entries exceeds the value of <code>MaxItems</code>, the value of the <code>IsTruncated</code> parameter is true.</p>
     * <p>Valid values: 1 to 1000. Default value: 1000.</p>
     * 
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
