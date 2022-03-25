// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserFindAllResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<UserFindAllResponseBodyContent> content;

    @NameInMap("Empty")
    public Boolean empty;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    @NameInMap("Number")
    public Long number;

    @NameInMap("NumberOfElements")
    public Long numberOfElements;

    @NameInMap("Pageable")
    public UserFindAllResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public UserFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static UserFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UserFindAllResponseBody self = new UserFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public UserFindAllResponseBody setContent(java.util.List<UserFindAllResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<UserFindAllResponseBodyContent> getContent() {
        return this.content;
    }

    public UserFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public UserFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public UserFindAllResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public UserFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public UserFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public UserFindAllResponseBody setPageable(UserFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public UserFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public UserFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UserFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public UserFindAllResponseBody setSort(UserFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public UserFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public UserFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public UserFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class UserFindAllResponseBodyContentRoles extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CompanyId")
        public Long companyId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static UserFindAllResponseBodyContentRoles build(java.util.Map<String, ?> map) throws Exception {
            UserFindAllResponseBodyContentRoles self = new UserFindAllResponseBodyContentRoles();
            return TeaModel.build(map, self);
        }

        public UserFindAllResponseBodyContentRoles setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UserFindAllResponseBodyContentRoles setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public UserFindAllResponseBodyContentRoles setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserFindAllResponseBodyContentRoles setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserFindAllResponseBodyContentRoles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserFindAllResponseBodyContentRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserFindAllResponseBodyContentRoles setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public UserFindAllResponseBodyContentRoles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UserFindAllResponseBodyContentRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UserFindAllResponseBodyContent extends TeaModel {
        @NameInMap("AliyunAccount")
        public String aliyunAccount;

        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("AliyunUidType")
        public String aliyunUidType;

        @NameInMap("CompanyId")
        public Long companyId;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Ext1")
        public String ext1;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentUid")
        public String parentUid;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Roles")
        public java.util.List<UserFindAllResponseBodyContentRoles> roles;

        @NameInMap("Status")
        public String status;

        public static UserFindAllResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UserFindAllResponseBodyContent self = new UserFindAllResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UserFindAllResponseBodyContent setAliyunAccount(String aliyunAccount) {
            this.aliyunAccount = aliyunAccount;
            return this;
        }
        public String getAliyunAccount() {
            return this.aliyunAccount;
        }

        public UserFindAllResponseBodyContent setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public UserFindAllResponseBodyContent setAliyunUidType(String aliyunUidType) {
            this.aliyunUidType = aliyunUidType;
            return this;
        }
        public String getAliyunUidType() {
            return this.aliyunUidType;
        }

        public UserFindAllResponseBodyContent setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public UserFindAllResponseBodyContent setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public UserFindAllResponseBodyContent setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UserFindAllResponseBodyContent setExt1(String ext1) {
            this.ext1 = ext1;
            return this;
        }
        public String getExt1() {
            return this.ext1;
        }

        public UserFindAllResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UserFindAllResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UserFindAllResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UserFindAllResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserFindAllResponseBodyContent setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public UserFindAllResponseBodyContent setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public UserFindAllResponseBodyContent setRoles(java.util.List<UserFindAllResponseBodyContentRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<UserFindAllResponseBodyContentRoles> getRoles() {
            return this.roles;
        }

        public UserFindAllResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UserFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static UserFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            UserFindAllResponseBodyPageableSort self = new UserFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public UserFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public UserFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public UserFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class UserFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public UserFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static UserFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            UserFindAllResponseBodyPageable self = new UserFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public UserFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public UserFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public UserFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public UserFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public UserFindAllResponseBodyPageable setSort(UserFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public UserFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public UserFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class UserFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static UserFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            UserFindAllResponseBodySort self = new UserFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public UserFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public UserFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public UserFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
