// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingListResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimDrawingListResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimDrawingListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingListResponseBody self = new GetBimDrawingListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingListResponseBody setDatas(GetBimDrawingListResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimDrawingListResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimDrawingListResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimDrawingListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimDrawingListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimDrawingListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimDrawingListResponseBodyDatasArchitecture extends TeaModel {
        @NameInMap("FileId")
        public Long fileId;

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

        public static GetBimDrawingListResponseBodyDatasArchitecture build(java.util.Map<String, ?> map) throws Exception {
            GetBimDrawingListResponseBodyDatasArchitecture self = new GetBimDrawingListResponseBodyDatasArchitecture();
            return TeaModel.build(map, self);
        }

        public GetBimDrawingListResponseBodyDatasArchitecture setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetBimDrawingListResponseBodyDatasArchitecture setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimDrawingListResponseBodyDatasArchitecture setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetBimDrawingListResponseBodyDatasArchitecture setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBimDrawingListResponseBodyDatasArchitecture setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBimDrawingListResponseBodyDatasArchitecture setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetBimDrawingListResponseBodyDatasArchitecture setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class GetBimDrawingListResponseBodyDatasStructure extends TeaModel {
        @NameInMap("FileId")
        public Long fileId;

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

        public static GetBimDrawingListResponseBodyDatasStructure build(java.util.Map<String, ?> map) throws Exception {
            GetBimDrawingListResponseBodyDatasStructure self = new GetBimDrawingListResponseBodyDatasStructure();
            return TeaModel.build(map, self);
        }

        public GetBimDrawingListResponseBodyDatasStructure setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetBimDrawingListResponseBodyDatasStructure setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimDrawingListResponseBodyDatasStructure setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetBimDrawingListResponseBodyDatasStructure setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBimDrawingListResponseBodyDatasStructure setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBimDrawingListResponseBodyDatasStructure setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetBimDrawingListResponseBodyDatasStructure setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class GetBimDrawingListResponseBodyDatas extends TeaModel {
        @NameInMap("Architecture")
        public java.util.List<GetBimDrawingListResponseBodyDatasArchitecture> architecture;

        @NameInMap("Structure")
        public java.util.List<GetBimDrawingListResponseBodyDatasStructure> structure;

        public static GetBimDrawingListResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimDrawingListResponseBodyDatas self = new GetBimDrawingListResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimDrawingListResponseBodyDatas setArchitecture(java.util.List<GetBimDrawingListResponseBodyDatasArchitecture> architecture) {
            this.architecture = architecture;
            return this;
        }
        public java.util.List<GetBimDrawingListResponseBodyDatasArchitecture> getArchitecture() {
            return this.architecture;
        }

        public GetBimDrawingListResponseBodyDatas setStructure(java.util.List<GetBimDrawingListResponseBodyDatasStructure> structure) {
            this.structure = structure;
            return this;
        }
        public java.util.List<GetBimDrawingListResponseBodyDatasStructure> getStructure() {
            return this.structure;
        }

    }

}
