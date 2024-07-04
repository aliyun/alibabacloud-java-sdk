// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictRequest extends TeaModel {
    /**
     * <p>The region code.</p>
     * <ul>
     * <li>If you do not specify this parameter, only nodes under the area level that is specified by NetLevelCode are queried.</li>
     * <li>If you specify this parameter, only child nodes in the area that is specified by NetDistrictCode are queried.</li>
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
     * <li><strong>Big</strong>: area</li>
     * <li><strong>Middle</strong>: province</li>
     * <li><strong>Small</strong>: city</li>
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
