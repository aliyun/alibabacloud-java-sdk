// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CloneConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CloneConfigurationResponseBodyResult result;

    public static CloneConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneConfigurationResponseBody self = new CloneConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloneConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloneConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloneConfigurationResponseBody setResult(CloneConfigurationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CloneConfigurationResponseBodyResult getResult() {
        return this.result;
    }

    public static class CloneConfigurationResponseBodyResultSuccessItems extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Group")
        public String group;

        public static CloneConfigurationResponseBodyResultSuccessItems build(java.util.Map<String, ?> map) throws Exception {
            CloneConfigurationResponseBodyResultSuccessItems self = new CloneConfigurationResponseBodyResultSuccessItems();
            return TeaModel.build(map, self);
        }

        public CloneConfigurationResponseBodyResultSuccessItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CloneConfigurationResponseBodyResultSuccessItems setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class CloneConfigurationResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("SuccessItems")
        public java.util.List<CloneConfigurationResponseBodyResultSuccessItems> successItems;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static CloneConfigurationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CloneConfigurationResponseBodyResult self = new CloneConfigurationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CloneConfigurationResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CloneConfigurationResponseBodyResult setSuccessItems(java.util.List<CloneConfigurationResponseBodyResultSuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }
        public java.util.List<CloneConfigurationResponseBodyResultSuccessItems> getSuccessItems() {
            return this.successItems;
        }

        public CloneConfigurationResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
