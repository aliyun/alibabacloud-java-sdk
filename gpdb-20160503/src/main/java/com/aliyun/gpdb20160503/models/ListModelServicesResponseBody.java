// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListModelServicesResponseBody extends TeaModel {
    /**
     * <p>Model services.</p>
     */
    @NameInMap("ModelServices")
    public java.util.List<ListModelServicesResponseBodyModelServices> modelServices;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
        /**
         * <p>A list of AI nodes for model deployment.</p>
         */
        @NameInMap("AiNodes")
        public java.util.List<String> aiNodes;

        /**
         * <p>The API key.</p>
         * 
         * <strong>example:</strong>
         * <p>mI3F7B18vgfqJjUtWmgITw==</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-28T02:18:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>sambert-zhiying-v1</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>Model service parameters (not available).</p>
         */
        @NameInMap("ModelParams")
        public java.util.Map<String, String> modelParams;

        /**
         * <p>Model service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mx-xxxxxxxxx</p>
         */
        @NameInMap("ModelServiceId")
        public String modelServiceId;

        /**
         * <p>Private Endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ms-xxxxxxx.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx.xxxx.rds.aliyuncs.com</a></p>
         */
        @NameInMap("PrivateConnUrl")
        public String privateConnUrl;

        /**
         * <p>Public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com</a></p>
         */
        @NameInMap("PublicConnUrl")
        public String publicConnUrl;

        /**
         * <p>The IP addresses listed in the whitelist. Up to 1,000 IP addresses are contained in a whitelist and separated by commas (,). The IP addresses must use one of the following formats:</p>
         * <ul>
         * <li>0.0.0.0/0</li>
         * <li>10.23.12.24(IP)</li>
         * <li>10.23.12.24/24 (This is a CIDR block. The value<code>/24</code>indicates the network prefix length, which must be an integer and in the range of <code>[1,32]</code>.)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The status of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
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
