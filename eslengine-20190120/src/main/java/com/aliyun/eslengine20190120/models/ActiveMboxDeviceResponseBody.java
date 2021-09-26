// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120.models;

import com.aliyun.tea.*;

public class ActiveMboxDeviceResponseBody extends TeaModel {
    // totalCount
    @NameInMap("TotalCount")
    public Long totalCount;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // data
    @NameInMap("Data")
    public String data;

    // errorCode
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static ActiveMboxDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveMboxDeviceResponseBody self = new ActiveMboxDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveMboxDeviceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ActiveMboxDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveMboxDeviceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ActiveMboxDeviceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ActiveMboxDeviceResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ActiveMboxDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
