// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class AsyncScanAppMPCDResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static AsyncScanAppMPCDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsyncScanAppMPCDResponseBody self = new AsyncScanAppMPCDResponseBody();
        return TeaModel.build(map, self);
    }

    public AsyncScanAppMPCDResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AsyncScanAppMPCDResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AsyncScanAppMPCDResponseBody setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public AsyncScanAppMPCDResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsyncScanAppMPCDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
