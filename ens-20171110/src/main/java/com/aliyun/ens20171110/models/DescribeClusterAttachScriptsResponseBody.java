// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Y2QgWnhiU0o=</p>
     */
    @NameInMap("Script")
    public String script;

    public static DescribeClusterAttachScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttachScriptsResponseBody self = new DescribeClusterAttachScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAttachScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterAttachScriptsResponseBody setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

}
