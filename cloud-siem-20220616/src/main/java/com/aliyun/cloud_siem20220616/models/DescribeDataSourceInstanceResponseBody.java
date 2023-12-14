// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDataSourceInstanceResponseBodyData data;

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
        @NameInMap("ParaCode")
        public String paraCode;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("DataSourceInstanceId")
        public String dataSourceInstanceId;

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
