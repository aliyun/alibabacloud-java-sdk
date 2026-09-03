// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class HdfsAuthConfig extends TeaModel {
    /**
     * <p>The authentication type for HDFS.</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The username for HDFS authentication.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static HdfsAuthConfig build(java.util.Map<String, ?> map) throws Exception {
        HdfsAuthConfig self = new HdfsAuthConfig();
        return TeaModel.build(map, self);
    }

    public HdfsAuthConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public HdfsAuthConfig setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
