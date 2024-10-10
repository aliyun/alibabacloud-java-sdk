// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobLogResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <blockquote>
     * <p>stdout:n++++++++++++++++++executing sql: create database if not exists jindo_test location \&quot;oss://pangbei-hdfs/tmp/hive\&quot; n++n</p>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     * </blockquote>
     */
    @NameInMap("Log")
    public String log;

    /**
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDIJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobLogResponseBody self = new GetDIJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDIJobLogResponseBody setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public GetDIJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
