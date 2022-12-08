// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeletePictureResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeletePictureResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeletePictureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePictureResponseBody self = new DeletePictureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePictureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeletePictureResponseBody setData(DeletePictureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeletePictureResponseBodyData getData() {
        return this.data;
    }

    public DeletePictureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeletePictureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePictureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeletePictureResponseBodyData extends TeaModel {
        @NameInMap("DeletedCount")
        public Integer deletedCount;

        public static DeletePictureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeletePictureResponseBodyData self = new DeletePictureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeletePictureResponseBodyData setDeletedCount(Integer deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }
        public Integer getDeletedCount() {
            return this.deletedCount;
        }

    }

}
