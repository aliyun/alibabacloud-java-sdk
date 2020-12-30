// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotPostImeiResponseBody extends TeaModel {
    @NameInMap("IotPostImei")
    public DoIotPostImeiResponseBodyIotPostImei iotPostImei;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DoIotPostImeiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoIotPostImeiResponseBody self = new DoIotPostImeiResponseBody();
        return TeaModel.build(map, self);
    }

    public DoIotPostImeiResponseBody setIotPostImei(DoIotPostImeiResponseBodyIotPostImei iotPostImei) {
        this.iotPostImei = iotPostImei;
        return this;
    }
    public DoIotPostImeiResponseBodyIotPostImei getIotPostImei() {
        return this.iotPostImei;
    }

    public DoIotPostImeiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoIotPostImeiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoIotPostImeiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DoIotPostImeiResponseBodyIotPostImei extends TeaModel {
        @NameInMap("IsPostSuccess")
        public Boolean isPostSuccess;

        public static DoIotPostImeiResponseBodyIotPostImei build(java.util.Map<String, ?> map) throws Exception {
            DoIotPostImeiResponseBodyIotPostImei self = new DoIotPostImeiResponseBodyIotPostImei();
            return TeaModel.build(map, self);
        }

        public DoIotPostImeiResponseBodyIotPostImei setIsPostSuccess(Boolean isPostSuccess) {
            this.isPostSuccess = isPostSuccess;
            return this;
        }
        public Boolean getIsPostSuccess() {
            return this.isPostSuccess;
        }

    }

}
