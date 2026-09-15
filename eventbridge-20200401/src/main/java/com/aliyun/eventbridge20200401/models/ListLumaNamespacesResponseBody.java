// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaNamespacesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. A specific error code is returned upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of namespaces bound to the Agent. All results are returned at once without pagination.</p>
     */
    @NameInMap("Data")
    public ListLumaNamespacesResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success when the call succeeds, or a specific error description when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaNamespacesResponseBody self = new ListLumaNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaNamespacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaNamespacesResponseBody setData(ListLumaNamespacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaNamespacesResponseBodyData getData() {
        return this.data;
    }

    public ListLumaNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaNamespacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaNamespacesResponseBodyData extends TeaModel {
        /**
         * <p>The list of namespaces bound to the Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;my_namespace&quot;}]</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<Namespace> namespaces;

        public static ListLumaNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaNamespacesResponseBodyData self = new ListLumaNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaNamespacesResponseBodyData setNamespaces(java.util.List<Namespace> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<Namespace> getNamespaces() {
            return this.namespaces;
        }

    }

}
