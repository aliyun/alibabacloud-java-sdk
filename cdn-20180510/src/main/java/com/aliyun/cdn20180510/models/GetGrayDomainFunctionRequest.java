// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class GetGrayDomainFunctionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>domain_status,https_option</p>
     */
    @NameInMap("FunctionNames")
    public String functionNames;

    public static GetGrayDomainFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGrayDomainFunctionRequest self = new GetGrayDomainFunctionRequest();
        return TeaModel.build(map, self);
    }

    public GetGrayDomainFunctionRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetGrayDomainFunctionRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

}
