// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210207.models;

import com.aliyun.tea.*;

public class MtlBuildApiResponseBody extends TeaModel {
    // hostIp
    @NameInMap("HostIp")
    public String hostIp;

    // message
    @NameInMap("Message")
    public String message;

    // data
    @NameInMap("Data")
    public Boolean data;

    // code
    @NameInMap("Code")
    public String code;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static MtlBuildApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MtlBuildApiResponseBody self = new MtlBuildApiResponseBody();
        return TeaModel.build(map, self);
    }

    public MtlBuildApiResponseBody setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public MtlBuildApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MtlBuildApiResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public MtlBuildApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MtlBuildApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
