// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterKubeconfigStatesResponseBody extends TeaModel {
    @NameInMap("page")
    public ListClusterKubeconfigStatesResponseBodyPage page;

    @NameInMap("states")
    public java.util.List<ListClusterKubeconfigStatesResponseBodyStates> states;

    public static ListClusterKubeconfigStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterKubeconfigStatesResponseBody self = new ListClusterKubeconfigStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterKubeconfigStatesResponseBody setPage(ListClusterKubeconfigStatesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListClusterKubeconfigStatesResponseBodyPage getPage() {
        return this.page;
    }

    public ListClusterKubeconfigStatesResponseBody setStates(java.util.List<ListClusterKubeconfigStatesResponseBodyStates> states) {
        this.states = states;
        return this;
    }
    public java.util.List<ListClusterKubeconfigStatesResponseBodyStates> getStates() {
        return this.states;
    }

    public static class ListClusterKubeconfigStatesResponseBodyPage extends TeaModel {
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
         * <p>5</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        public static ListClusterKubeconfigStatesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListClusterKubeconfigStatesResponseBodyPage self = new ListClusterKubeconfigStatesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListClusterKubeconfigStatesResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListClusterKubeconfigStatesResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterKubeconfigStatesResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListClusterKubeconfigStatesResponseBodyStates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tom</p>
         */
        @NameInMap("account_display_name")
        public String accountDisplayName;

        /**
         * <strong>example:</strong>
         * <p>22855*****************</p>
         */
        @NameInMap("account_id")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>tom</p>
         */
        @NameInMap("account_name")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("account_state")
        public String accountState;

        /**
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        @NameInMap("account_type")
        public String accountType;

        /**
         * <strong>example:</strong>
         * <p>2027-07-15T01:32:20Z</p>
         */
        @NameInMap("cert_expire_time")
        public String certExpireTime;

        /**
         * <strong>example:</strong>
         * <p>Expired</p>
         */
        @NameInMap("cert_state")
        public String certState;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("revokable")
        public Boolean revokable;

        public static ListClusterKubeconfigStatesResponseBodyStates build(java.util.Map<String, ?> map) throws Exception {
            ListClusterKubeconfigStatesResponseBodyStates self = new ListClusterKubeconfigStatesResponseBodyStates();
            return TeaModel.build(map, self);
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountDisplayName(String accountDisplayName) {
            this.accountDisplayName = accountDisplayName;
            return this;
        }
        public String getAccountDisplayName() {
            return this.accountDisplayName;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountState(String accountState) {
            this.accountState = accountState;
            return this;
        }
        public String getAccountState() {
            return this.accountState;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setCertState(String certState) {
            this.certState = certState;
            return this;
        }
        public String getCertState() {
            return this.certState;
        }

        public ListClusterKubeconfigStatesResponseBodyStates setRevokable(Boolean revokable) {
            this.revokable = revokable;
            return this;
        }
        public Boolean getRevokable() {
            return this.revokable;
        }

    }

}
