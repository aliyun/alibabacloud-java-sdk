// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListUserKubeConfigStatesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("page")
    public ListUserKubeConfigStatesResponseBodyPage page;

    /**
     * <p>The status of the kubeconfig files.</p>
     */
    @NameInMap("states")
    public java.util.List<ListUserKubeConfigStatesResponseBodyStates> states;

    public static ListUserKubeConfigStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserKubeConfigStatesResponseBody self = new ListUserKubeConfigStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserKubeConfigStatesResponseBody setPage(ListUserKubeConfigStatesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListUserKubeConfigStatesResponseBodyPage getPage() {
        return this.page;
    }

    public ListUserKubeConfigStatesResponseBody setStates(java.util.List<ListUserKubeConfigStatesResponseBodyStates> states) {
        this.states = states;
        return this;
    }
    public java.util.List<ListUserKubeConfigStatesResponseBodyStates> getStates() {
        return this.states;
    }

    public static class ListUserKubeConfigStatesResponseBodyPage extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        public static ListUserKubeConfigStatesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListUserKubeConfigStatesResponseBodyPage self = new ListUserKubeConfigStatesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListUserKubeConfigStatesResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUserKubeConfigStatesResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUserKubeConfigStatesResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListUserKubeConfigStatesResponseBodyStates extends TeaModel {
        /**
         * <p>The expiration date of the certificate used in a kubeconfig file. Format: the UTC time in the RFC3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-30T07:41:50Z</p>
         */
        @NameInMap("cert_expire_time")
        public String certExpireTime;

        /**
         * <p>The current status of the certificate used in a kubeconfig file. Valid values:</p>
         * <ul>
         * <li>Expired: The certificate is expired.</li>
         * <li>Unexpired: The certificate is not expired.</li>
         * <li>Unissued: The certificate is not issued.</li>
         * <li>Unknown: The status of the certificate is unknown.</li>
         * <li>Removed: The certificate is removed. An issue record is found for the certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unissued</p>
         */
        @NameInMap("cert_state")
        public String certState;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, underscores (_), and hyphens (-). The name must start with a letter or number.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-demo</p>
         */
        @NameInMap("cluster_name")
        public String clusterName;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><code>initial</code>: The cluster is being created.</li>
         * <li><code>failed</code>: The cluster failed to be created.</li>
         * <li><code>running</code>: The cluster is running.</li>
         * <li><code>updating</code>: The cluster is being upgraded.</li>
         * <li><code>updating_failed</code>: The cluster failed to be updated.</li>
         * <li><code>scaling</code>: The cluster is being scaled.</li>
         * <li><code>stopped</code>: The cluster is stopped.</li>
         * <li><code>deleting</code>: The cluster is being deleted.</li>
         * <li><code>deleted</code>: The cluster is deleted.</li>
         * <li><code>delete_failed</code>: The cluster failed to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("cluster_state")
        public String clusterState;

        public static ListUserKubeConfigStatesResponseBodyStates build(java.util.Map<String, ?> map) throws Exception {
            ListUserKubeConfigStatesResponseBodyStates self = new ListUserKubeConfigStatesResponseBodyStates();
            return TeaModel.build(map, self);
        }

        public ListUserKubeConfigStatesResponseBodyStates setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public ListUserKubeConfigStatesResponseBodyStates setCertState(String certState) {
            this.certState = certState;
            return this;
        }
        public String getCertState() {
            return this.certState;
        }

        public ListUserKubeConfigStatesResponseBodyStates setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListUserKubeConfigStatesResponseBodyStates setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListUserKubeConfigStatesResponseBodyStates setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

    }

}
