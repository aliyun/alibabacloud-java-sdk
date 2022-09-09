// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAuthorizationsResponseBody extends TeaModel {
    @NameInMap("authorizations")
    public java.util.List<ListAuthorizationsResponseBodyAuthorizations> authorizations;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("authorizationId")
        public String authorizationId;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("dueTime")
        public String dueTime;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("ownerUid")
        public Long ownerUid;

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
