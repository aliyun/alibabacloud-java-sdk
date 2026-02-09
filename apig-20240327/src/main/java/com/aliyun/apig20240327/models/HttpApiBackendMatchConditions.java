// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiBackendMatchConditions extends TeaModel {
    /**
     * <p>The configurations of the matching conditions.</p>
     */
    @NameInMap("conditions")
    public java.util.List<HttpApiBackendMatchCondition> conditions;

    /**
     * <p>Specifies whether the matching condition is the default one.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("default")
    public Boolean _default;

    public static HttpApiBackendMatchConditions build(java.util.Map<String, ?> map) throws Exception {
        HttpApiBackendMatchConditions self = new HttpApiBackendMatchConditions();
        return TeaModel.build(map, self);
    }

    public HttpApiBackendMatchConditions setConditions(java.util.List<HttpApiBackendMatchCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<HttpApiBackendMatchCondition> getConditions() {
        return this.conditions;
    }

    public HttpApiBackendMatchConditions set_default(Boolean _default) {
        this._default = _default;
        return this;
    }
    public Boolean get_default() {
        return this._default;
    }

}
