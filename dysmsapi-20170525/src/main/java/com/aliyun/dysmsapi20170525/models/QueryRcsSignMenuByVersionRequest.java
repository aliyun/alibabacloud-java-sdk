// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRcsSignMenuByVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("RcsMenuVersion")
    public String rcsMenuVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static QueryRcsSignMenuByVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRcsSignMenuByVersionRequest self = new QueryRcsSignMenuByVersionRequest();
        return TeaModel.build(map, self);
    }

    public QueryRcsSignMenuByVersionRequest setRcsMenuVersion(String rcsMenuVersion) {
        this.rcsMenuVersion = rcsMenuVersion;
        return this;
    }
    public String getRcsMenuVersion() {
        return this.rcsMenuVersion;
    }

    public QueryRcsSignMenuByVersionRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
