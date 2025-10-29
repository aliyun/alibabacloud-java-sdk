// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListAICPublicKeyDeliveriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PublicKeyDeliverInfo")
    public java.util.List<ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo> publicKeyDeliverInfo;

    /**
     * <strong>example:</strong>
     * <p>xxxsxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAICPublicKeyDeliveriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAICPublicKeyDeliveriesResponseBody self = new ListAICPublicKeyDeliveriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAICPublicKeyDeliveriesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAICPublicKeyDeliveriesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAICPublicKeyDeliveriesResponseBody setPublicKeyDeliverInfo(java.util.List<ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo> publicKeyDeliverInfo) {
        this.publicKeyDeliverInfo = publicKeyDeliverInfo;
        return this;
    }
    public java.util.List<ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo> getPublicKeyDeliverInfo() {
        return this.publicKeyDeliverInfo;
    }

    public ListAICPublicKeyDeliveriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAICPublicKeyDeliveriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-10-09T15:13:21+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>aic-xxxx-0</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        @NameInMap("KeyGroup")
        public String keyGroup;

        /**
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <strong>example:</strong>
         * <p>adb</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        public static ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo self = new ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo();
            return TeaModel.build(map, self);
        }

        public ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo setKeyGroup(String keyGroup) {
            this.keyGroup = keyGroup;
            return this;
        }
        public String getKeyGroup() {
            return this.keyGroup;
        }

        public ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ListAICPublicKeyDeliveriesResponseBodyPublicKeyDeliverInfo setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

    }

}
