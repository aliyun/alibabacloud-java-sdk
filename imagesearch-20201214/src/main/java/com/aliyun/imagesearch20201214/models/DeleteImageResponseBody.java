// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DeleteImageResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * <ul>
     * <li>A value of 0 indicates that the operation is successful.</li>
     * <li>Values other than 0 indicate errors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the deleted images.</p>
     */
    @NameInMap("Data")
    public DeleteImageResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0703956F-9BCC-48FA-99F7-96C0BF449C69</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageResponseBody self = new DeleteImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteImageResponseBody setData(DeleteImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteImageResponseBodyData getData() {
        return this.data;
    }

    public DeleteImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteImageResponseBodyData extends TeaModel {
        /**
         * <p>The name (PicName) of the deleted image.</p>
         * 
         * <strong>example:</strong>
         * <p>5555.jpg</p>
         */
        @NameInMap("PicNames")
        public java.util.List<String> picNames;

        public static DeleteImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteImageResponseBodyData self = new DeleteImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteImageResponseBodyData setPicNames(java.util.List<String> picNames) {
            this.picNames = picNames;
            return this;
        }
        public java.util.List<String> getPicNames() {
            return this.picNames;
        }

    }

}
