// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnUserConfigRequest extends TeaModel {
    /**
     * <p>The name of the user feature that you want to delete. Currently, only DCDN Web Application Firewall (WAF) can be deleted. Default value: waf.</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    public static DeleteDcdnUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnUserConfigRequest self = new DeleteDcdnUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnUserConfigRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
