// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowNodePrototypeV2ResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The error code. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListFlowNodePrototypeV2ResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The operation was successful.</p>
     * </li>
     * <li><p>false: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFlowNodePrototypeV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodePrototypeV2ResponseBody self = new ListFlowNodePrototypeV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowNodePrototypeV2ResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListFlowNodePrototypeV2ResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListFlowNodePrototypeV2ResponseBody setData(ListFlowNodePrototypeV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlowNodePrototypeV2ResponseBodyData getData() {
        return this.data;
    }

    public ListFlowNodePrototypeV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowNodePrototypeV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowNodePrototypeV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlowNodePrototypeV2ResponseBodyDataModel extends TeaModel {
        /**
         * <p>The component prototype code.</p>
         * 
         * <strong>example:</strong>
         * <p>SendWhatsAppMessageNode</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The component group code.</p>
         * 
         * <strong>example:</strong>
         * <p>Core</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The public extension information. This is used by the frontend to display extended information of flow components. The value is a JSON string. The first parameter in the string represents the flow component title. The following section describes the other fields:</p>
         * <ul>
         * <li><p>en: the English information of the flow component.</p>
         * </li>
         * <li><p>zh: the Chinese information of the flow component.</p>
         * </li>
         * <li><p>name: the name of the flow component.</p>
         * </li>
         * <li><p>remark: the remarks of the flow component.</p>
         * </li>
         * <li><p>order: the display order of the flow component.</p>
         * </li>
         * <li><p>style: the style of the flow component.</p>
         * </li>
         * <li><p>svg: the icon URL of the flow component.</p>
         * </li>
         * <li><p>icon: a deprecated field.</p>
         * </li>
         * <li><p>bgcolor: the background color of the icon.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;i18n\&quot;: {\&quot;en\&quot;: {\&quot;name\&quot;: \&quot;Send a WhatsApp Message\&quot;, \&quot;remark\&quot;: \&quot;Send a message with the ability for the user to reply utilizing WhatsApp specific features.\&quot;}, \&quot;zh\&quot;: {\&quot;name\&quot;: \&quot;Send WhatsApp messages\&quot;, \&quot;remark\&quot;: \&quot;Send a message that allows users to reply using specific features of WhatsApp\&quot;}}, \&quot;order\&quot;: \&quot;9000\&quot;, \&quot;style\&quot;: {\&quot;svg\&quot;: \&quot;<a href="https://img.alicdn.com/***********************************%5C%5C">https://img.alicdn.com/***********************************\\</a>&quot;, \&quot;icon\&quot;: \&quot;<a href="https://img.alicdn.com/***********************************%5C%5C">https://img.alicdn.com/***********************************\\</a>&quot;, \&quot;bgcolor\&quot;: \&quot;blue\&quot;}}</p>
         */
        @NameInMap("PublicExtend")
        public String publicExtend;

        /**
         * <p>The component prototype status. Default value: NORMAL.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListFlowNodePrototypeV2ResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodePrototypeV2ResponseBodyDataModel self = new ListFlowNodePrototypeV2ResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public ListFlowNodePrototypeV2ResponseBodyDataModel setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListFlowNodePrototypeV2ResponseBodyDataModel setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public ListFlowNodePrototypeV2ResponseBodyDataModel setPublicExtend(String publicExtend) {
            this.publicExtend = publicExtend;
            return this;
        }
        public String getPublicExtend() {
            return this.publicExtend;
        }

        public ListFlowNodePrototypeV2ResponseBodyDataModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListFlowNodePrototypeV2ResponseBodyData extends TeaModel {
        /**
         * <p>The list of request result data.</p>
         */
        @NameInMap("Model")
        public java.util.List<ListFlowNodePrototypeV2ResponseBodyDataModel> model;

        public static ListFlowNodePrototypeV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodePrototypeV2ResponseBodyData self = new ListFlowNodePrototypeV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlowNodePrototypeV2ResponseBodyData setModel(java.util.List<ListFlowNodePrototypeV2ResponseBodyDataModel> model) {
            this.model = model;
            return this;
        }
        public java.util.List<ListFlowNodePrototypeV2ResponseBodyDataModel> getModel() {
            return this.model;
        }

    }

}
