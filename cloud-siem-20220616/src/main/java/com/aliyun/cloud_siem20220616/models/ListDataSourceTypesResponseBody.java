// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceTypesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListDataSourceTypesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTypesResponseBody self = new ListDataSourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTypesResponseBody setData(java.util.List<ListDataSourceTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDataSourceTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListDataSourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourceTypesResponseBodyData extends TeaModel {
        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        public static ListDataSourceTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceTypesResponseBodyData self = new ListDataSourceTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSourceTypesResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListDataSourceTypesResponseBodyData setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

    }

}
