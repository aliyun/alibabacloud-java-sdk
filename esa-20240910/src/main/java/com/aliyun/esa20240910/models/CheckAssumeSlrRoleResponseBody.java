// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckAssumeSlrRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliuid:xxx assumeOssRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsExist")
    public String isExist;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckAssumeSlrRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAssumeSlrRoleResponseBody self = new CheckAssumeSlrRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAssumeSlrRoleResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CheckAssumeSlrRoleResponseBody setIsExist(String isExist) {
        this.isExist = isExist;
        return this;
    }
    public String getIsExist() {
        return this.isExist;
    }

    public CheckAssumeSlrRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
