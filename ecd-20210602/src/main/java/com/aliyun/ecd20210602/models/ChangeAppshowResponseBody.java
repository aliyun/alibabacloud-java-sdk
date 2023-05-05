// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ChangeAppshowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ChangeAppshowResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeAppshowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeAppshowResponseBody self = new ChangeAppshowResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeAppshowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeAppshowResponseBody setData(ChangeAppshowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeAppshowResponseBodyData getData() {
        return this.data;
    }

    public ChangeAppshowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeAppshowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeAppshowResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static ChangeAppshowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeAppshowResponseBodyData self = new ChangeAppshowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeAppshowResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
