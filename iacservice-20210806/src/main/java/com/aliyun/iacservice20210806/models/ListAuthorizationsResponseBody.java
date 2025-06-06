// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAuthorizationsResponseBody extends TeaModel {
    @NameInMap("authorizations")
    public java.util.List<ListAuthorizationsResponseBodyAuthorizations> authorizations;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C67A913A-2A0F-53F6-A041-56CC4CA1E593</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>72</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListAuthorizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationsResponseBody self = new ListAuthorizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationsResponseBody setAuthorizations(java.util.List<ListAuthorizationsResponseBodyAuthorizations> authorizations) {
        this.authorizations = authorizations;
        return this;
    }
    public java.util.List<ListAuthorizationsResponseBodyAuthorizations> getAuthorizations() {
        return this.authorizations;
    }

    public ListAuthorizationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationsResponseBodyAuthorizations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auth-433aead756057ffee37b763564fdd</p>
         */
        @NameInMap("authorizationId")
        public String authorizationId;

        /**
         * <strong>example:</strong>
         * <p>2022-06-16T03:41:34Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("dueTime")
        public String dueTime;

        /**
         * <strong>example:</strong>
         * <p>mod-395f8626622affff71ccbf5b25885</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>aadfaf</p>
         */
        @NameInMap("ownerUid")
        public Long ownerUid;

        /**
         * <strong>example:</strong>
         * <p>asdf123</p>
         */
        @NameInMap("uid")
        public Long uid;

        public static ListAuthorizationsResponseBodyAuthorizations build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationsResponseBodyAuthorizations self = new ListAuthorizationsResponseBodyAuthorizations();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationsResponseBodyAuthorizations setAuthorizationId(String authorizationId) {
            this.authorizationId = authorizationId;
            return this;
        }
        public String getAuthorizationId() {
            return this.authorizationId;
        }

        public ListAuthorizationsResponseBodyAuthorizations setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAuthorizationsResponseBodyAuthorizations setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public ListAuthorizationsResponseBodyAuthorizations setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListAuthorizationsResponseBodyAuthorizations setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListAuthorizationsResponseBodyAuthorizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthorizationsResponseBodyAuthorizations setOwnerUid(Long ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        public ListAuthorizationsResponseBodyAuthorizations setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
