// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a restart is required after the configuration parameters are modified. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A restart is required.</li>
     * <li><strong>false</strong>: A restart is not required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedRestart")
    public Boolean needRestart;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06798FEE-BEF2-5FAF-A30D-728973BBE97C</p>
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
