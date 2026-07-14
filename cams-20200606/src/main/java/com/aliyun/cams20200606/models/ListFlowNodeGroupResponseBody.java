// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowNodeGroupResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This field is returned only when RAM verification fails.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public ListFlowNodeGroupResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
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

    public static ListFlowNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeGroupResponseBody self = new ListFlowNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListFlowNodeGroupResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListFlowNodeGroupResponseBody setData(ListFlowNodeGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlowNodeGroupResponseBodyData getData() {
        return this.data;
    }

    public ListFlowNodeGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowNodeGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlowNodeGroupResponseBodyDataModel extends TeaModel {
        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The public extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PublicExtend")
        public String publicExtend;

        public static ListFlowNodeGroupResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeGroupResponseBodyDataModel self = new ListFlowNodeGroupResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeGroupResponseBodyDataModel setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListFlowNodeGroupResponseBodyDataModel setPublicExtend(String publicExtend) {
            this.publicExtend = publicExtend;
            return this;
        }
        public String getPublicExtend() {
            return this.publicExtend;
        }

    }

    public static class ListFlowNodeGroupResponseBodyData extends TeaModel {
        /**
         * <p>The request result data.</p>
         */
        @NameInMap("Model")
        public java.util.List<ListFlowNodeGroupResponseBodyDataModel> model;

        public static ListFlowNodeGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeGroupResponseBodyData self = new ListFlowNodeGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeGroupResponseBodyData setModel(java.util.List<ListFlowNodeGroupResponseBodyDataModel> model) {
            this.model = model;
            return this;
        }
        public java.util.List<ListFlowNodeGroupResponseBodyDataModel> getModel() {
            return this.model;
        }

    }

}
