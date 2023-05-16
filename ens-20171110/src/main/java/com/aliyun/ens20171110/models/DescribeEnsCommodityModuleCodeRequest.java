// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsCommodityModuleCodeRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ModuleCode")
    public String moduleCode;

    public static DescribeEnsCommodityModuleCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsCommodityModuleCodeRequest self = new DescribeEnsCommodityModuleCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsCommodityModuleCodeRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeEnsCommodityModuleCodeRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

}
