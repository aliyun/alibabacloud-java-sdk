// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CreateDumpMetaResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDumpMetaResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDumpMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDumpMetaResponseBody self = new CreateDumpMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDumpMetaResponseBody setData(CreateDumpMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDumpMetaResponseBodyData getData() {
        return this.data;
    }

    public CreateDumpMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDumpMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDumpMetaResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public String status;

        public static CreateDumpMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDumpMetaResponseBodyData self = new CreateDumpMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDumpMetaResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateDumpMetaResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
