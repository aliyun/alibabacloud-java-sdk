// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CreateBatchTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateBatchTasksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateBatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTasksResponseBody self = new CreateBatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchTasksResponseBody setData(CreateBatchTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateBatchTasksResponseBodyData getData() {
        return this.data;
    }

    public CreateBatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBatchTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBatchTasksResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public String status;

        public static CreateBatchTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTasksResponseBodyData self = new CreateBatchTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateBatchTasksResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateBatchTasksResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
