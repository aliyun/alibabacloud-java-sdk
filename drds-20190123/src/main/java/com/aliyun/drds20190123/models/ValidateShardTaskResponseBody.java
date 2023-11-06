// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ValidateShardTaskResponseBody extends TeaModel {
    /**
     * <p>Indicates the check results.</p>
     */
    @NameInMap("List")
    public java.util.List<ValidateShardTaskResponseBodyList> list;

    /**
     * <p>Indicates the ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>Indicates the name of a check item.</p>
         */
        @NameInMap("Item")
        public String item;

        /**
         * <p>Indicates the result of the check item. Valid values:</p>
         * <br>
         * <p>*   **0**: indicates the task is valid.</p>
         * <p>*   **1**: indicates the task is invalid.</p>
         */
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
