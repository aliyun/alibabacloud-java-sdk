// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPredefinedScopesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PredefinedScopes")
    @Validation(required = true)
    public ListPredefinedScopesResponsePredefinedScopes predefinedScopes;

    public static ListPredefinedScopesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedScopesResponse self = new ListPredefinedScopesResponse();
        return TeaModel.build(map, self);
    }

    public ListPredefinedScopesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPredefinedScopesResponse setPredefinedScopes(ListPredefinedScopesResponsePredefinedScopes predefinedScopes) {
        this.predefinedScopes = predefinedScopes;
        return this;
    }
    public ListPredefinedScopesResponsePredefinedScopes getPredefinedScopes() {
        return this.predefinedScopes;
    }

    public static class ListPredefinedScopesResponsePredefinedScopesPredefinedScope extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static ListPredefinedScopesResponsePredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedScopesResponsePredefinedScopesPredefinedScope self = new ListPredefinedScopesResponsePredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ListPredefinedScopesResponsePredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPredefinedScopesResponsePredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListPredefinedScopesResponsePredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        @Validation(required = true)
        public java.util.List<ListPredefinedScopesResponsePredefinedScopesPredefinedScope> predefinedScope;

        public static ListPredefinedScopesResponsePredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedScopesResponsePredefinedScopes self = new ListPredefinedScopesResponsePredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ListPredefinedScopesResponsePredefinedScopes setPredefinedScope(java.util.List<ListPredefinedScopesResponsePredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ListPredefinedScopesResponsePredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

}
