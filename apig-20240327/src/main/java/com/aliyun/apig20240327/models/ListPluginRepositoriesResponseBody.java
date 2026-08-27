// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginRepositoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListPluginRepositoriesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019FCA83-0416-588D-9763-2474980495F1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPluginRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginRepositoriesResponseBody self = new ListPluginRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginRepositoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPluginRepositoriesResponseBody setData(java.util.List<ListPluginRepositoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPluginRepositoriesResponseBodyData> getData() {
        return this.data;
    }

    public ListPluginRepositoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPluginRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPluginRepositoriesResponseBodyDataRepositories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("repositoryId")
        public String repositoryId;

        /**
         * <strong>example:</strong>
         * <p>my-custom-plugin</p>
         */
        @NameInMap("repositoryName")
        public String repositoryName;

        public static ListPluginRepositoriesResponseBodyDataRepositories build(java.util.Map<String, ?> map) throws Exception {
            ListPluginRepositoriesResponseBodyDataRepositories self = new ListPluginRepositoriesResponseBodyDataRepositories();
            return TeaModel.build(map, self);
        }

        public ListPluginRepositoriesResponseBodyDataRepositories setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }
        public String getRepositoryId() {
            return this.repositoryId;
        }

        public ListPluginRepositoriesResponseBodyDataRepositories setRepositoryName(String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        public String getRepositoryName() {
            return this.repositoryName;
        }

    }

    public static class ListPluginRepositoriesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>664f1e2xxxx</p>
         */
        @NameInMap("organizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>my-org</p>
         */
        @NameInMap("organizationName")
        public String organizationName;

        @NameInMap("repositories")
        public java.util.List<ListPluginRepositoriesResponseBodyDataRepositories> repositories;

        public static ListPluginRepositoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPluginRepositoriesResponseBodyData self = new ListPluginRepositoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPluginRepositoriesResponseBodyData setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListPluginRepositoriesResponseBodyData setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public ListPluginRepositoriesResponseBodyData setRepositories(java.util.List<ListPluginRepositoriesResponseBodyDataRepositories> repositories) {
            this.repositories = repositories;
            return this;
        }
        public java.util.List<ListPluginRepositoriesResponseBodyDataRepositories> getRepositories() {
            return this.repositories;
        }

    }

}
