// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyFindAllResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<CompanyFindAllResponseBodyContent> content;

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
    public CompanyFindAllResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public CompanyFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static CompanyFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyFindAllResponseBody self = new CompanyFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyFindAllResponseBody setContent(java.util.List<CompanyFindAllResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<CompanyFindAllResponseBodyContent> getContent() {
        return this.content;
    }

    public CompanyFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public CompanyFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public CompanyFindAllResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public CompanyFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public CompanyFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public CompanyFindAllResponseBody setPageable(CompanyFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public CompanyFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public CompanyFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompanyFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CompanyFindAllResponseBody setSort(CompanyFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public CompanyFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public CompanyFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public CompanyFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class CompanyFindAllResponseBodyContentExtraInfo extends TeaModel {
        @NameInMap("ExtInfoMap")
        public String extInfoMap;

        @NameInMap("IsvTypeEnumList")
        public java.util.List<String> isvTypeEnumList;

        @NameInMap("SupportTypeEnumList")
        public java.util.List<String> supportTypeEnumList;

        public static CompanyFindAllResponseBodyContentExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyFindAllResponseBodyContentExtraInfo self = new CompanyFindAllResponseBodyContentExtraInfo();
            return TeaModel.build(map, self);
        }

        public CompanyFindAllResponseBodyContentExtraInfo setExtInfoMap(String extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public String getExtInfoMap() {
            return this.extInfoMap;
        }

        public CompanyFindAllResponseBodyContentExtraInfo setIsvTypeEnumList(java.util.List<String> isvTypeEnumList) {
            this.isvTypeEnumList = isvTypeEnumList;
            return this;
        }
        public java.util.List<String> getIsvTypeEnumList() {
            return this.isvTypeEnumList;
        }

        public CompanyFindAllResponseBodyContentExtraInfo setSupportTypeEnumList(java.util.List<String> supportTypeEnumList) {
            this.supportTypeEnumList = supportTypeEnumList;
            return this;
        }
        public java.util.List<String> getSupportTypeEnumList() {
            return this.supportTypeEnumList;
        }

    }

    public static class CompanyFindAllResponseBodyContent extends TeaModel {
        @NameInMap("AccountNums")
        public String accountNums;

        @NameInMap("ContactPerson")
        public String contactPerson;

        @NameInMap("ExtraInfo")
        public CompanyFindAllResponseBodyContentExtraInfo extraInfo;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Status")
        public String status;

        public static CompanyFindAllResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CompanyFindAllResponseBodyContent self = new CompanyFindAllResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CompanyFindAllResponseBodyContent setAccountNums(String accountNums) {
            this.accountNums = accountNums;
            return this;
        }
        public String getAccountNums() {
            return this.accountNums;
        }

        public CompanyFindAllResponseBodyContent setContactPerson(String contactPerson) {
            this.contactPerson = contactPerson;
            return this;
        }
        public String getContactPerson() {
            return this.contactPerson;
        }

        public CompanyFindAllResponseBodyContent setExtraInfo(CompanyFindAllResponseBodyContentExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public CompanyFindAllResponseBodyContentExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public CompanyFindAllResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CompanyFindAllResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CompanyFindAllResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompanyFindAllResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompanyFindAllResponseBodyContent setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public CompanyFindAllResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CompanyFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static CompanyFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            CompanyFindAllResponseBodyPageableSort self = new CompanyFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public CompanyFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public CompanyFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public CompanyFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class CompanyFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public CompanyFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static CompanyFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            CompanyFindAllResponseBodyPageable self = new CompanyFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public CompanyFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public CompanyFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public CompanyFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public CompanyFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public CompanyFindAllResponseBodyPageable setSort(CompanyFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public CompanyFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public CompanyFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class CompanyFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static CompanyFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            CompanyFindAllResponseBodySort self = new CompanyFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public CompanyFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public CompanyFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public CompanyFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
