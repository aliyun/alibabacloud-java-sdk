// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListTagValueTrendResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PidTagTrendList")
    @Validation(required = true)
    public java.util.List<ListTagValueTrendResponsePidTagTrendList> pidTagTrendList;

    public static ListTagValueTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagValueTrendResponse self = new ListTagValueTrendResponse();
        return TeaModel.build(map, self);
    }

    public ListTagValueTrendResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagValueTrendResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagValueTrendResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagValueTrendResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTagValueTrendResponse setPidTagTrendList(java.util.List<ListTagValueTrendResponsePidTagTrendList> pidTagTrendList) {
        this.pidTagTrendList = pidTagTrendList;
        return this;
    }
    public java.util.List<ListTagValueTrendResponsePidTagTrendList> getPidTagTrendList() {
        return this.pidTagTrendList;
    }

    public static class ListTagValueTrendResponsePidTagTrendListPidTagValueList extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListTagValueTrendResponsePidTagTrendListPidTagValueList build(java.util.Map<String, ?> map) throws Exception {
            ListTagValueTrendResponsePidTagTrendListPidTagValueList self = new ListTagValueTrendResponsePidTagTrendListPidTagValueList();
            return TeaModel.build(map, self);
        }

        public ListTagValueTrendResponsePidTagTrendListPidTagValueList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public ListTagValueTrendResponsePidTagTrendListPidTagValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTagValueTrendResponsePidTagTrendList extends TeaModel {
        @NameInMap("PidTagName")
        @Validation(required = true)
        public String pidTagName;

        @NameInMap("PidTagValueList")
        @Validation(required = true)
        public java.util.List<ListTagValueTrendResponsePidTagTrendListPidTagValueList> pidTagValueList;

        public static ListTagValueTrendResponsePidTagTrendList build(java.util.Map<String, ?> map) throws Exception {
            ListTagValueTrendResponsePidTagTrendList self = new ListTagValueTrendResponsePidTagTrendList();
            return TeaModel.build(map, self);
        }

        public ListTagValueTrendResponsePidTagTrendList setPidTagName(String pidTagName) {
            this.pidTagName = pidTagName;
            return this;
        }
        public String getPidTagName() {
            return this.pidTagName;
        }

        public ListTagValueTrendResponsePidTagTrendList setPidTagValueList(java.util.List<ListTagValueTrendResponsePidTagTrendListPidTagValueList> pidTagValueList) {
            this.pidTagValueList = pidTagValueList;
            return this;
        }
        public java.util.List<ListTagValueTrendResponsePidTagTrendListPidTagValueList> getPidTagValueList() {
            return this.pidTagValueList;
        }

    }

}
