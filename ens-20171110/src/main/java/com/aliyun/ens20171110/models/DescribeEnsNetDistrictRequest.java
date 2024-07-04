// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictRequest extends TeaModel {
    /**
     * <p>The code of the region.</p>
     * <p>If you do not specify this parameter, only nodes in the regions of the level that is specified by the NetLevelCode parameter are queried.</p>
     * <p>If you specify this parameter, only nodes in the regions of the level that is specified by this parameter are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>100106</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The level of the region.</p>
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

    public static DescribeEnsNetDistrictRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetDistrictRequest self = new DescribeEnsNetDistrictRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetDistrictRequest setNetDistrictCode(String netDistrictCode) {
        this.netDistrictCode = netDistrictCode;
        return this;
    }
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    public DescribeEnsNetDistrictRequest setNetLevelCode(String netLevelCode) {
        this.netLevelCode = netLevelCode;
        return this;
    }
    public String getNetLevelCode() {
        return this.netLevelCode;
    }

}
