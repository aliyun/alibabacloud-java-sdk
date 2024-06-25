// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CheckConfigurationCloneResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckConfigurationCloneResponseBodyResult result;

    public static CheckConfigurationCloneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigurationCloneResponseBody self = new CheckConfigurationCloneResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckConfigurationCloneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckConfigurationCloneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckConfigurationCloneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckConfigurationCloneResponseBody setResult(CheckConfigurationCloneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckConfigurationCloneResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckConfigurationCloneResponseBodyResultSuccessItems extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Group")
        public String group;

        public static CheckConfigurationCloneResponseBodyResultSuccessItems build(java.util.Map<String, ?> map) throws Exception {
            CheckConfigurationCloneResponseBodyResultSuccessItems self = new CheckConfigurationCloneResponseBodyResultSuccessItems();
            return TeaModel.build(map, self);
        }

        public CheckConfigurationCloneResponseBodyResultSuccessItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public CheckConfigurationCloneResponseBodyResultSuccessItems setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class CheckConfigurationCloneResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("SuccessItems")
        public java.util.List<CheckConfigurationCloneResponseBodyResultSuccessItems> successItems;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static CheckConfigurationCloneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckConfigurationCloneResponseBodyResult self = new CheckConfigurationCloneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckConfigurationCloneResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CheckConfigurationCloneResponseBodyResult setSuccessItems(java.util.List<CheckConfigurationCloneResponseBodyResultSuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }
        public java.util.List<CheckConfigurationCloneResponseBodyResultSuccessItems> getSuccessItems() {
            return this.successItems;
        }

        public CheckConfigurationCloneResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
