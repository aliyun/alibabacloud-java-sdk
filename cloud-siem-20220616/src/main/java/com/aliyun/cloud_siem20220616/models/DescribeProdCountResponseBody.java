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
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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
        @NameInMap("AliyunImportedCount")
        public Integer aliyunImportedCount;

        /**
         * <p>The number of Alibaba Cloud services.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("AliyunProdCount")
        public Integer aliyunProdCount;

        @NameInMap("HcloudImportedCount")
        public Integer hcloudImportedCount;

        /**
         * <p>The number of Huawei Cloud services.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HcloudProdCount")
        public Integer hcloudProdCount;

        @NameInMap("IdcImportedCount")
        public Integer idcImportedCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IdcProdCount")
        public Integer idcProdCount;

        @NameInMap("QcloudImportedCount")
        public Integer qcloudImportedCount;

        /**
         * <p>The number of Tencent Cloud services.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("QcloudProdCount")
        public Integer qcloudProdCount;

        public static DescribeProdCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProdCountResponseBodyData self = new DescribeProdCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProdCountResponseBodyData setAliyunImportedCount(Integer aliyunImportedCount) {
            this.aliyunImportedCount = aliyunImportedCount;
            return this;
        }
        public Integer getAliyunImportedCount() {
            return this.aliyunImportedCount;
        }

        public DescribeProdCountResponseBodyData setAliyunProdCount(Integer aliyunProdCount) {
            this.aliyunProdCount = aliyunProdCount;
            return this;
        }
        public Integer getAliyunProdCount() {
            return this.aliyunProdCount;
        }

        public DescribeProdCountResponseBodyData setHcloudImportedCount(Integer hcloudImportedCount) {
            this.hcloudImportedCount = hcloudImportedCount;
            return this;
        }
        public Integer getHcloudImportedCount() {
            return this.hcloudImportedCount;
        }

        public DescribeProdCountResponseBodyData setHcloudProdCount(Integer hcloudProdCount) {
            this.hcloudProdCount = hcloudProdCount;
            return this;
        }
        public Integer getHcloudProdCount() {
            return this.hcloudProdCount;
        }

        public DescribeProdCountResponseBodyData setIdcImportedCount(Integer idcImportedCount) {
            this.idcImportedCount = idcImportedCount;
            return this;
        }
        public Integer getIdcImportedCount() {
            return this.idcImportedCount;
        }

        public DescribeProdCountResponseBodyData setIdcProdCount(Integer idcProdCount) {
            this.idcProdCount = idcProdCount;
            return this;
        }
        public Integer getIdcProdCount() {
            return this.idcProdCount;
        }

        public DescribeProdCountResponseBodyData setQcloudImportedCount(Integer qcloudImportedCount) {
            this.qcloudImportedCount = qcloudImportedCount;
            return this;
        }
        public Integer getQcloudImportedCount() {
            return this.qcloudImportedCount;
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
