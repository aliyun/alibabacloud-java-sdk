// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityClassifyCatalogResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The deletion result details.</p>
     */
    @NameInMap("Data")
    public DeleteSecurityClassifyCatalogResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
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

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteSecurityClassifyCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityClassifyCatalogResponseBody self = new DeleteSecurityClassifyCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityClassifyCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecurityClassifyCatalogResponseBody setData(DeleteSecurityClassifyCatalogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSecurityClassifyCatalogResponseBodyData getData() {
        return this.data;
    }

    public DeleteSecurityClassifyCatalogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteSecurityClassifyCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecurityClassifyCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecurityClassifyCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSecurityClassifyCatalogResponseBodyData extends TeaModel {
        /**
         * <p>The list of full paths of child catalogs that were also deleted.</p>
         */
        @NameInMap("ChildCatalogFullPathList")
        public java.util.List<String> childCatalogFullPathList;

        /**
         * <p>The list of classification IDs that were also deleted.</p>
         */
        @NameInMap("ClassifyIdList")
        public java.util.List<Long> classifyIdList;

        /**
         * <p>Indicates whether the deletion was successful.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteSecurityClassifyCatalogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityClassifyCatalogResponseBodyData self = new DeleteSecurityClassifyCatalogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityClassifyCatalogResponseBodyData setChildCatalogFullPathList(java.util.List<String> childCatalogFullPathList) {
            this.childCatalogFullPathList = childCatalogFullPathList;
            return this;
        }
        public java.util.List<String> getChildCatalogFullPathList() {
            return this.childCatalogFullPathList;
        }

        public DeleteSecurityClassifyCatalogResponseBodyData setClassifyIdList(java.util.List<Long> classifyIdList) {
            this.classifyIdList = classifyIdList;
            return this;
        }
        public java.util.List<Long> getClassifyIdList() {
            return this.classifyIdList;
        }

        public DeleteSecurityClassifyCatalogResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
