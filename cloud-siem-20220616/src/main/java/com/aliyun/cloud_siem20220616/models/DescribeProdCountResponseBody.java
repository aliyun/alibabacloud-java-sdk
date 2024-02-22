// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeProdCountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeProdCountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProdCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProdCountResponseBody self = new DescribeProdCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProdCountResponseBody setData(DescribeProdCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProdCountResponseBodyData getData() {
        return this.data;
    }

    public DescribeProdCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProdCountResponseBodyData extends TeaModel {
        /**
         * <p>The number of Alibaba Cloud services.</p>
         */
        @NameInMap("AliyunProdCount")
        public Integer aliyunProdCount;

        /**
         * <p>The number of Huawei Cloud services.</p>
         */
        @NameInMap("HcloudProdCount")
        public Integer hcloudProdCount;

        /**
         * <p>The number of Tencent Cloud services.</p>
         */
        @NameInMap("QcloudProdCount")
        public Integer qcloudProdCount;

        public static DescribeProdCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProdCountResponseBodyData self = new DescribeProdCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProdCountResponseBodyData setAliyunProdCount(Integer aliyunProdCount) {
            this.aliyunProdCount = aliyunProdCount;
            return this;
        }
        public Integer getAliyunProdCount() {
            return this.aliyunProdCount;
        }

        public DescribeProdCountResponseBodyData setHcloudProdCount(Integer hcloudProdCount) {
            this.hcloudProdCount = hcloudProdCount;
            return this;
        }
        public Integer getHcloudProdCount() {
            return this.hcloudProdCount;
        }

        public DescribeProdCountResponseBodyData setQcloudProdCount(Integer qcloudProdCount) {
            this.qcloudProdCount = qcloudProdCount;
            return this;
        }
        public Integer getQcloudProdCount() {
            return this.qcloudProdCount;
        }

    }

}
