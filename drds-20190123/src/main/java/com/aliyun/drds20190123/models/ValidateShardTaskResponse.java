// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ValidateShardTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("List")
    @Validation(required = true)
    public java.util.List<ValidateShardTaskResponseList> list;

    public static ValidateShardTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateShardTaskResponse self = new ValidateShardTaskResponse();
        return TeaModel.build(map, self);
    }

    public ValidateShardTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateShardTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ValidateShardTaskResponse setList(java.util.List<ValidateShardTaskResponseList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ValidateShardTaskResponseList> getList() {
        return this.list;
    }

    public static class ValidateShardTaskResponseList extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public String item;

        @NameInMap("Result")
        @Validation(required = true)
        public Integer result;

        public static ValidateShardTaskResponseList build(java.util.Map<String, ?> map) throws Exception {
            ValidateShardTaskResponseList self = new ValidateShardTaskResponseList();
            return TeaModel.build(map, self);
        }

        public ValidateShardTaskResponseList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ValidateShardTaskResponseList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

    }

}
