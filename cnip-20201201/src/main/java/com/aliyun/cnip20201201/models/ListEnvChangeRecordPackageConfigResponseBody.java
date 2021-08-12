// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordPackageConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    public static ListEnvChangeRecordPackageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordPackageConfigResponseBody self = new ListEnvChangeRecordPackageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordPackageConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListEnvChangeRecordPackageConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvChangeRecordPackageConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

}
