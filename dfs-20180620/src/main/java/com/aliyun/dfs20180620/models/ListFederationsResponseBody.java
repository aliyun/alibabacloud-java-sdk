// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListFederationsResponseBody extends TeaModel {
    @NameInMap("Federations")
    public java.util.List<ListFederationsResponseBodyFederations> federations;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFederationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFederationsResponseBody self = new ListFederationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFederationsResponseBody setFederations(java.util.List<ListFederationsResponseBodyFederations> federations) {
        this.federations = federations;
        return this;
    }
    public java.util.List<ListFederationsResponseBodyFederations> getFederations() {
        return this.federations;
    }

    public ListFederationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFederationsResponseBodyFederations extends TeaModel {
        @NameInMap("FederationId")
        public String federationId;

        @NameInMap("FileSystemIds")
        public String fileSystemIds;

        public static ListFederationsResponseBodyFederations build(java.util.Map<String, ?> map) throws Exception {
            ListFederationsResponseBodyFederations self = new ListFederationsResponseBodyFederations();
            return TeaModel.build(map, self);
        }

        public ListFederationsResponseBodyFederations setFederationId(String federationId) {
            this.federationId = federationId;
            return this;
        }
        public String getFederationId() {
            return this.federationId;
        }

        public ListFederationsResponseBodyFederations setFileSystemIds(String fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public String getFileSystemIds() {
            return this.fileSystemIds;
        }

    }

}
