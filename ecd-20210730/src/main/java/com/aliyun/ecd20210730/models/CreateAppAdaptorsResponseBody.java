// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppAdaptorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<CreateAppAdaptorsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppAdaptorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAdaptorsResponseBody self = new CreateAppAdaptorsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppAdaptorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAppAdaptorsResponseBody setData(java.util.List<CreateAppAdaptorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateAppAdaptorsResponseBodyData> getData() {
        return this.data;
    }

    public CreateAppAdaptorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAppAdaptorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppAdaptorsResponseBodyData extends TeaModel {
        @NameInMap("LoadType")
        public String loadType;

        @NameInMap("Uid")
        public String uid;

        public static CreateAppAdaptorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAppAdaptorsResponseBodyData self = new CreateAppAdaptorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAppAdaptorsResponseBodyData setLoadType(String loadType) {
            this.loadType = loadType;
            return this;
        }
        public String getLoadType() {
            return this.loadType;
        }

        public CreateAppAdaptorsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
