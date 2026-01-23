// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardRelationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteStandardRelationsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteStandardRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardRelationsResponseBody self = new DeleteStandardRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStandardRelationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteStandardRelationsResponseBody setData(DeleteStandardRelationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteStandardRelationsResponseBodyData getData() {
        return this.data;
    }

    public DeleteStandardRelationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteStandardRelationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteStandardRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStandardRelationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteStandardRelationsResponseBodyData extends TeaModel {
        @NameInMap("NotExistStandardIdList")
        public java.util.List<Long> notExistStandardIdList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        public static DeleteStandardRelationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteStandardRelationsResponseBodyData self = new DeleteStandardRelationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteStandardRelationsResponseBodyData setNotExistStandardIdList(java.util.List<Long> notExistStandardIdList) {
            this.notExistStandardIdList = notExistStandardIdList;
            return this;
        }
        public java.util.List<Long> getNotExistStandardIdList() {
            return this.notExistStandardIdList;
        }

        public DeleteStandardRelationsResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
