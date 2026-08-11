// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelPermissionsRequest extends TeaModel {
    /**
     * <p>The authorization query dimension. Valid values:</p>
     * <ul>
     * <li><strong>AUTHORIZED</strong>: models that have been authorized for the specified modelAction. Use this value together with modelAction.</li>
     * <li><strong>AUTHORIZABLE</strong>: full authorizable catalog.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTHORIZABLE</p>
     */
    @NameInMap("authorizationScope")
    public String authorizationScope;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("filter")
    public ListModelPermissionsRequestFilter filter;

    /**
     * <p>The maximum number of entries to return per page. Default value: 20. If the upper limit is exceeded, the error code InvalidParameter.maxResults is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The authorization action dimension. Valid values:</p>
     * <ul>
     * <li><strong>INFERENCE</strong>: model inference authorization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INFERENCE</p>
     */
    @NameInMap("modelAction")
    public String modelAction;

    /**
     * <p>The pagination token (offset) for the next page. Do not pass this parameter for the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The workspace ID. This parameter is required and cannot be empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-32klhjk2312334jkh</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListModelPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelPermissionsRequest self = new ListModelPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelPermissionsRequest setAuthorizationScope(String authorizationScope) {
        this.authorizationScope = authorizationScope;
        return this;
    }
    public String getAuthorizationScope() {
        return this.authorizationScope;
    }

    public ListModelPermissionsRequest setFilter(ListModelPermissionsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public ListModelPermissionsRequestFilter getFilter() {
        return this.filter;
    }

    public ListModelPermissionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelPermissionsRequest setModelAction(String modelAction) {
        this.modelAction = modelAction;
        return this;
    }
    public String getModelAction() {
        return this.modelAction;
    }

    public ListModelPermissionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelPermissionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListModelPermissionsRequestFilter extends TeaModel {
        /**
         * <p>The exact match for a single model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The fuzzy match for the model name.</p>
         * 
         * <strong>example:</strong>
         * <p>OVERLAY</p>
         */
        @NameInMap("name")
        public String name;

        public static ListModelPermissionsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListModelPermissionsRequestFilter self = new ListModelPermissionsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListModelPermissionsRequestFilter setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListModelPermissionsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
