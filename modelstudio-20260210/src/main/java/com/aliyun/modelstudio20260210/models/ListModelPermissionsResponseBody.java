// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelPermissionsResponseBody extends TeaModel {
    /**
     * <p>The error code. This value is empty when the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of workspace permissions.</p>
     */
    @NameInMap("list")
    public java.util.List<ListModelPermissionsResponseBodyList> list;

    /**
     * <p>The maximum number of entries returned per request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36045E0A-551D-592D-B1BC-4C56596CE59E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListModelPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelPermissionsResponseBody self = new ListModelPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelPermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelPermissionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListModelPermissionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelPermissionsResponseBody setList(java.util.List<ListModelPermissionsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListModelPermissionsResponseBodyList> getList() {
        return this.list;
    }

    public ListModelPermissionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelPermissionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelPermissionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelPermissionsResponseBodyListPermissions extends TeaModel {
        /**
         * <p>The model deployment authorization. A value of true indicates that the model has been granted authorization. A value of false indicates that the model has not been granted authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deploy")
        public Boolean deploy;

        /**
         * <p>The model training authorization. A value of true indicates that the model has been granted training authorization. A value of false indicates that the model has not been granted authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("fineTune")
        public Boolean fineTune;

        /**
         * <p>Indicates whether the model has inference permission. A value of true indicates that the model is authorized. A value of false indicates that the model is not authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("inference")
        public Boolean inference;

        public static ListModelPermissionsResponseBodyListPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListModelPermissionsResponseBodyListPermissions self = new ListModelPermissionsResponseBodyListPermissions();
            return TeaModel.build(map, self);
        }

        public ListModelPermissionsResponseBodyListPermissions setDeploy(Boolean deploy) {
            this.deploy = deploy;
            return this;
        }
        public Boolean getDeploy() {
            return this.deploy;
        }

        public ListModelPermissionsResponseBodyListPermissions setFineTune(Boolean fineTune) {
            this.fineTune = fineTune;
            return this;
        }
        public Boolean getFineTune() {
            return this.fineTune;
        }

        public ListModelPermissionsResponseBodyListPermissions setInference(Boolean inference) {
            this.inference = inference;
            return this;
        }
        public Boolean getInference() {
            return this.inference;
        }

    }

    public static class ListModelPermissionsResponseBodyList extends TeaModel {
        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The authorization status.</p>
         */
        @NameInMap("permissions")
        public ListModelPermissionsResponseBodyListPermissions permissions;

        public static ListModelPermissionsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListModelPermissionsResponseBodyList self = new ListModelPermissionsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListModelPermissionsResponseBodyList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListModelPermissionsResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelPermissionsResponseBodyList setPermissions(ListModelPermissionsResponseBodyListPermissions permissions) {
            this.permissions = permissions;
            return this;
        }
        public ListModelPermissionsResponseBodyListPermissions getPermissions() {
            return this.permissions;
        }

    }

}
