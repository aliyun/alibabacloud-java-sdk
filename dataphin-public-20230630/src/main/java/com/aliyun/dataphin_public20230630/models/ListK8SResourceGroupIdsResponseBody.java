// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListK8SResourceGroupIdsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of custom Kubernetes resource groups.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListK8SResourceGroupIdsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend response error.</p>
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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListK8SResourceGroupIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8SResourceGroupIdsResponseBody self = new ListK8SResourceGroupIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8SResourceGroupIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListK8SResourceGroupIdsResponseBody setData(java.util.List<ListK8SResourceGroupIdsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListK8SResourceGroupIdsResponseBodyData> getData() {
        return this.data;
    }

    public ListK8SResourceGroupIdsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListK8SResourceGroupIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListK8SResourceGroupIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListK8SResourceGroupIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListK8SResourceGroupIdsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the custom Kubernetes resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>1052061</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the custom Kubernetes resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated to real-time R&amp;D</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListK8SResourceGroupIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListK8SResourceGroupIdsResponseBodyData self = new ListK8SResourceGroupIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListK8SResourceGroupIdsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListK8SResourceGroupIdsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListK8SResourceGroupIdsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
