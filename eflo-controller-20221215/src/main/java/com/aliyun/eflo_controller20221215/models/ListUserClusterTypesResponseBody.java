// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListUserClusterTypesResponseBody extends TeaModel {
    @NameInMap("ClusterTypes")
    public java.util.List<ListUserClusterTypesResponseBodyClusterTypes> clusterTypes;

    /**
     * <strong>example:</strong>
     * <p>3a6b93229825ac667104463b56790c91</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserClusterTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserClusterTypesResponseBody self = new ListUserClusterTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserClusterTypesResponseBody setClusterTypes(java.util.List<ListUserClusterTypesResponseBodyClusterTypes> clusterTypes) {
        this.clusterTypes = clusterTypes;
        return this;
    }
    public java.util.List<ListUserClusterTypesResponseBodyClusterTypes> getClusterTypes() {
        return this.clusterTypes;
    }

    public ListUserClusterTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserClusterTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserClusterTypesResponseBodyClusterTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>AckEdgePro</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static ListUserClusterTypesResponseBodyClusterTypes build(java.util.Map<String, ?> map) throws Exception {
            ListUserClusterTypesResponseBodyClusterTypes self = new ListUserClusterTypesResponseBodyClusterTypes();
            return TeaModel.build(map, self);
        }

        public ListUserClusterTypesResponseBodyClusterTypes setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListUserClusterTypesResponseBodyClusterTypes setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
