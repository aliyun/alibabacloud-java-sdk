// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKmsInstancesResponseBody extends TeaModel {
    /**
     * <p>A list of KMS instances.</p>
     */
    @NameInMap("KmsInstances")
    public ListKmsInstancesResponseBodyKmsInstances kmsInstances;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of KMS instances.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListKmsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKmsInstancesResponseBody self = new ListKmsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKmsInstancesResponseBody setKmsInstances(ListKmsInstancesResponseBodyKmsInstances kmsInstances) {
        this.kmsInstances = kmsInstances;
        return this;
    }
    public ListKmsInstancesResponseBodyKmsInstances getKmsInstances() {
        return this.kmsInstances;
    }

    public ListKmsInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListKmsInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListKmsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKmsInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListKmsInstancesResponseBodyKmsInstancesKmsInstance extends TeaModel {
        /**
         * <p>The ARN of the KMS instance.</p>
         */
        @NameInMap("KmsInstanceArn")
        public String kmsInstanceArn;

        /**
         * <p>The ID of the KMS instance.</p>
         */
        @NameInMap("KmsInstanceId")
        public String kmsInstanceId;

        public static ListKmsInstancesResponseBodyKmsInstancesKmsInstance build(java.util.Map<String, ?> map) throws Exception {
            ListKmsInstancesResponseBodyKmsInstancesKmsInstance self = new ListKmsInstancesResponseBodyKmsInstancesKmsInstance();
            return TeaModel.build(map, self);
        }

        public ListKmsInstancesResponseBodyKmsInstancesKmsInstance setKmsInstanceArn(String kmsInstanceArn) {
            this.kmsInstanceArn = kmsInstanceArn;
            return this;
        }
        public String getKmsInstanceArn() {
            return this.kmsInstanceArn;
        }

        public ListKmsInstancesResponseBodyKmsInstancesKmsInstance setKmsInstanceId(String kmsInstanceId) {
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }
        public String getKmsInstanceId() {
            return this.kmsInstanceId;
        }

    }

    public static class ListKmsInstancesResponseBodyKmsInstances extends TeaModel {
        @NameInMap("KmsInstance")
        public java.util.List<ListKmsInstancesResponseBodyKmsInstancesKmsInstance> kmsInstance;

        public static ListKmsInstancesResponseBodyKmsInstances build(java.util.Map<String, ?> map) throws Exception {
            ListKmsInstancesResponseBodyKmsInstances self = new ListKmsInstancesResponseBodyKmsInstances();
            return TeaModel.build(map, self);
        }

        public ListKmsInstancesResponseBodyKmsInstances setKmsInstance(java.util.List<ListKmsInstancesResponseBodyKmsInstancesKmsInstance> kmsInstance) {
            this.kmsInstance = kmsInstance;
            return this;
        }
        public java.util.List<ListKmsInstancesResponseBodyKmsInstancesKmsInstance> getKmsInstance() {
            return this.kmsInstance;
        }

    }

}
