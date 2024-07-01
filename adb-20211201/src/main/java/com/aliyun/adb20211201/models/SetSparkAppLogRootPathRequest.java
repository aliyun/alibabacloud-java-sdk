// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SetSparkAppLogRootPathRequest extends TeaModel {
    /**
     * <p>The database ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-dbclusterid</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The Object Storage Service (OSS) log path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://path/to/log</p>
     */
    @NameInMap("OssLogPath")
    public String ossLogPath;

    /**
     * <p>Specifies whether to use the default OSS log path.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseDefaultOss")
    public Boolean useDefaultOss;

    public static SetSparkAppLogRootPathRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSparkAppLogRootPathRequest self = new SetSparkAppLogRootPathRequest();
        return TeaModel.build(map, self);
    }

    public SetSparkAppLogRootPathRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SetSparkAppLogRootPathRequest setOssLogPath(String ossLogPath) {
        this.ossLogPath = ossLogPath;
        return this;
    }
    public String getOssLogPath() {
        return this.ossLogPath;
    }

    public SetSparkAppLogRootPathRequest setUseDefaultOss(Boolean useDefaultOss) {
        this.useDefaultOss = useDefaultOss;
        return this;
    }
    public Boolean getUseDefaultOss() {
        return this.useDefaultOss;
    }

}
