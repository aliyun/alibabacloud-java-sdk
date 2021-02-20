// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("NetLevelCode")
    public String netLevelCode;

    @NameInMap("NetDistrictCode")
    public String netDistrictCode;

    public static DescribeEnsNetDistrictRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetDistrictRequest self = new DescribeEnsNetDistrictRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetDistrictRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeEnsNetDistrictRequest setNetLevelCode(String netLevelCode) {
        this.netLevelCode = netLevelCode;
        return this;
    }
    public String getNetLevelCode() {
        return this.netLevelCode;
    }

    public DescribeEnsNetDistrictRequest setNetDistrictCode(String netDistrictCode) {
        this.netDistrictCode = netDistrictCode;
        return this;
    }
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

}
