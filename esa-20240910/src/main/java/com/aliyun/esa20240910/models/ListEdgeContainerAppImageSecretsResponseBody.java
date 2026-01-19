// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppImageSecretsResponseBody extends TeaModel {
    /**
     * <p>List of image secrets.</p>
     */
    @NameInMap("ImageSecretList")
    public java.util.List<ListEdgeContainerAppImageSecretsResponseBodyImageSecretList> imageSecretList;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3558df77-8a7a-4060-a900-2d7949403836</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEdgeContainerAppImageSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppImageSecretsResponseBody self = new ListEdgeContainerAppImageSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppImageSecretsResponseBody setImageSecretList(java.util.List<ListEdgeContainerAppImageSecretsResponseBodyImageSecretList> imageSecretList) {
        this.imageSecretList = imageSecretList;
        return this;
    }
    public java.util.List<ListEdgeContainerAppImageSecretsResponseBodyImageSecretList> getImageSecretList() {
        return this.imageSecretList;
    }

    public ListEdgeContainerAppImageSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEdgeContainerAppImageSecretsResponseBodyImageSecretList extends TeaModel {
        /**
         * <p>Name of the image secret.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-123****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Registry address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("Registry")
        public String registry;

        /**
         * <p>Username for the image repository</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListEdgeContainerAppImageSecretsResponseBodyImageSecretList build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeContainerAppImageSecretsResponseBodyImageSecretList self = new ListEdgeContainerAppImageSecretsResponseBodyImageSecretList();
            return TeaModel.build(map, self);
        }

        public ListEdgeContainerAppImageSecretsResponseBodyImageSecretList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeContainerAppImageSecretsResponseBodyImageSecretList setRegistry(String registry) {
            this.registry = registry;
            return this;
        }
        public String getRegistry() {
            return this.registry;
        }

        public ListEdgeContainerAppImageSecretsResponseBodyImageSecretList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
