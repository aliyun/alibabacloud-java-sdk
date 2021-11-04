// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMcuJobResponseBody extends TeaModel {
    @NameInMap("DeletedJobIds")
    public DeleteMcuJobResponseBodyDeletedJobIds deletedJobIds;

    @NameInMap("NonExistJobIds")
    public DeleteMcuJobResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMcuJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcuJobResponseBody self = new DeleteMcuJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcuJobResponseBody setDeletedJobIds(DeleteMcuJobResponseBodyDeletedJobIds deletedJobIds) {
        this.deletedJobIds = deletedJobIds;
        return this;
    }
    public DeleteMcuJobResponseBodyDeletedJobIds getDeletedJobIds() {
        return this.deletedJobIds;
    }

    public DeleteMcuJobResponseBody setNonExistJobIds(DeleteMcuJobResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public DeleteMcuJobResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public DeleteMcuJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteMcuJobResponseBodyDeletedJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static DeleteMcuJobResponseBodyDeletedJobIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcuJobResponseBodyDeletedJobIds self = new DeleteMcuJobResponseBodyDeletedJobIds();
            return TeaModel.build(map, self);
        }

        public DeleteMcuJobResponseBodyDeletedJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class DeleteMcuJobResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static DeleteMcuJobResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcuJobResponseBodyNonExistJobIds self = new DeleteMcuJobResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public DeleteMcuJobResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
