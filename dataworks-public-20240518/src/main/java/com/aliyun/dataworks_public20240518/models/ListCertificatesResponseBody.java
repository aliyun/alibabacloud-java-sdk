// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCertificatesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListCertificatesResponseBodyPagingInfo pagingInfo;

    /**
     * <strong>example:</strong>
     * <p>ecb967ec-c137-48****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesResponseBody self = new ListCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertificatesResponseBody setPagingInfo(ListCertificatesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCertificatesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCertificatesResponseBodyPagingInfoCertificates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1730217600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>This is a file</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("FileSizeInBytes")
        public Long fileSizeInBytes;

        /**
         * <strong>example:</strong>
         * <p>676303114031776</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>ca1.crt</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListCertificatesResponseBodyPagingInfoCertificates build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesResponseBodyPagingInfoCertificates self = new ListCertificatesResponseBodyPagingInfoCertificates();
            return TeaModel.build(map, self);
        }

        public ListCertificatesResponseBodyPagingInfoCertificates setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCertificatesResponseBodyPagingInfoCertificates setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListCertificatesResponseBodyPagingInfoCertificates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCertificatesResponseBodyPagingInfoCertificates setFileSizeInBytes(Long fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            return this;
        }
        public Long getFileSizeInBytes() {
            return this.fileSizeInBytes;
        }

        public ListCertificatesResponseBodyPagingInfoCertificates setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCertificatesResponseBodyPagingInfoCertificates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListCertificatesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("Certificates")
        public java.util.List<ListCertificatesResponseBodyPagingInfoCertificates> certificates;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCertificatesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesResponseBodyPagingInfo self = new ListCertificatesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCertificatesResponseBodyPagingInfo setCertificates(java.util.List<ListCertificatesResponseBodyPagingInfoCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<ListCertificatesResponseBodyPagingInfoCertificates> getCertificates() {
            return this.certificates;
        }

        public ListCertificatesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCertificatesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCertificatesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
