// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictRequest extends TeaModel {
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    @NameInMap("NetLevelCode")
    public String netLevelCode;

    @NameInMap("Version")
    public String version;

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

    public DescribeEnsNetSaleDistrictRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
