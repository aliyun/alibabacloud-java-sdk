// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListUserKubeConfigStatesResponseBody extends TeaModel {
    @NameInMap("page")
    public ListUserKubeConfigStatesResponseBodyPage page;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
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
         * <strong>example:</strong>
         * <p>2026-11-30T07:41:50Z</p>
         */
        @NameInMap("cert_expire_time")
        public String certExpireTime;

        /**
         * <strong>example:</strong>
         * <p>Unissued</p>
         */
        @NameInMap("cert_state")
        public String certState;

        /**
         * <strong>example:</strong>
         * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>cluster-demo</p>
         */
        @NameInMap("cluster_name")
        public String clusterName;

        /**
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
