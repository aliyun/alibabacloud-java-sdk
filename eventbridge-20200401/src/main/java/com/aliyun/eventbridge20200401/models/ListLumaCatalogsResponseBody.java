// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaCatalogsResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. A specific error code is returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of data catalogs bound to the Agent. All results are returned at once without pagination.</p>
     */
    @NameInMap("Data")
    public ListLumaCatalogsResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success when the call succeeds, or a specific error description when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket submission.</p>
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

    public static ListLumaCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaCatalogsResponseBody self = new ListLumaCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaCatalogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaCatalogsResponseBody setData(ListLumaCatalogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaCatalogsResponseBodyData getData() {
        return this.data;
    }

    public ListLumaCatalogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaCatalogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaCatalogsResponseBodyData extends TeaModel {
        /**
         * <p>The list of data catalogs bound to the Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;my_catalog&quot;}]</p>
         */
        @NameInMap("Catalogs")
        public java.util.List<Catalog> catalogs;

        public static ListLumaCatalogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaCatalogsResponseBodyData self = new ListLumaCatalogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaCatalogsResponseBodyData setCatalogs(java.util.List<Catalog> catalogs) {
            this.catalogs = catalogs;
            return this;
        }
        public java.util.List<Catalog> getCatalogs() {
            return this.catalogs;
        }

    }

}
