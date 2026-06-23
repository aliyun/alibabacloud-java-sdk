// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCustomAttributesResponseBody extends TeaModel {
    /**
     * <p>The paging information.</p>
     */
    @NameInMap("PagingInfo")
    public ListCustomAttributesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54594ACA-7976-5273-958B-02E15E9B867C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCustomAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAttributesResponseBody self = new ListCustomAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAttributesResponseBody setPagingInfo(ListCustomAttributesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCustomAttributesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCustomAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomAttributesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>A list of custom attribute objects.</p>
         */
        @NameInMap("CustomAttributes")
        public java.util.List<CustomAttribute> customAttributes;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCustomAttributesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAttributesResponseBodyPagingInfo self = new ListCustomAttributesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCustomAttributesResponseBodyPagingInfo setCustomAttributes(java.util.List<CustomAttribute> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public java.util.List<CustomAttribute> getCustomAttributes() {
            return this.customAttributes;
        }

        public ListCustomAttributesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCustomAttributesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCustomAttributesResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
