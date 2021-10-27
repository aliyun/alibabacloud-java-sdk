// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ValidateShardTaskResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ValidateShardTaskResponseBodyList> list;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ValidateShardTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateShardTaskResponseBody self = new ValidateShardTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateShardTaskResponseBody setList(java.util.List<ValidateShardTaskResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ValidateShardTaskResponseBodyList> getList() {
        return this.list;
    }

    public ValidateShardTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateShardTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ValidateShardTaskResponseBodyList extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("Result")
        public Integer result;

        public static ValidateShardTaskResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ValidateShardTaskResponseBodyList self = new ValidateShardTaskResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ValidateShardTaskResponseBodyList setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ValidateShardTaskResponseBodyList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

    }

}
