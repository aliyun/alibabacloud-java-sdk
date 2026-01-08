// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowNodeGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListFlowNodeGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
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
