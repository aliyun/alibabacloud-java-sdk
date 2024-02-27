// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListUserDrawRecordByPkResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListUserDrawRecordByPkResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListUserDrawRecordByPkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDrawRecordByPkResponseBody self = new ListUserDrawRecordByPkResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDrawRecordByPkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserDrawRecordByPkResponseBody setData(java.util.List<ListUserDrawRecordByPkResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserDrawRecordByPkResponseBodyData> getData() {
        return this.data;
    }

    public ListUserDrawRecordByPkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserDrawRecordByPkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDrawRecordByPkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserDrawRecordByPkResponseBodyData extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

        @NameInMap("drawGroup")
        public String drawGroup;

        @NameInMap("drawPoolName")
        public String drawPoolName;

        @NameInMap("drawResult")
        public String drawResult;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("taskGroupId")
        public String taskGroupId;

        @NameInMap("uccId")
        public String uccId;

        public static ListUserDrawRecordByPkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserDrawRecordByPkResponseBodyData self = new ListUserDrawRecordByPkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserDrawRecordByPkResponseBodyData setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public ListUserDrawRecordByPkResponseBodyData setDrawGroup(String drawGroup) {
            this.drawGroup = drawGroup;
            return this;
        }
        public String getDrawGroup() {
            return this.drawGroup;
        }

        public ListUserDrawRecordByPkResponseBodyData setDrawPoolName(String drawPoolName) {
            this.drawPoolName = drawPoolName;
            return this;
        }
        public String getDrawPoolName() {
            return this.drawPoolName;
        }

        public ListUserDrawRecordByPkResponseBodyData setDrawResult(String drawResult) {
            this.drawResult = drawResult;
            return this;
        }
        public String getDrawResult() {
            return this.drawResult;
        }

        public ListUserDrawRecordByPkResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserDrawRecordByPkResponseBodyData setTaskGroupId(String taskGroupId) {
            this.taskGroupId = taskGroupId;
            return this;
        }
        public String getTaskGroupId() {
            return this.taskGroupId;
        }

        public ListUserDrawRecordByPkResponseBodyData setUccId(String uccId) {
            this.uccId = uccId;
            return this;
        }
        public String getUccId() {
            return this.uccId;
        }

    }

}
