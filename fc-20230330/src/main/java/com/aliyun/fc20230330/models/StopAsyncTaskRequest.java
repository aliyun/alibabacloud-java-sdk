// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class StopAsyncTaskRequest extends TeaModel {
    /**
     * <p>The function version or alias.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static StopAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAsyncTaskRequest self = new StopAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopAsyncTaskRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
