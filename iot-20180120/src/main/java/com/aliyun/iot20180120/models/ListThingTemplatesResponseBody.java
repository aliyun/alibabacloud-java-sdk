// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingTemplatesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of standard categories returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListThingTemplatesResponseBodyData> data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListThingTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListThingTemplatesResponseBody self = new ListThingTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListThingTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListThingTemplatesResponseBody setData(java.util.List<ListThingTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListThingTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListThingTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListThingTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListThingTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListThingTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The identifier of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>lighting</p>
         */
        @NameInMap("CategoryKey")
        public String categoryKey;

        /**
         * <p>The name of the category.</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        public static ListThingTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListThingTemplatesResponseBodyData self = new ListThingTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListThingTemplatesResponseBodyData setCategoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            return this;
        }
        public String getCategoryKey() {
            return this.categoryKey;
        }

        public ListThingTemplatesResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

}
