// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListModelServicesResponseBody extends TeaModel {
    @NameInMap("ModelServices")
    public java.util.List<ListModelServicesResponseBodyModelServices> modelServices;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListModelServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelServicesResponseBody self = new ListModelServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelServicesResponseBody setModelServices(java.util.List<ListModelServicesResponseBodyModelServices> modelServices) {
        this.modelServices = modelServices;
        return this;
    }
    public java.util.List<ListModelServicesResponseBodyModelServices> getModelServices() {
        return this.modelServices;
    }

    public ListModelServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelServicesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListModelServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelServicesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListModelServicesResponseBodyModelServices extends TeaModel {
        @NameInMap("AiNodes")
        public java.util.List<String> aiNodes;

        /**
         * <strong>example:</strong>
         * <p>mI3F7B18vgfqJjUtWmgITw==</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>2024-09-28T02:18:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>sambert-zhiying-v1</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelParams")
        public java.util.Map<String, String> modelParams;

        /**
         * <strong>example:</strong>
         * <p>mx-xxxxxxxxx</p>
         */
        @NameInMap("ModelServiceId")
        public String modelServiceId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ms-xxxxxxx.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx.xxxx.rds.aliyuncs.com</a></p>
         */
        @NameInMap("PrivateConnUrl")
        public String privateConnUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com</a></p>
         */
        @NameInMap("PublicConnUrl")
        public String publicConnUrl;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListModelServicesResponseBodyModelServices build(java.util.Map<String, ?> map) throws Exception {
            ListModelServicesResponseBodyModelServices self = new ListModelServicesResponseBodyModelServices();
            return TeaModel.build(map, self);
        }

        public ListModelServicesResponseBodyModelServices setAiNodes(java.util.List<String> aiNodes) {
            this.aiNodes = aiNodes;
            return this;
        }
        public java.util.List<String> getAiNodes() {
            return this.aiNodes;
        }

        public ListModelServicesResponseBodyModelServices setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListModelServicesResponseBodyModelServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModelServicesResponseBodyModelServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelServicesResponseBodyModelServices setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListModelServicesResponseBodyModelServices setModelParams(java.util.Map<String, String> modelParams) {
            this.modelParams = modelParams;
            return this;
        }
        public java.util.Map<String, String> getModelParams() {
            return this.modelParams;
        }

        public ListModelServicesResponseBodyModelServices setModelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        public ListModelServicesResponseBodyModelServices setPrivateConnUrl(String privateConnUrl) {
            this.privateConnUrl = privateConnUrl;
            return this;
        }
        public String getPrivateConnUrl() {
            return this.privateConnUrl;
        }

        public ListModelServicesResponseBodyModelServices setPublicConnUrl(String publicConnUrl) {
            this.publicConnUrl = publicConnUrl;
            return this;
        }
        public String getPublicConnUrl() {
            return this.publicConnUrl;
        }

        public ListModelServicesResponseBodyModelServices setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public ListModelServicesResponseBodyModelServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
