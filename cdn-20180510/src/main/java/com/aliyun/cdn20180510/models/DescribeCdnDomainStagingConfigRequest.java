// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The list of feature names. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/388460.html">A list of features</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>aliauth</p>
     */
    @NameInMap("FunctionNames")
    public String functionNames;

    public static DescribeCdnDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainStagingConfigRequest self = new DescribeCdnDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnDomainStagingConfigRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

}
