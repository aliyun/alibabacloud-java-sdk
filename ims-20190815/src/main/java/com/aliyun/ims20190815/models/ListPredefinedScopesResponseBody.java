// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPredefinedScopesResponseBody extends TeaModel {
    /**
     * <p>The information of application permissions.</p>
     */
    @NameInMap("PredefinedScopes")
    public ListPredefinedScopesResponseBodyPredefinedScopes predefinedScopes;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPredefinedScopesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedScopesResponseBody self = new ListPredefinedScopesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPredefinedScopesResponseBody setPredefinedScopes(ListPredefinedScopesResponseBodyPredefinedScopes predefinedScopes) {
        this.predefinedScopes = predefinedScopes;
        return this;
    }
    public ListPredefinedScopesResponseBodyPredefinedScopes getPredefinedScopes() {
        return this.predefinedScopes;
    }

    public ListPredefinedScopesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope extends TeaModel {
        /**
         * <p>The description of the permission scope.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the scope.</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope self = new ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope();
            return TeaModel.build(map, self);
        }

        public ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListPredefinedScopesResponseBodyPredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        public java.util.List<ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope> predefinedScope;

        public static ListPredefinedScopesResponseBodyPredefinedScopes build(java.util.Map<String, ?> map) throws Exception {
            ListPredefinedScopesResponseBodyPredefinedScopes self = new ListPredefinedScopesResponseBodyPredefinedScopes();
            return TeaModel.build(map, self);
        }

        public ListPredefinedScopesResponseBodyPredefinedScopes setPredefinedScope(java.util.List<ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope> predefinedScope) {
            this.predefinedScope = predefinedScope;
            return this;
        }
        public java.util.List<ListPredefinedScopesResponseBodyPredefinedScopesPredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

    }

}
