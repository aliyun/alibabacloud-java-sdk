// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListAICPublicKeysResponseBody extends TeaModel {
    /**
     * <p>The current page number in the paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of records to display per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The list of public keys.</p>
     */
    @NameInMap("PublicKeys")
    public java.util.List<ListAICPublicKeysResponseBodyPublicKeys> publicKeys;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxsxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAICPublicKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAICPublicKeysResponseBody self = new ListAICPublicKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAICPublicKeysResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAICPublicKeysResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAICPublicKeysResponseBody setPublicKeys(java.util.List<ListAICPublicKeysResponseBodyPublicKeys> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }
    public java.util.List<ListAICPublicKeysResponseBodyPublicKeys> getPublicKeys() {
        return this.publicKeys;
    }

    public ListAICPublicKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAICPublicKeysResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAICPublicKeysResponseBodyPublicKeys extends TeaModel {
        /**
         * <p>The content of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>fvsvshbvjfksvj</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the public key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-09T15:13:21+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The group of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        @NameInMap("KeyGroup")
        public String keyGroup;

        /**
         * <p>The name of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The type of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>adb</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        public static ListAICPublicKeysResponseBodyPublicKeys build(java.util.Map<String, ?> map) throws Exception {
            ListAICPublicKeysResponseBodyPublicKeys self = new ListAICPublicKeysResponseBodyPublicKeys();
            return TeaModel.build(map, self);
        }

        public ListAICPublicKeysResponseBodyPublicKeys setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAICPublicKeysResponseBodyPublicKeys setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAICPublicKeysResponseBodyPublicKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAICPublicKeysResponseBodyPublicKeys setKeyGroup(String keyGroup) {
            this.keyGroup = keyGroup;
            return this;
        }
        public String getKeyGroup() {
            return this.keyGroup;
        }

        public ListAICPublicKeysResponseBodyPublicKeys setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ListAICPublicKeysResponseBodyPublicKeys setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

    }

}
