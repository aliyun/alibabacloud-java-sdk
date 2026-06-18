// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckAssumeSlrRoleResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("IsExist")
    public String isExist;

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
