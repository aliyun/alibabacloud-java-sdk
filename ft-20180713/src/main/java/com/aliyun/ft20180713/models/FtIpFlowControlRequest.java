// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtIpFlowControlRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static FtIpFlowControlRequest build(java.util.Map<String, ?> map) throws Exception {
        FtIpFlowControlRequest self = new FtIpFlowControlRequest();
        return TeaModel.build(map, self);
    }

    public FtIpFlowControlRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
