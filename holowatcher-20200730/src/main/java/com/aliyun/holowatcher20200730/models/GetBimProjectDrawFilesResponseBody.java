// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectDrawFilesResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<GetBimProjectDrawFilesResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimProjectDrawFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectDrawFilesResponseBody self = new GetBimProjectDrawFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimProjectDrawFilesResponseBody setDatas(java.util.List<GetBimProjectDrawFilesResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetBimProjectDrawFilesResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetBimProjectDrawFilesResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimProjectDrawFilesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimProjectDrawFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimProjectDrawFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimProjectDrawFilesResponseBodyDatas extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("TaskId")
        public Long taskId;

        public static GetBimProjectDrawFilesResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectDrawFilesResponseBodyDatas self = new GetBimProjectDrawFilesResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimProjectDrawFilesResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimProjectDrawFilesResponseBodyDatas setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetBimProjectDrawFilesResponseBodyDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBimProjectDrawFilesResponseBodyDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBimProjectDrawFilesResponseBodyDatas setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetBimProjectDrawFilesResponseBodyDatas setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
