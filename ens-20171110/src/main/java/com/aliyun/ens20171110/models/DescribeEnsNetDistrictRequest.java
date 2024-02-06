// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictRequest extends TeaModel {
    /**
     * <p>The code of the region.</p>
     * <br>
     * <p>If you do not specify this parameter, only nodes in the regions of the level that is specified by the NetLevelCode parameter are queried.</p>
     * <br>
     * <p>If you specify this parameter, only nodes in the regions of the level that is specified by this parameter are queried.</p>
     */
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    /**
     * <p>The level of the region.</p>
     * <br>
     * <p>*   **Big**: area</p>
     * <p>*   **Middle**: province</p>
     * <p>*   **Small**: city</p>
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
