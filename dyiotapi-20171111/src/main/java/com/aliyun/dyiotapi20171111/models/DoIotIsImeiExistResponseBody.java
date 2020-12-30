// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotIsImeiExistResponseBody extends TeaModel {
    @NameInMap("IotImeiExist")
    public DoIotIsImeiExistResponseBodyIotImeiExist iotImeiExist;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DoIotIsImeiExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoIotIsImeiExistResponseBody self = new DoIotIsImeiExistResponseBody();
        return TeaModel.build(map, self);
    }

    public DoIotIsImeiExistResponseBody setIotImeiExist(DoIotIsImeiExistResponseBodyIotImeiExist iotImeiExist) {
        this.iotImeiExist = iotImeiExist;
        return this;
    }
    public DoIotIsImeiExistResponseBodyIotImeiExist getIotImeiExist() {
        return this.iotImeiExist;
    }

    public DoIotIsImeiExistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoIotIsImeiExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoIotIsImeiExistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DoIotIsImeiExistResponseBodyIotImeiExist extends TeaModel {
        @NameInMap("IsImeiExist")
        public Boolean isImeiExist;

        public static DoIotIsImeiExistResponseBodyIotImeiExist build(java.util.Map<String, ?> map) throws Exception {
            DoIotIsImeiExistResponseBodyIotImeiExist self = new DoIotIsImeiExistResponseBodyIotImeiExist();
            return TeaModel.build(map, self);
        }

        public DoIotIsImeiExistResponseBodyIotImeiExist setIsImeiExist(Boolean isImeiExist) {
            this.isImeiExist = isImeiExist;
            return this;
        }
        public Boolean getIsImeiExist() {
            return this.isImeiExist;
        }

    }

}
