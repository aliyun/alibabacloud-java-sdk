// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("NetLevelCode")
    @Validation(required = true)
    public String netLevelCode;

    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    public static DescribeEnsNetSaleDistrictRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetSaleDistrictRequest self = new DescribeEnsNetSaleDistrictRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetSaleDistrictRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeEnsNetSaleDistrictRequest setNetLevelCode(String netLevelCode) {
        this.netLevelCode = netLevelCode;
        return this;
    }
    public String getNetLevelCode() {
        return this.netLevelCode;
    }

    public DescribeEnsNetSaleDistrictRequest setNetDistrictCode(String netDistrictCode) {
        this.netDistrictCode = netDistrictCode;
        return this;
    }
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

}
