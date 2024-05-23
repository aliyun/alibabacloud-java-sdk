// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictRequest extends TeaModel {
    /**
     * <p>The region code.</p>
     * <br>
     * <p>*   If you do not specify this parameter, only nodes under the area level that is specified by NetLevelCode are queried.</p>
     * <p>*   If you specify this parameter, only child nodes in the area that is specified by NetDistrictCode are queried.</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The network level. Valid values:</p>
     * <br>
     * <p>*   **Big**: area</p>
     * <p>*   **Middle**: province</p>
     * <p>*   **Small**: city</p>
     * <br>
     * <p>This parameter is required.</p>
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
