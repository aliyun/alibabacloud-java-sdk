// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ListPushMsgResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ListPushMsgResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPushMsgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPushMsgResponseBody self = new ListPushMsgResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPushMsgResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPushMsgResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPushMsgResponseBody setModel(ListPushMsgResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ListPushMsgResponseBodyModel getModel() {
        return this.model;
    }

    public ListPushMsgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPushMsgResponseBodyModel extends TeaModel {
        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("CreatedDateStr")
        public String createdDateStr;

        @NameInMap("Id")
        public String id;

        @NameInMap("PushTime")
        public String pushTime;

        @NameInMap("PushTimeStr")
        public String pushTimeStr;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusStr")
        public String statusStr;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserNum")
        public Long userNum;

        public static ListPushMsgResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListPushMsgResponseBodyModel self = new ListPushMsgResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListPushMsgResponseBodyModel setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListPushMsgResponseBodyModel setCreatedDateStr(String createdDateStr) {
            this.createdDateStr = createdDateStr;
            return this;
        }
        public String getCreatedDateStr() {
            return this.createdDateStr;
        }

        public ListPushMsgResponseBodyModel setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPushMsgResponseBodyModel setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public ListPushMsgResponseBodyModel setPushTimeStr(String pushTimeStr) {
            this.pushTimeStr = pushTimeStr;
            return this;
        }
        public String getPushTimeStr() {
            return this.pushTimeStr;
        }

        public ListPushMsgResponseBodyModel setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListPushMsgResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPushMsgResponseBodyModel setStatusStr(String statusStr) {
            this.statusStr = statusStr;
            return this;
        }
        public String getStatusStr() {
            return this.statusStr;
        }

        public ListPushMsgResponseBodyModel setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListPushMsgResponseBodyModel setUserNum(Long userNum) {
            this.userNum = userNum;
            return this;
        }
        public Long getUserNum() {
            return this.userNum;
        }

    }

}
