// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filter")
    public java.util.List<DescribeCensRequestFilter> filter;

    @NameInMap("Tag")
    public java.util.List<DescribeCensRequestTag> tag;

    public static DescribeCensRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensRequest self = new DescribeCensRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCensRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCensRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCensRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCensRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCensRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCensRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCensRequest setFilter(java.util.List<DescribeCensRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeCensRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeCensRequest setTag(java.util.List<DescribeCensRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCensRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCensRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeCensRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensRequestFilter self = new DescribeCensRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeCensRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCensRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeCensRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCensRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensRequestTag self = new DescribeCensRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCensRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCensRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
