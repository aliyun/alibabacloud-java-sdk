// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceTypesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDataSourceTypesResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
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
        /**
         * <p>The code of the multicloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>hcloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><p>obs: Huawei Cloud OBS.</p>
         * </li>
         * <li><p>wafApi: Tencent Cloud WAF download API.</p>
         * </li>
         * <li><p>ckafka: Tencent Cloud CKafka.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>obs</p>
         */
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
