// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictRequest extends TeaModel {
    /**
     * <p>The region code.</p>
     * <ul>
     * <li><p>If this parameter is empty, only the nodes under the specified network level (NetLevelCode) are queried.</p>
     * </li>
     * <li><p>If this parameter is not empty, only the child nodes under the specified region code (NetDistrictCode) are queried.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100105</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The network level. Valid values:</p>
     * <ul>
     * <li><p><strong>Big</strong>: Major region.</p>
     * </li>
     * <li><p><strong>Middle</strong>: Province.</p>
     * </li>
     * <li><p><strong>Small</strong>: City.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Big</p>
     */
    @NameInMap("NetLevelCode")
    public String netLevelCode;

    public static DescribeEnsNetSaleDistrictRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetSaleDistrictRequest self = new DescribeEnsNetSaleDistrictRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetSaleDistrictRequest setNetDistrictCode(String netDistrictCode) {
        this.netDistrictCode = netDistrictCode;
        return this;
    }
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    public DescribeEnsNetSaleDistrictRequest setNetLevelCode(String netLevelCode) {
        this.netLevelCode = netLevelCode;
        return this;
    }
    public String getNetLevelCode() {
        return this.netLevelCode;
    }

}
