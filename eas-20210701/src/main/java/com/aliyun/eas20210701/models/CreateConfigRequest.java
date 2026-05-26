// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateConfigRequest extends TeaModel {
    /**
     * <p>配置值</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model&quot;: &quot;gpt-4&quot;}</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRequest self = new CreateConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
