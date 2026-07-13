// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeProductDataRedundancyTypeStatResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeProductDataRedundancyTypeStatResponseBodyData data;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5748C531-80B1-5C31-8421-63A1830B9E48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProductDataRedundancyTypeStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductDataRedundancyTypeStatResponseBody self = new DescribeProductDataRedundancyTypeStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductDataRedundancyTypeStatResponseBody setData(DescribeProductDataRedundancyTypeStatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProductDataRedundancyTypeStatResponseBodyData getData() {
        return this.data;
    }

    public DescribeProductDataRedundancyTypeStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProductDataRedundancyTypeStatResponseBodyDataContent extends TeaModel {
        /**
         * <p>The data redundancy type.</p>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        @NameInMap("DataRedundancyType")
        public String dataRedundancyType;

        /**
         * <p>The resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceCount")
        public Long resourceCount;

        /**
         * <p>The storage class.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        public static DescribeProductDataRedundancyTypeStatResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductDataRedundancyTypeStatResponseBodyDataContent self = new DescribeProductDataRedundancyTypeStatResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public DescribeProductDataRedundancyTypeStatResponseBodyDataContent setDataRedundancyType(String dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        public DescribeProductDataRedundancyTypeStatResponseBodyDataContent setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public DescribeProductDataRedundancyTypeStatResponseBodyDataContent setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class DescribeProductDataRedundancyTypeStatResponseBodyData extends TeaModel {
        /**
         * <p>The list of records returned by the request.</p>
         */
        @NameInMap("Content")
        public java.util.List<DescribeProductDataRedundancyTypeStatResponseBodyDataContent> content;

        public static DescribeProductDataRedundancyTypeStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductDataRedundancyTypeStatResponseBodyData self = new DescribeProductDataRedundancyTypeStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProductDataRedundancyTypeStatResponseBodyData setContent(java.util.List<DescribeProductDataRedundancyTypeStatResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeProductDataRedundancyTypeStatResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
