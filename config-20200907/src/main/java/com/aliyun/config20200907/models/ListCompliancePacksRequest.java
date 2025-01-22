// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePacksRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the compliance package to be queried. Valid values:</p>
     * <ul>
     * <li>ACTIVE: The compliance package is active.</li>
     * <li>CREATING: The compliance package is being created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListCompliancePacksRequestTag> tag;

    public static ListCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePacksRequest self = new ListCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public ListCompliancePacksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCompliancePacksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCompliancePacksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCompliancePacksRequest setTag(java.util.List<ListCompliancePacksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListCompliancePacksRequestTag> getTag() {
        return this.tag;
    }

    public static class ListCompliancePacksRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListCompliancePacksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListCompliancePacksRequestTag self = new ListCompliancePacksRequestTag();
            return TeaModel.build(map, self);
        }

        public ListCompliancePacksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCompliancePacksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
