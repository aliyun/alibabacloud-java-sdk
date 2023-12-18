// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetLevelRequest extends TeaModel {
    /**
     * <p>The version number.</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeEnsNetLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetLevelRequest self = new DescribeEnsNetLevelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetLevelRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
