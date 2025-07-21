// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowNodePrototypeV2ResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>91</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListFlowNodePrototypeV2ResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("PublicExtend")
        public String publicExtend;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
