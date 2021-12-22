// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictRequest extends TeaModel {
    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    @NameInMap("NetLevelCode")
    public String netLevelCode;

    @NameInMap("Version")
    public String version;

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

    public DescribeEnsNetDistrictRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
