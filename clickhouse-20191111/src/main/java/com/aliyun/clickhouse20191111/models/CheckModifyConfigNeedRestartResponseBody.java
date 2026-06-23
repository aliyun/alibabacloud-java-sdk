// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartResponseBody extends TeaModel {
    /**
     * <p>变更配置参数后是否重启。取值说明：</p>
     * <ul>
     * <li><p><strong>true</strong>：重启。</p>
     * </li>
     * <li><p><strong>false</strong>：不重启。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedRestart")
    public Boolean needRestart;

    /**
     * <p>请求 ID。</p>
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
