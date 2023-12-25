// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the cluster was restarted after you modified the configuration parameters. Valid values:</p>
     * <br>
     * <p>*   **true**: The cluster was restarted.</p>
     * <p>*   **false**: The cluster was not restarted.</p>
     */
    @NameInMap("NeedRestart")
    public Boolean needRestart;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckModifyConfigNeedRestartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyConfigNeedRestartResponseBody self = new CheckModifyConfigNeedRestartResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckModifyConfigNeedRestartResponseBody setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }
    public Boolean getNeedRestart() {
        return this.needRestart;
    }

    public CheckModifyConfigNeedRestartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
