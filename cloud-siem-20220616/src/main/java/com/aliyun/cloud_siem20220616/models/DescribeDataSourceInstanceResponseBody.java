// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceInstanceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeDataSourceInstanceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataSourceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceInstanceResponseBody self = new DescribeDataSourceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceInstanceResponseBody setData(DescribeDataSourceInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDataSourceInstanceResponseBodyData getData() {
        return this.data;
    }

    public DescribeDataSourceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams extends TeaModel {
        /**
         * <p>The code of the parameter.</p>
         */
        @NameInMap("ParaCode")
        public String paraCode;

        /**
         * <p>The value of the parameter.</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        public static DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams self = new DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams setParaCode(String paraCode) {
            this.paraCode = paraCode;
            return this;
        }
        public String getParaCode() {
            return this.paraCode;
        }

        public DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

    }

    public static class DescribeDataSourceInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the cloud account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The code of the cloud service provider. Valid values:</p>
         * <br>
         * <p>*   qcloud: Tencent Cloud</p>
         * <p>*   aliyun: Alibaba Cloud</p>
         * <p>*   hcloud: Huawei Cloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.</p>
         */
        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

        /**
         * <p>The parameters of the data source.</p>
         */
        @NameInMap("DataSourceInstanceParams")
        public java.util.List<DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams> dataSourceInstanceParams;

        public static DescribeDataSourceInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceInstanceResponseBodyData self = new DescribeDataSourceInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceInstanceResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeDataSourceInstanceResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public DescribeDataSourceInstanceResponseBodyData setDataSourceInstanceId(String dataSourceInstanceId) {
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

        public DescribeDataSourceInstanceResponseBodyData setDataSourceInstanceParams(java.util.List<DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams> dataSourceInstanceParams) {
            this.dataSourceInstanceParams = dataSourceInstanceParams;
            return this;
        }
        public java.util.List<DescribeDataSourceInstanceResponseBodyDataDataSourceInstanceParams> getDataSourceInstanceParams() {
            return this.dataSourceInstanceParams;
        }

    }

}
